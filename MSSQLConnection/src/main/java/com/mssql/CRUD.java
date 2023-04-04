package com.mssql;

import java.sql.Connection;
import java.sql.Statement;

public class CRUD {

	public static void main(String[] args) {
		try
		{
			
			Connection cn = JDBCDemo.getConnection(); ;
			Statement s = cn.createStatement();
			s.execute("Insert into Practice.dbo.EMP_CHENNAI values(1,'Yogu',25000)");
			System.out.println("Record Inserted Successfully ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
