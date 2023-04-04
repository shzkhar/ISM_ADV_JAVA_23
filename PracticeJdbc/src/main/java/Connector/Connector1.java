 package Connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector1 {

	public static Connection getConnection()
	{
		Connection con = null;
	    try
	    {
	    	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			con = DriverManager.getConnection("jdbc:sqlserver://localhost:50996;Database=Practice; trustServerCertificate=true;","sa", "root");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    return con;
	}
	public static void main(String[] args) {
		Connection con = getConnection();
		
		if(con != null)
		{
			System.out.println("Connection Successfull");
		}
		else
		{
			System.out.println("Not Connect Please Check");
		}
	}
}
