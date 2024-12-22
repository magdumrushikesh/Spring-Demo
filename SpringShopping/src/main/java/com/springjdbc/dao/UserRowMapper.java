package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.beans.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User objUser = new User();
		
		objUser.setUnserName(rs.getString("username"));
		objUser.setPassword(rs.getString("password"));
		objUser.setName(rs.getString("name"));
		objUser.setEmail(rs.getString("email"));
		return objUser;
	}
	

}
