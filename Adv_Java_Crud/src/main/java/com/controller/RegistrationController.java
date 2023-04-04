package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.AbstractDocument.LeafElement;

import com.bean.UserBean;
import com.dao.UserDao;
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname = request.getParameter("firstname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		UserBean userBean = new UserBean();
		
		boolean iserror = false;
		
		//Validation For FirstName
		if(firstname==null || firstname.trim().length()==0)
		{
			iserror=true;
			request.setAttribute("firstname", "First Name Cant BeEmpty");
		}
		else if(firstname.trim().length() < 1 )
		{
			iserror=true;
			request.setAttribute("firstname", "Please Enter More Than One Character");
		}
		else
		{
			String alpha="[a-zA-Z]+";
			if(firstname.matches(alpha)==false)
			{
				iserror = true;
				request.setAttribute("firstname", "Please Enter Valid Name");
			}
			else {
				userBean.setFirstname(firstname);
				request.setAttribute("firstnamevalue", firstname);
			}
		}
		
		//Validation For Email
		if(email==null || email.trim().length()==0)
		{
			iserror=true;
			request.setAttribute("email", "Email Can't Be Empty");
		}
		else {
			String alpha="^(.+)@(\\S+)$";
			if(email.matches(alpha)==false)
			{
				iserror=true;
				request.setAttribute("email", "Please Enter Valid Email");
			}
			else {
				userBean.setEmail(email);
				request.setAttribute("emailvalue",email);
			}
		}
		
		
		//Validation For Password
		if(password==null || password.trim().length()==0)
		{
			iserror=true;
			request.setAttribute("password", "Password Can't Be Empty");
		}
		else {
			String alpha1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#*$%^&+=])(?=\\S+$).{8,}$";
			if(password.matches(alpha1)==false)
			{
				iserror=true;
				request.setAttribute("password", "Please Enter Strong Password");
			}
			else {
				userBean.setPassword(password);
				request.setAttribute("passwordvalue", password);
			}
		}
		
		request.setAttribute("user", userBean);
		
		RequestDispatcher rd = null;
		if(iserror)
		{
			rd = request.getRequestDispatcher("Registration.jsp");
		}
		else {
			UserDao userDao = new UserDao();
			userDao.addUser(userBean);
			
			rd = request.getRequestDispatcher("Login.jsp");
			
		}
		rd.forward(request, response);
	}
}
