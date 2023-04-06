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

@WebServlet("/EditUserController")
public class EditUserController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		UserDao userDao = new UserDao();
		UserBean user = userDao.getUserById(id);
		
		request.setAttribute("user", user);
		request.getRequestDispatcher("Edituser.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	    String name = request.getParameter("name");
		String email = request.getParameter("email");
		Integer userId = Integer.valueOf(request.getParameter("userId"));
		
		UserBean userBean = new UserBean();
		
		userBean.setFirstname(name);
		userBean.setEmail(email);
		userBean.setId(userId);
		
		new UserDao().updateUser(userBean);
		
		response.sendRedirect("ListUsersController");
	}

}
