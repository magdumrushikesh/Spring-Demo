package com.springjdbc;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.beans.User;
import com.springjdbc.config.ApplicationConfiguration;
import com.springjdbc.dao.UserDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try(AnnotationConfigApplicationContext applicationContext =new
        		AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        		Scanner sc= new Scanner(System.in);
        		){
        	UserDao dao = (UserDao) applicationContext.getBean("userDao");
        	
//        	System.out.println("Enter your User Details");
//        	String userName = sc.next();
//        	String password = sc.next();
//        	String name = sc.next();
//        	String email = sc.next();
//        	
//        	boolean status =
//        			dao.registerUser(userName, password, name, email);
//        	if(status) {
//        		System.out.println("User Registration successfully");
//        	}
    
        	
        	
//      	System.out.println("Enter Details and password to change password");
//      	String userName = sc.next();
//    	String password = sc.next();
//        	boolean cp = dao.chnagePassword(userName, password);
//        	if(cp) {
//        		System.out.println("Password changed");
//        	}
        	
        	System.out.println("Print All data");
        	
        	ArrayList<User> list = dao.getAllUser();

        	list.forEach(i ->{
        		System.out.println("UserName: "+i.getUnserName());
        		System.out.println("Password: "+i.getPassword());
        		System.out.println("Name: "+i.getName());
        		System.out.println("Email: "+i.getEmail());
        	});
        	
        	
        	
        }
    }


}
