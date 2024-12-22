package com.springjdbc.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {
	
	@Autowired
	Environment env;
	
	public DataSource dataSource() {
		String driver=env.getProperty("db.connection.driverclass");
		String url=env.getProperty("db.connection.url");
		String user=env.getProperty("db.connection.username");
		String pwd=env.getProperty("db.connection.password");
		
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(pwd);
		return null;
	}

}
