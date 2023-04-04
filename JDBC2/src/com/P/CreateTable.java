package com.P;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "tiger");
			
			Statement s = c.createStatement();
			
			System.out.println(s.execute("insert into facebook.FACEBOOK1(id,name,pass,gender)values(1,'Sidhhant',125,'M')"));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
