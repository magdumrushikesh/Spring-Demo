package com.springjdbc.dao;

import java.util.ArrayList;

import com.springjdbc.beans.User;

public interface UserDao {
	boolean registerUser(String userName, String password,String name,String email);
	boolean chnagePassword(String userName, String password);
	User getUserDetails(String userName);
	ArrayList<User> getAllUser();
	

}
