package com.curd2;

import java.sql.*;

import com.curd.factory.JdbcConnectionFactory;

public class B_GettingDatabaseMetaData {

	public static void main(String[] args) {

		try (Connection connection = JdbcConnectionFactory.getConnection()) {

			System.out.println("conn is done");
			Statement stmt = connection.createStatement();
			
			//================DatabaseMetaData===================
			
			DatabaseMetaData dbMt=connection.getMetaData();
			System.out.println("driver driver:"+dbMt.getDriverName());
			System.out.println("driver version:"+dbMt.getDriverVersion());
			System.out.println("driver minor version:"+dbMt.getDriverMinorVersion());
			System.out.println("driver vendor name:"+dbMt.getDatabaseProductName());
			System.out.println(" user name:"+dbMt.getUserName());
			
			
			ResultSet rs = stmt.executeQuery("select * from product");
			
			//=================ResultSetMetaData==========
			ResultSetMetaData rsMt=rs.getMetaData();
			System.out.println("no of columns: "+ rsMt.getColumnCount());
			
			for(int i=1;i<=rsMt.getColumnCount(); i++) {
				System.out.println(rsMt.getColumnClassName(i)+": "+rsMt.getCatalogName(i));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
