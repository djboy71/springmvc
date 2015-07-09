package com.learning.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class HelloWorldController extends MultiActionController{

	public ModelAndView hello(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("msg", "hello()");
		return model;
		
	}
	
	
	public ModelAndView goodbye(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("msg", "goodbye()");
		return model;
		
	}
	
}
