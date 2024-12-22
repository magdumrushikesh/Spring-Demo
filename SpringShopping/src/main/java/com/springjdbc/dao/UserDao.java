package com.springjdbc.dao;

import java.util.ArrayList;

import com.springjdbc.beans.User;

public interface UserDao {
	boolean registerUser(String unserName, String password,String name,String email);
	boolean chnagePassword(String unserName, String password);
	User getUserDetails(String usernmae);
	ArrayList<User> getAllUser();
	

}
