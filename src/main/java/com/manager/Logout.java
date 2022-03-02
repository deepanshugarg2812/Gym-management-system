package com.manager;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		//1. set the manager to null
		//2. redirect to the managerlogin
		
		req.getSession().setAttribute("manager", null);
		resp.sendRedirect("managerlogin");
	}
}
