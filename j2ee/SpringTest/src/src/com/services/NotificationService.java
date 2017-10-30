package com.services;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.attributeConstants.ActionTypeConstants;
import com.attributeConstants.VMConstants;
import com.beans.RiceOrderBean;

@Service
public class NotificationService extends BaseService {

	public static final Logger logger = LoggerFactory.getLogger(NotificationService.class);

	
	public String sendRiceOrderNotification(RiceOrderBean bean) throws Exception {
		String emailBody = getEmailBody(bean, VMConstants.VM_SEND_EMAIL_NOTIFICATION);

		HashMap<String, Object> myMap = getEmailMap(propBean.getEmailSubject(), bean.getEmail(), propBean.getCc(), null, emailBody, propBean.getFrom(), propBean.getReplyTo());
		logger.info("{}", myMap);
		Boolean status = sendEmailWithMultipleRecipents(myMap);
		return getAutoJSON_with_Status(ActionTypeConstants.ACTION_TYPE_RICE_ORDER, status);
	}
	
	
	public void sendEmail(String to, String body, String from) throws Exception {
		HashMap<String, Object> myMap = getEmailMap("Contact US", to, null, null, body, from, from);
		sendEmailWithMultipleRecipents(myMap);
	}

	

}
