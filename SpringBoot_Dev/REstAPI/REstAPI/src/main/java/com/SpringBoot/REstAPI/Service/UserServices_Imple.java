package com.SpringBoot.REstAPI.Service;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.REstAPI.DAo.DaoUsers_impl;
import com.SpringBoot.REstAPI.Model.Users;

@Service
public class UserServices_Imple implements UserServices
{
	@Autowired
	DaoUsers_impl dd;
	
	public List<Users> getAllusers()
	{
		return dd.GetallUsers();
	}
	
	

	public List<Users> getByid(int age1) {
		// TODO Auto-generated method stub
		System.out.println("---------- In service Implementation -AGE1--"+age1);
		return dd.Get_By_id(age1);
	}




}
