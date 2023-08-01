package com.curd2;

import java.sql.*;

import com.curd.factory.JdbcConnectionFactory;

public class D_BasicsOfTxMgt {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			connection = JdbcConnectionFactory.getConnection();

			connection.setAutoCommit(false);
			
			PreparedStatement pstmt=connection.prepareStatement("update accounts set balance = balance -10 where id=?");
			pstmt.setInt(1, 1);
			pstmt.executeUpdate();
			
			 pstmt=connection.prepareStatement("update accounts set balance = balance + 10 where id=?");
			pstmt.setInt(1, 2);
			pstmt.executeUpdate();
			
			connection.commit();
			
		} catch (SQLException ex) {
			
			ex.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	
	}

}
