package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Verify
 */
@WebServlet("/Verify")
public class Verify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Dao d = new Dao();
		ArrayList<String> info = d.select(username, password);
		if (info.size()==0) {
			PrintWriter out = response.getWriter();
			out.println("incorrect username or password");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("name",info);
			response.sendRedirect("Welcome.jsp");
		}
		
		
	}

}
