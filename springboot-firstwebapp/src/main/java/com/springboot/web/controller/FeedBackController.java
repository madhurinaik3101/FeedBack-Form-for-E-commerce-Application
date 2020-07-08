package com.springboot.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.web.model.FeedBack;
import com.springboot.web.service.FeedBackService;


@RestController
public class FeedBackController {

	@Autowired
	FeedBackService service;



	@PostMapping("/feedback")
	public String addFeedBack(ModelMap model, @Valid FeedBack feedback, BindingResult result) {
		
		if(result.hasErrors()){
		 	return "Error in submitting the form !.....Try Again !";
		}
		
		else { 
		service.addFeedBack(feedback.getFname(),feedback.getLname(), feedback.getEmail(), feedback.getAddress(),feedback.getProduct(),feedback.getValue(),feedback.getSati(),feedback.getPros(),feedback.getChanges());
		return "Thanks for your feedback";
		}
	}
}
