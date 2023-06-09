package com.Dao;

import java.sql.Connection;
import java.sql.Statement;

import Connector.Connector1;
import EmployeeBean.EmployeeAttributes;

public class EmployeeDao {

	public static void main(String[] args) {
		EmployeeAttributes eb = new EmployeeAttributes(2,"Siddhant","82000","Python","TCS");
		
		EmployeeDao dao = new EmployeeDao();
		int rowaffected;
		
		rowaffected = insertData(eb);
		if(rowaffected > 0)
		{
			System.out.println("Record Inserted  :  "+rowaffected);
		}
		else
		{
			System.out.println("Record Not Inserted  :  "+rowaffected);
		}
		
	}
	
	public static int insertData(EmployeeAttributes e)
	{
		int rowaffected = 0;
		try
		{
			Connection c = Connector1.getConnection();
			
			Statement s = c.createStatement();
			rowaffected = s.executeUpdate("insert into Practice.dbo.EmployeeJava values('"+e.getId()+"','"+e.getName()+"','"+e.getSal()+"','"+e.getDesg()+"','"+e.getOrgname()+"')");
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return rowaffected;
	}
	
	public static void updateData()
	{
		
	}
}
