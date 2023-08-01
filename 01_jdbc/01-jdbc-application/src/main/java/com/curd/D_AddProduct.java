package com.curd;

import java.sql.*;

import com.curd.factory.JdbcConnectionFactory;

public class D_AddProduct {

	public static void main(String[] args) {

		try (Connection connection = JdbcConnectionFactory.getConnection()) {
			
			//Statement vs PreparedStatement vs CallableStatement
			
			PreparedStatement pstmt=connection.prepareStatement("insert into product(name, price) values (?,?)");
			
			//executeQuery vs executeUpdate
			pstmt.setNString(1, "rich dad poor dad");
			pstmt.setDouble(2, .2);
			
			int noOfRows= pstmt.executeUpdate();
			
			System.out.println(noOfRows);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
