package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDiapactherServlet
 */
@WebServlet("/request")
public class RequestDiapactherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestDiapactherServlet() {
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
		
		request.setAttribute("employeeName", name);
		request.setAttribute("city", city);
		request.setAttribute("salary", salary);
		request.setAttribute("mobile", mobile);
		request.setAttribute("course", course);
		request.setAttribute("hobbies", hobbies);
		
		PrintWriter writer = response.getWriter();
		writer.print("This is from servlet <br>");
		
		//create the request dispatcher to send to the next page
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("success.jsp");
		// forward request and response
		requestDispatcher.forward(request, response);
		
//		response.sendRedirect("success.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
