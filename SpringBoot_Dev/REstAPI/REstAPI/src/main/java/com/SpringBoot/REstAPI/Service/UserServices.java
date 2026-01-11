package com.SpringBoot.REstAPI.Service;

import java.util.List;

import com.SpringBoot.REstAPI.Model.Users;

public interface UserServices {
	public List<Users> getAllusers();
	public List<Users> getByid(int age3);
}
