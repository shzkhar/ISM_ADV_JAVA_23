package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.controller.RegistrationController;
import com.util.Validation;

public class RegistrationFilter implements Filter{

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("RegistrationFilter::Init()");
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String firstname = request.getParameter("firstname");
		
		boolean iserror=false;
		
		if(Validation.isEmpty(firstname))
		{
		    iserror=true;
		    request.setAttribute("error", "FirstName Can't BEEEE Be Empty");
		}
		else if(Validation.isAlpha(firstname))
		{
			iserror=true;
			request.setAttribute("error", "Please Enter Valid BEEEE First Name");
		}
		else if(Validation.checkLength(firstname))
		{
			iserror=true;
			request.setAttribute("error", "Please Enter More BEEEE Than One Character");
		}
		
		
		if(iserror)
		{
			request.getRequestDispatcher("Registration.jsp").forward(request, response);
		}
		else {
			chain.doFilter(request, response);
		}
	}
	
	public void destroy()
	{
		System.out.println("RegistrationFilter::Destroy()");
	}

}
