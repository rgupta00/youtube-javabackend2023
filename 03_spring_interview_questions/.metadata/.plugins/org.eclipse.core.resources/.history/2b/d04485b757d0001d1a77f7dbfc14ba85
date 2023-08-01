package com.productapp.util;
import java.io.*;
import java.sql.*;
import java.util.Properties;
public class JdbcConnectionFactory {

	private static Connection connection=null;
	
	private JdbcConnectionFactory() {}
	
	public static Connection getConnection() {
		
		Properties properties= new Properties();
		
		try {
			InputStream is=JdbcConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties");
			properties.load(is);
			
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String drivername=properties.getProperty("jdbc.drivername");
		String url=properties.getProperty("jdbc.url");
		String username=properties.getProperty("jdbc.username");
		String password=properties.getProperty("jdbc.password");
		
		
		try {
			Class.forName(drivername);
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection(url,username , password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
	}
	
}
