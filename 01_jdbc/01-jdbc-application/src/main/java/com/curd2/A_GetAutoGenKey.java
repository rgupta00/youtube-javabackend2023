package com.curd2;

import java.sql.*;

import com.curd.factory.JdbcConnectionFactory;

public class A_GetAutoGenKey {

	public static void main(String[] args) {

		try (Connection connection = JdbcConnectionFactory.getConnection()) {
			
			//Statement vs PreparedStatement vs CallableStatement
			
			String query="insert into product(name, price) values (?,?)";
			PreparedStatement pstmt=connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			
			//executeQuery vs executeUpdate
			pstmt.setNString(1, "keyboard");
			pstmt.setDouble(2, 1);
			
			int noOfRows= pstmt.executeUpdate();
			
			ResultSet rs=pstmt.getGeneratedKeys();
			if(rs.next()) {
				System.out.println("auto gen key:"+rs.getInt(1));
						
			}
			
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
