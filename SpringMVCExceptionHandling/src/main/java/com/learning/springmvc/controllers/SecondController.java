package com.learning.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springmvc.exceptions.CustomException;


@Controller
public class SecondController {

	@RequestMapping(value="/second", method=RequestMethod.GET)
	public ModelAndView second() throws CustomException {
		
		System.out.println("Throwing exception");
		throw new CustomException("This is a message from second controller");
		
	}
	
	
	@ExceptionHandler(CustomException.class)
	public ModelAndView handleCustomException(CustomException ex) {
		
		System.out.println("Handling exception");
		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("exception", ex);
		return model;
		
	}
	
}
