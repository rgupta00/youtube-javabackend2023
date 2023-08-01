package com.curd2;

import java.sql.*;

import com.curd.factory.JdbcConnectionFactory;

/*
 * 
driver is loaded
time taken: 4746 ms (20)

 * driver is loaded
time taken: 4701 ms (200)

driver is loaded
time taken: 4624 ms (2000)



 */
public class C_BatchProcessingJdbc {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		Connection connection = null;
		try {
			connection = JdbcConnectionFactory.getConnection();

			String query = "insert into mytable(name) values (?)";
			PreparedStatement pstmt = connection.prepareStatement(query);

			connection.setAutoCommit(false);

			for (int i = 1; i <= 10_0000; i++) {
				pstmt.setString(1, "foo " + i);
				pstmt.addBatch();
				if (i % 20 == 0) {
					pstmt.executeBatch();
				}
			}
			connection.commit();
		} catch (SQLException ex) {
			ex.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		long end = System.currentTimeMillis();
		System.out.println("time taken: " + (end - start) + " ms");
	}

}