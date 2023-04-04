package com.mssql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDemo {

	private static final String  URLNAME  = "jdbc:mysql://localhost:3306/java";
	private static final String  DRIVERCLASS= "com.mysql.cj.jdbc.Driver"; 
	private static final String  USERNAME = "root";
	private static final String  PASSWORD = "tiger";
	
	
	public static Connection getConnection()
	{
		Connection cn = null;
		try {
			  Class.forName(DRIVERCLASS);
			
			  cn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			  
			 
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
		
	}
	
//	public static void main(String[] args) {
//	Connection cn = getConnection();
//				if(cn!=null)
//				{
//					System.out.println("Connection Successfully");
//				}
//				else
//				{
//					System.err.println("Connection Faild");
//				}
//	}
	
}
