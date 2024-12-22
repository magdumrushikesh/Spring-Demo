package com.springjdbc.beans;

public class User {

	String unserName;
	String password;
	String name;
	String email;

	public User() {
		super();
	}

	public User(String unserName, String password, String name, String email) {
		super();
		this.unserName = unserName;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public String getUnserName() {
		return unserName;
	}

	public void setUnserName(String unserName) {
		this.unserName = unserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [unserName=" + unserName + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}

}
