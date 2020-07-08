package com.springboot.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.FeedBack;
import com.springboot.web.service.FeedBackService;
import com.springboot.web.service.LoginService;

@RestController
public class FeedBackController {

	@Autowired
	FeedBackService service;



	@PostMapping("/feedback")
	public String addFeedBack(ModelMap model, @Valid FeedBack feedback, BindingResult result) {
		
		service.addFeedBack(feedback.getFname(),feedback.getLname(), feedback.getEmail(), feedback.getAddress(),feedback.getProduct(),feedback.getValue(),feedback.getSati(),feedback.getPros(),feedback.getChanges());
		return "Thanks for your feedback";
	}
}
