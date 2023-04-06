package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
@WebServlet("/SearchController")
public class SearchController extends HttpServlet{


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  name = request.getParameter("search");
		
		ArrayList<UserBean> userBean = new UserDao().search(name);
		
		request.setAttribute("users", userBean);
		request.getRequestDispatcher("ListUser.jsp").forward(request, response);;
		
		
	}
	
}
