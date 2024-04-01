package com.employeeappmaven.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employeeappmaven.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		response.setContentType("text/html");
		String name = request.getParameter("employeeName"); 
		String empid = request.getParameter("employeeId");
		int employeeId = Integer.parseInt(empid);
		String sal = request.getParameter("salary"); 
		double salary = Double.parseDouble(sal);
		String city = request.getParameter("city");
		
		Employee employee = new Employee();
		
		employee.setEmployeeName(name);
		employee.setEmployeeId(employeeId);
		employee.setCity(city);
		employee.setSalary(salary);
		
		request.setAttribute("employee", employee);
		request.setAttribute("message", "Great Day");
		HttpSession session = request.getSession();
		session.setAttribute("message1", "Welcome to EL");
		request.setAttribute("message1", "In request scope");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("empexplang.jsp");
		dispatcher.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
