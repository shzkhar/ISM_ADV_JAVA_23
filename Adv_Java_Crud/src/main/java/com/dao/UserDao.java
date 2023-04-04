package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.UserBean;
import com.util.DbConnection;

public class UserDao {

	public void addUser(UserBean userBean)
	{
		Connection con = DbConnection.getConnection();
		
		try {
			PreparedStatement ps = con.prepareStatement("Insert into signup(name,email,pass)values(?,?,?)");
			
			ps.setString(1,userBean.getFirstname());
			ps.setString(2, userBean.getEmail());
			ps.setString(3, userBean.getPassword());
			
			int roeaffected = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public UserBean authenticate(String email, String password)
	{
		UserBean userBean = null;
		try {
			Connection con = DbConnection.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and pass=?");
		
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
			 userBean =new UserBean();
			 userBean.setFirstname(rs.getString("firstname"));
			 userBean.setId(rs.getInt("id"));
			 userBean.setEmail(rs.getString("email"));
			 userBean.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userBean;
		
	}
}
