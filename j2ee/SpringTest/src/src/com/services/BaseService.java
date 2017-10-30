package com.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.attributeConstants.EmailConstants;
import com.attributeConstants.VMConstants;
import com.beans.PropertiesBean;
import com.utility.EmailUtil;

@Service
public class BaseService extends ObjectMapperBase implements VMConstants {

	private static final Logger logger = LoggerFactory.getLogger(BaseService.class);

	@Autowired
	EmailUtil sendEmail;

	@Autowired
	VelocityEngine velocityEngine;

	@Autowired
	PropertiesBean propBean;

	@SuppressWarnings("rawtypes")
	protected String buildJSON_based_on_map(HashMap map) throws Exception {
		return mapper.writeValueAsString(map);
	}

	protected String buildRawJSON(List<?> obj) {
		String jsonString = "";
		try {
			jsonString = mapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonString;
	}

	protected String buildJSON(Boolean isSuccess, String listType, Object obj) {
		String jsonString = "";
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		// logger.debug(jsonString);
		return jsonString;
	}

	protected HashMap<String, Object> getEmailMap(String subject, Object to, Object cc, Object bcc, String emailBody, String replyTo,
			String from) {
		HashMap<String, Object> myMap = new HashMap<String, Object>();

		if (subject != null)
			myMap.put("subject", subject);
		else
			myMap.put(subject, "From Center Manager");

		myMap.put(EmailConstants.TO, to);
		myMap.put(EmailConstants.BCC, bcc);
		myMap.put(EmailConstants.CC, cc);
		myMap.put(EmailConstants.REPLYTO, replyTo);
		myMap.put(EmailConstants.FROM, from);
		myMap.put(EmailConstants.EMAILBODY, emailBody);

		return myMap;
	}

	protected HashMap<String, Object> getAttachementEmailMap(String subject, String to, String cc, String bcc, String emailBody,
			String replyTo, String from, CommonsMultipartFile attachement) {
		HashMap<String, Object> myMap = getEmailMap(subject, to, cc, bcc, emailBody, replyTo, from);
		myMap.put(EmailConstants.ATTACHMENT, attachement);

		return myMap;
	}

	protected String getEmailBody(Object bean, String vmName) {
		String signature = "";
		Map<String, Object> model = new HashMap<String, Object>();
		model.put(VM_BEAN, bean);
		if (signature != null && signature.length() > 0)
			model.put(VM_SIGNATURE, signature);
		else
			model.put(VM_SIGNATURE, "Thank you");
		String emailBody = VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, vmName, model);

		return emailBody;
	}

	protected Boolean sendEmailWithMultipleRecipents(HashMap<String, Object> myMap) {
		logger.debug("Start Sending Email.");
		// myMap = pramotionService.filterUnsubscribeList(myMap);
		return sendEmail.sendEmailWithMultipleRecipants(myMap);
	}

	public static Boolean isAppRunningOnLocalTomcat(HttpServletRequest request) {
		Boolean isRunninLocal = false;

		String url = request.getRequestURL().toString();

		if (url != null && url.length() > 0 && url.indexOf("localhost") != -1)
			isRunninLocal = true;
		return isRunninLocal;
	}

	public String getJSON_with_Status(Boolean status, String msgName, String msgValue) {
		if (status)
			return "{\"success\": true, \"" + msgName + "\" :\"" + msgValue + "\"}";
		else
			return "{\"success\": false, \"" + msgName + "\" :\"" + msgValue + "\"}";
	}

	public String getJSON_with_Status(Boolean status, String msg) {
		if (status)
			return "{\"success\": true, \"status\" :\"" + msg + "\"}";
		else
			return "{\"success\": false, \"status\" :\"" + msg + "\"}";
	}

	public String getJSON_Basic(Boolean status) {
		if (status)
			return "{\"success\": true}";
		else
			return "{\"success\": false}";
	}

	public String getAutoJSON_with_Status(String msg, Boolean status) {

		if (status)
			return "{\"success\":" + "true" + ", \"status\" :\"" + msg + " : SUCCESS" + "\"}";
		else
			return "{\"success\":" + "false" + ", \"status\" :\"" + msg + " : FAILED" + "\"}";
	}

	public String getJSON_FOR_CALANDER(String msg, Boolean status, String id) {
		if (status)
			return "{\"success\":" + "true" + ", \"info\" :\"" + msg + "\", \"id\" : \"" + id + "\"}";
		else
			return "{\"success\":" + "false" + ", \"info\" :\"" + msg + "\", \"id\" : \"" + id + "\"}";
	}

	public String getAutoJSON_with_QStatus(String msg, Boolean status) {

		if (status)
			return "{\"success\":" + "true" + ", \"status\" :\"" + msg + " : Queued" + "\"}";
		else
			return "{\"success\":" + "false" + ", \"status\" :\"" + msg + " : Fail to Que" + "\"}";
	}

	protected boolean isValidPhoneNumber(String mobileNumber) {
		if (mobileNumber == null || (mobileNumber != null && mobileNumber.length() < 9))
			return false;
		Pattern pattern = Pattern.compile("\\d{10}");
		Matcher matcher = pattern.matcher(mobileNumber);
		if (matcher.matches()) {
			return true;
		} else {
			return false;
		}

	}

}
