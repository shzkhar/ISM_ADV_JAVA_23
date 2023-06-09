  package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.mssql.JDBCDemo;

import Bean.EmployeeBean;

public class EmployeeDao {

	static Scanner sc = new Scanner(System.in);
	public int insert(EmployeeBean e)
	{
		String insertquery = "insert into dbo.EmployeeJava(id,name,sal,desg,orgname) values('"+e.getId()+"','"+e.getName()+"','"+e.getSal()+"','"+e.getDesg()+"','"+e.getOrgname()+"')";
		
		Connection c = JDBCDemo.getConnection();
		
		Statement st;
		int rowaffected = 0;
	    
		if(c!=null)
		{
			try
	    	{
	    		st = c.createStatement();
	    		rowaffected = st.executeUpdate(insertquery);
	    		
	    	}
	    	catch(Exception ex)
	    	{
	    		ex.printStackTrace();
	    	}
		}
		else
		{
			System.out.println("EmployeeDao --Don't Connected");
		}
		return rowaffected;
	    }
	
	
	public static int update(EmployeeBean e)
	{

		String insertquery = "update dbo.EmployeeJava set name = 'Yogendra' where id = 1";
		Connection c = JDBCDemo.getConnection();
		
		Statement st = null;
		int rowaffected = 0;
	    
		if(c!=null)
		{
			try
	    	{
	    		st = c.createStatement();
	    		rowaffected = st.executeUpdate(insertquery);
	    		
	    	}
	    	catch(Exception ex)
	    	{
	    		ex.printStackTrace();
	    	}
		}
		else
		{
			System.out.println("EmployeeDao --Don't Connected");
		}
		return rowaffected;	
	}
	
	public static int delete(EmployeeBean e)
	{
        String insertquery = "delete from dbo.EmployeeJava where id = 1";
		
		Connection c = JDBCDemo.getConnection();
		
		Statement st = null;
		int rowaffected = 0;
	    
		if(c!=null)
		{
			try
	    	{
	    		st = c.createStatement();
	    		rowaffected = st.executeUpdate(insertquery);
	    		
	    	}
	    	catch(Exception ex)
	    	{
	    		ex.printStackTrace();
	    	}
		}
		else
		{
			System.out.println("EmployeeDao --Don't Connected");
		}
		return rowaffected;	
	}
	
	public static ArrayList<EmployeeBean> getAllrecords()
	{
	    String selectquery = "select * from dbo.EmployeeJava";
	    
	    Connection c = JDBCDemo.getConnection();
	    Statement st = null;
	    ResultSet rs = null;
	    EmployeeBean ebean = null;
	    ArrayList<EmployeeBean> al = new ArrayList<EmployeeBean>();
	    
	    if(c!=null)
	    {
	    	try
	    	{
	    		st = c.createStatement();
	    		rs = st.executeQuery(selectquery);
	    		while(rs.next())
	    		{
	    			int id = rs.getInt(1);
	    			String name = rs.getString(2);
	    			int sal = rs.getInt(3);
	    			String desg = rs.getString(4);
	    			String orgname = rs.getString(5);
	    			
	    			ebean = new EmployeeBean(id,name,sal,desg,orgname);
	    			
	    			al.add(ebean);
	    		}
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    return al;
	}
	
	public static void main(String[] args) {
		EmployeeBean e1 = new EmployeeBean(5,"Darshit",25000,"Python","OmniMd");
		
		EmployeeDao dao =new  EmployeeDao();
		ArrayList al1 = new ArrayList();
		
		for(;;)
		{
			System.out.println("1.Insert   2.Update   3.Delete 4.Get All Record");
			int rowaffected;
			switch(sc.nextInt())
			{
			case 1 :
				 rowaffected = dao.insert(e1);
				if(rowaffected > 0)
				{
					System.out.println("Record Inserted  "+rowaffected);
				}
				else
				{
					System.out.println("Record Not Inserted  "+rowaffected);
				}
				break;
				
			case 2 :
				rowaffected = update(e1);
				if(rowaffected > 0)
				{
					System.out.println("Record Updated  "+rowaffected);
				}
				else
				{
					System.out.println("Record Not Updated  "+rowaffected);
				}
				break;
				
			case 3 :
				rowaffected = dao.delete(e1);
				if(rowaffected > 0)
				{
					System.out.println("Record Updated  "+rowaffected);
				}
				else
				{
					System.out.println("Record Not Updated  "+rowaffected);
				}
				break;
			case 4 :
				
				al1 = dao.getAllrecords();
				
				for(int i=0;i<al1.size();i++)
				{
					EmployeeBean ebean = (EmployeeBean) al1.get(i);
					System.out.println(ebean.getId() + " " +ebean.getName() +" " +ebean.getSal() + " " +ebean.getOrgname());
				}
				
				
			}
		}
		 
	}
}

