package com.RestAPI.mysqL.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.RestAPI.mysqL.Model.Users;

@Repository
public class User_Repo_Imple implements Users_Repo{

	@Autowired
	JdbcTemplate jdbctemp;
	
	@Autowired
	CALLBACKIMPLEMENTATION cbipl;
	
	
// Below are the Query for database...	
	String SelectAll = "select * from usera";
	String insertdata ="insert into usera(age,name) values(?,?)";
	String delete = "delete from usera where age =?";
	String selectById ="select * from usera where age=?";
	
	public List<Users> GetAllUsers() {
		// TODO Auto-generated method stub
		
		List<Users> aa = jdbctemp.query(SelectAll,new BeanPropertyRowMapper(Users.class));
		return aa;
	}

	
	public Boolean Addusers(Users user1) {
		Boolean zz;
		// TODO Auto-generated method stub
		//System.out.println(user1.getAge() +"---"+user1.getName());
// BELOW ONE USING THE 
		//int aa =jdbctemp.update(insertdata, user1.getAge(),user1.getName());
		
// BELOW ON USING EXEUCTE  AND USING OF PREPAREDSTATEMENTCALLBACK INTERFACE.
			/*return jdbctemp.execute(insertdata, new PreparedStatementCallback<Boolean>() {
			
				public Boolean doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException { 
					ps.setInt(1, user1.getAge());
					ps.setString(2, user1.getName());
					return ps.execute();
				}
			});*/
		
		return jdbctemp.execute(insertdata, new CALLBACKIMPLEMENTATION(user1));
		
		
		
	}
	


	
	public int deleteRecords(int age3) {
		int aa= jdbctemp.update(delete, age3);
		return aa;
	}
	
	public List<Users> FetchById(int agg99)
	{
		
		return  jdbctemp.query(selectById, BeanPropertyRowMapper.newInstance(Users.class), agg99);
		
		
	}

}
