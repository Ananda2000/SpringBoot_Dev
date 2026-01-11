package com.api.TODO_LIST_J_u_5_PRACTICE.Services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorld_Service 
{
	
	public String NameReturn(String name)
	{
		System.out.println("Name returns $$$$$$$"+name);
		return name;
	}

}
