package com.SpringBoot.REstAPI.DAo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.SpringBoot.REstAPI.Model.Users;

@Repository
public class DaoUsers_impl {
	
	
	public List<Users> add()
	{
ArrayList<Users> arr = new ArrayList();
		
		Users aa = new Users();
		aa.setAge(35);
		aa.setName("anand");
		arr.add(aa);
		 
		Users aa1 = new Users();
		aa1.setAge(23);
		aa1.setName("Soma");
		
		arr.add(aa1);
		return arr;
	}
	
	public List<Users> GetallUsers()
	{
		ArrayList<Users> arr1 = new ArrayList();
		arr1=(ArrayList<Users>) add();
		
		return arr1;

	}
	
	public List<Users> Get_By_id(int age)
	{
		Users aa2 = new Users();
		ArrayList<Users> arr1 = new ArrayList();
		arr1=(ArrayList<Users>) add();
		Users aa = new Users();
		int j =arr1.size();
		for(int i=0;i<j;i++)
		{
			int aggg =arr1.get(i).getAge();
			System.out.println("======="+aggg);
			System.out.println("======="+age);
			if(aggg == age)
			{
				System.out.println("Inside IF loop --"+aggg);
				aa2.setAge(arr1.get(i).getAge());
				System.out.println(" ----1");
				aa2.setName(arr1.get(i).getName());
				arr1.removeAll(arr1);
				arr1.add(aa2);
				//break;
				}
		}
		return arr1;
		
		
		
		
	}

}
