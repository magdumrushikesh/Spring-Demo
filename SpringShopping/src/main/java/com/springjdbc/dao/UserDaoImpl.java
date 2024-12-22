package com.springjdbc.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.beans.User;

import jakarta.annotation.PostConstruct;

@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String sqlRegister;
	String sqlChangePassword;
	String sqlAllUser;
	String sqlUserDetails;
	
	@Autowired
	Environment env;
	
	@PostConstruct
	public void initialize() {
		
		sqlRegister=env.getProperty("sql.register");
		sqlChangePassword=env.getProperty("sql.chnagepassword");
		sqlAllUser=env.getProperty("sql.alluser");
		sqlUserDetails=env.getProperty("sql.userdetailss");
	}

	@Override
	public boolean registerUser(String userName, String password, String name, String email) {
		jdbcTemplate.update(sqlRegister,userName,password,name,email);
		return true;
	}

	@Override
	public boolean chnagePassword(String userName, String password) {
		jdbcTemplate.update(sqlChangePassword,password,userName);
		return true;
	}

	@Override
	public User getUserDetails(String userName) {
			
		return null;
	}

	@Override
	public ArrayList<User> getAllUser() {

		return (ArrayList<User>) jdbcTemplate.query(sqlAllUser,
				new UserRowMapper()).iterator();
	}

}
