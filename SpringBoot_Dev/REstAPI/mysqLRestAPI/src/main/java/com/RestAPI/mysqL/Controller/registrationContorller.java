package com.RestAPI.mysqL.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestAPI.mysqL.Model.Users;
import com.RestAPI.mysqL.Repository.Users_Repo;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@RestController
@RequestMapping("/registration")
public class registrationContorller {

	@Autowired
	Users_Repo us_rep;

	// REQUEST MAP USING FOR HEADERS AND RESPONSE HEADER AND  DISPLAY OF ALL DATA FROM DATABASE.
	// HERE WE ARE USING RESPONSEENTITY CLASS ...
	@GetMapping("/displayAllUsers")
	public ResponseEntity<List<Users>> Getalllist(@RequestHeader Map<String,String> headers )
	{
		HttpHeaders hh = new HttpHeaders();
		hh.set("Myname", "AnandaKR");
		for (Map.Entry<String, String>  aaa : headers.entrySet()) {
			System.out.println(aaa.getKey() +"----"+aaa.getValue());
			System.out.println(us_rep.GetAllUsers());
			System.out.println("size of array --"+ us_rep.GetAllUsers().size());
		}
		
		//return (ResponseEntity<Users>) us_rep.GetAllUsers();
		if(us_rep.GetAllUsers().size() == 0)
		{
			System.out.println("This is null loop++++++++++++++++++++++++++++++++++++++++++++++");
			return ResponseEntity.noContent().headers(hh).build();
		}
		else
		{
			
		return  ResponseEntity.ok().headers(hh).body(us_rep.GetAllUsers());
		
		}
		
	}

// HERE WE PERFORM GETCALL , RETRIVE SINGLE HEADER AND USE OF DEFAULT AND VALUE ATTRIBUTES..
	/*@GetMapping("/displayAllUsers")
	public List<Users> Getalllist(@RequestHeader(value="Connection", required=true) String conn)
	{
		System.out.println("The connection name is ---"+conn);
		List<Users> GGG = new ArrayList();
		GGG = us_rep.GetAllUsers();
		return GGG;
	}*/
	
// HERE JUST RESPONDING HEADERS, AND HARD CODED BODY...
	/*@GetMapping("/displayAllUsers")
	public ResponseEntity<String> getheaderFromMethod()
	{
		HttpHeaders hh = new HttpHeaders();
		hh.set("Myname", "Anandakr");
		return ResponseEntity.ok().headers(hh).body("gg ,kk");
	}*/
	
// USING POST METHOD TO UPDATED THE DATA....
	@PostMapping("/addUser")
	public String UseOfPostCall(@RequestBody Users user)
	{
		boolean gg=us_rep.Addusers(user);
		String aa;
		if(gg ==false)
		{
			aa= "Added successfully";
		}
		else
		{
			aa="Not added successfully check the error";
		}
		return aa;
	}
	
// DELETE THE RECORDS USING DELETE CALLS.
	@DeleteMapping("/deleteUser/{age1}")
	public String deletingRecords(@PathVariable("age1") int age)
	{
		int gg =us_rep.deleteRecords(age);
		String rett;
		if(gg >0)
		{
			rett ="Record Deleted successfully";
		}
		else
		{
			rett ="Record not deleted successfully";
		}
		return rett;
	}
	
// SELECT BY USING ID, GET CALL ..
	
	@GetMapping("getid/{age23}")
	public List<Users> FetchByid(@PathVariable("age23")int age33)
	{
		return us_rep.FetchById(age33);
	}
	
}
