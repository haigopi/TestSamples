package com.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.beans.RiceOrderBean;

@Controller
public class NotificationsController extends BaseController {

	private String jsonData = "";

	@RequestMapping(value = "/riceOrder.order", method = RequestMethod.POST)
	ModelAndView sendRiceOrderNotification(@ModelAttribute RiceOrderBean riceOrderBean, HttpServletRequest request, HttpServletResponse response) throws JsonGenerationException, JsonMappingException, IOException, Exception {
		jsonData = "";
		jsonData = notificationService.sendRiceOrderNotification(riceOrderBean);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("order");;
		return mv;
		//writeJSONDataToResponse(response, jsonData);
	}

}
