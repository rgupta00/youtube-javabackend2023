package com.curd;

import java.sql.*;

import com.curd.factory.JdbcConnectionFactory;

public class F_DeleteProduct {

	public static void main(String[] args) {

		try (Connection connection = JdbcConnectionFactory.getConnection()) {
			
			//Statement vs PreparedStatement vs CallableStatement
			
			PreparedStatement pstmt=connection.prepareStatement("delete from product where id=?");
		
			pstmt.setInt(1, 3);
			
			int noOfRows= pstmt.executeUpdate();
			
			System.out.println(noOfRows);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
