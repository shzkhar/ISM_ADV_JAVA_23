package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationController")
public class Registration extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		//PrintWriter out = response.getWriter();
		//response.setContentType("text/html");
		
		
		
		
		
		boolean iserror = false;
		StringBuffer error = new StringBuffer("");
		
		     if(firstName == null || firstName.trim().length() == 0)
		     {
		    	 iserror = true;
		    	 error.append("<br>First Name Cant Be Empty");
		     }
		     else if(firstName.trim().length() <= 2)
		     {
		    	iserror = true;
		    	error.append("<br>Please Enter Greater That 2 Word");
		     }
		     else 
		     {
		    	 String alpha = "[a-zA-Z]+";
		    	if(firstName.matches(alpha)==false)
		    	{
		    		iserror = true;
		    		error.append("<br>Please Enter Valid First Name");
		    	}
		     }
		     if(email == null || email.trim().length() == 0)
		     {
		    	 iserror = true;
		    	 error.append("<br>Email Can't Be Empty");
		     }
		     else
		     {
		    	String alpha1 = "^(.+)@(\\S+)$";
		    	if(email.matches(alpha1)==false)
		    	{
		    		iserror = true;
		    		error.append("<br>Please enter Valid Mail");
		    	}
		     }
		     if(pass==null || pass.trim().length()==0)
		     {
		    	 iserror = true;
		    	 error.append("<br>PassWord Can't Be Empty");
		     }
		     else
		     {
		    	String alpha1 = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		    	if(pass.matches(alpha1)==false)
		    	{
		    		iserror = true;
		    		error.append("<br>Please enter Valid Password");
		    	}
		     }
		     
		     RequestDispatcher rd = null;
		     if(iserror )
		     {
		    	 
		    	 request.setAttribute("error", error.toString());
		    	 rd = request.getRequestDispatcher("Regi.jsp");
		    	 
		     }
		     else
		     {
		    	 rd = request.getRequestDispatcher("LoginPage.html");
		    	
		    	
			 }
		   
		   
		    rd.forward(request, response);
		   
		    
	}
	
}
