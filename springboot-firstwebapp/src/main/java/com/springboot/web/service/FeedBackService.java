package com.springboot.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.springboot.web.model.FeedBack;


@Service

public class FeedBackService {
	
	@Autowired
	private MyRepo repo;
	
    private static List<FeedBack> feedback = new ArrayList<FeedBack>();
 

    public void addFeedBack(String fname,String lname,String email, String address,String product,String value, String sati,String pros,String changes) {
        feedback.add(new FeedBack(fname,lname,email,address,product,value,sati,pros,changes));
        repo.save(feedback);
    }

   
    
}
