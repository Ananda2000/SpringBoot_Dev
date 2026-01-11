package com.RestAPI.mysqL.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Service;

import com.RestAPI.mysqL.Model.Users;
@Service
public class CALLBACKIMPLEMENTATION implements PreparedStatementCallback<Boolean>{

	Users uss;
	public CALLBACKIMPLEMENTATION()
	{
		
	}
	
	
	public CALLBACKIMPLEMENTATION(Users uss)
	{
		this.uss = uss;
		
	}
	public  Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		System.out.println(uss.getAge());
		System.out.println(uss.getName());
		ps.setInt(1, uss.getAge());
		ps.setString(2, uss.getName());
		ps.setLong(3, uss.getPhone_number());
		return ps.execute();
	}

}
