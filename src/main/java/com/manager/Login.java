package com.manager;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.Main;

public class Login extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Manager isValid(String username,String password,Connection connnection) {
		Manager manager = null;
		try {
			PreparedStatement statement = connnection.prepareStatement("select * from Manager where username = ? and password = ?");
			statement.setString(1, username);
			statement.setString(2, password);
			
			ResultSet rs = statement.executeQuery();
			
			if(rs.next()==true) {
				manager = new Manager(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4),rs.getInt(5),rs.getString(9));
				return manager;
			}
			return manager;
		}catch(SQLException e) {
			System.out.println("Sql exception occured in the Login servelet of owner in inValid " + e.getMessage());
		}
		return manager;
	}
	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		//1. request comes to this server from ownerlogin form
		//2. check all the parameters passwd
		//3. check from the database
		//4. if user validated redirect to the owner home
		//5. else pass the error
		
		//Reduest dispatcher
		RequestDispatcher rd = null;
		
		Optional<String> username = Optional.ofNullable(req.getParameter("username"));
		Optional<String> password = Optional.ofNullable(req.getParameter("password"));
		
		//check if values are not null
		if(username.isPresent()==false || password.isPresent()==false) {
			//forward to the login with error message
			req.setAttribute("error", "Enter your username and password");
			rd = req.getRequestDispatcher("managerlogin");
			rd.forward(req, resp);
			
		}
		
		//check from the DB
		//get connection
		Connection connection = null;
		try {
			connection = Main.getConnection();
		}
		catch(Exception e) {
			//forward to the login with error message
			System.out.println("Error occured while getting the connection object " + e.getMessage());
			req.setAttribute("error", "Error in the application db please try again later");
			rd = req.getRequestDispatcher("managerlogin");
			rd.forward(req, resp);
		}
		
		//check if user exists
		Manager exist = isValid(username.get(), password.get(), connection);
		
		if(exist!=null) {
			//send forward to the owner home
			HttpSession session = req.getSession();
			session.setAttribute("manager", exist);
			resp.sendRedirect("managerhome");
		}
		
		//send forward to the owner login
		req.setAttribute("error", "Enter correct username and password");
		rd = req.getRequestDispatcher("managerlogin");
		rd.forward(req, resp);
	}
	
}
