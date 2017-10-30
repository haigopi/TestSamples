package com.controllers;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.server.ServletServerHttpResponse;
import org.springframework.stereotype.Controller;

import com.services.BaseService;
import com.services.NotificationService;

@Controller
public class BaseController {

	private static final Logger logger = LoggerFactory.getLogger(BaseController.class);

	private AbstractHttpMessageConverter<String> stringHttpMessageConverter = new StringHttpMessageConverter();
	private MediaType jsonMimeType = MediaType.APPLICATION_JSON;


	@Autowired
	protected NotificationService notificationService;

	@Autowired
	protected BaseService baseService;



	protected void writeJSONDataToResponse(HttpServletResponse response,
			String jsonData) {

		if (stringHttpMessageConverter.canWrite(String.class, jsonMimeType)) {
			try {
				stringHttpMessageConverter.write(jsonData, jsonMimeType,
						new ServletServerHttpResponse(response));
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}

		}
	}

}
