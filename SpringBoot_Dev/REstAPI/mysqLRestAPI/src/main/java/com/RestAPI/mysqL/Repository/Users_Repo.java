package com.RestAPI.mysqL.Repository;

import java.util.List;

import com.RestAPI.mysqL.Model.Users;

public interface Users_Repo {
	
	public List<Users> GetAllUsers();
	public Boolean Addusers(Users user2);
	public int deleteRecords(int age);
	public List<Users> FetchById(int age00);

}
