package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1 {

	private static final String  URLNAME = "com.mysql.cj.jdbc.Driver"; 
	private static final String  DRIVERCLASS = "jdbc:mysql://localhost/Facebook";
	private static final String  USERNAME = "root";
	private static final String  PASSWORD = "tiger";
	
	public static Connection getConnection()
	{
		java.sql.Connection cn = null;
		try {
			  Class.forName(URLNAME);
			
			  cn = DriverManager.getConnection(DRIVERCLASS, USERNAME, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
		
	}
	
	public static void main(String[] args) {
	Connection cn = getConnection();
				if(cn!=null)
				{
					System.out.println("Connection Successfully");
				}
				else
				{
					System.err.println("Connection Faild");
				}
	}
}
