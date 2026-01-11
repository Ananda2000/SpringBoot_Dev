package com.SpringBoot.REstAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.REstAPI.Model.Users;
import com.SpringBoot.REstAPI.Service.UserServices_Imple;

@RestController
public class Service_contorller {
	
	@Autowired
	UserServices_Imple usr_service;
	//Users users;
	
	@GetMapping("/getcall")
	public List<Users> getuserlist(@RequestHeader("Accept-Language") String acceptLanguage1)
	{
		System.out.println("This is language --"+acceptLanguage1);
		return usr_service.getAllusers();
		
		//return "This is testing..";
		//System.out.println("this is end.. it should return it..");
	}
	
	@GetMapping("/getbyid/{age1}")
	public List<Users> gegByidController(@PathVariable ("age1") int age)
	{
		System.out.println("--------- Controller GET BY ID ----"+age);
		return usr_service.getByid(age);
		
	}
	
	

}
