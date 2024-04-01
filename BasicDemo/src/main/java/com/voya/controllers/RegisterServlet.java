package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("name"); 
		String city = request.getParameter("city"); 
		String sal = request.getParameter("salary"); 
		double salary = Double.parseDouble(sal);
		String mob = request.getParameter("mobile"); 
		long mobile = Long.parseLong(mob);
		String course = request.getParameter("Course"); 
		String[] hobbies = request.getParameterValues("hobbies"); 
		
		PrintWriter writer = response.getWriter();
		
		writer.print("<html><body>");
		writer.print("Employee name : "+name+"<br>");
		writer.print("Employee city : "+city+"<br>");
		writer.print("Employee salary : "+salary+"<br>");
		writer.print("Employee Mobile number : "+mobile+"<br>");
		writer.print("Employee course opted : "+course+"<br>");
		writer.print("Employee hobbies : ");
		writer.print("</body></html>");
		
		if(hobbies!=null) {
			for(String hobby: hobbies)
				writer.print(hobby + "<br>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
