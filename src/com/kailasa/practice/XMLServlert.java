package com.kailasa.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.HttpMethodConstraintElement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XMLServlert extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		String user = request.getParameter("user");
		printWriter.println("This is just a XML." + user);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		
		String user = request.getParameter("user");
		HttpSession session = request.getSession();
		
		if(user != "" && user != null){
			session.setAttribute("savedUser", user);
		}
		printWriter.println("User from Request" + user);
		printWriter.println("User from Session" + session.getAttribute("savedUser"));
		
	}
}
