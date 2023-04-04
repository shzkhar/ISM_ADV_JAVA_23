package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String str = request.getParameter("operation");
		int FirstNo = Integer.parseInt(request.getParameter("firstNumber"));
		int SecondNo = Integer.parseInt(request.getParameter("secondNumber"));
		
		//int a = FirstNo+SecondNo;
		//int s = FirstNo-SecondNo;
		//int m = FirstNo*SecondNo;
		//int d = FirstNo/SecondNo;
		
		if(str.equals("add"))
		{
			System.out.println("FirstNo  :  "+FirstNo);
			System.out.println("SeconfNo  :  "+SecondNo);
			System.out.println("Ans  :  "+(FirstNo+SecondNo));
			
			out.println("<html><body>");
			
			
			out.println(FirstNo +"   +   "+SecondNo+"  =  "+(FirstNo+SecondNo));
			out.println("</html></body>");
		}
		else if(str.equals("sub"))
		{
			System.out.println("FirstNo  :  "+FirstNo);
			System.out.println("SeconfNo  :  "+SecondNo);
			System.out.println("Ans  :  "+(FirstNo-SecondNo));	
			
			out.println("<html><body>");
			out.println(FirstNo +"   -   "+SecondNo+"  =  "+(FirstNo-SecondNo));
			out.println("</html></body>");
		}
		else if(str.equals("mul"))
		{
			System.out.println("FirstNo  :  "+FirstNo);
			System.out.println("SeconfNo  :  "+SecondNo);
			System.out.println("Ans  :  "+(FirstNo*SecondNo));
			
			out.println("<html><body>");
			out.println(FirstNo +"   *   "+SecondNo+"  =  "+(FirstNo*SecondNo));
			out.println("</html></body>");
		}
				
		else if(str.equals("div"))
		{
			System.out.println("FirstNo  :  "+FirstNo);
			System.out.println("SeconfNo  :  "+SecondNo);
			System.out.println("Ans  :  "+(FirstNo/SecondNo));
			
			out.println("<html><body>");
			out.println(FirstNo +"   /   "+SecondNo+"  =  "+(FirstNo/SecondNo));
			out.println("</html></body>");
		}
		
	}
	
}
