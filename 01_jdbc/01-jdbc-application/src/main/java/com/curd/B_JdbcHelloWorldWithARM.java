package com.curd;

import java.sql.*;

public class B_JdbcHelloWorldWithARM {

	public static void main(String[] args) {
		// i want to connect to youtubedb db and table is product

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtubedb", "root", "root")) {
		
			System.out.println("conn is done");
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ": " + rs.getString(2) + ": " + rs.getDouble(3));
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} 
	}

}
