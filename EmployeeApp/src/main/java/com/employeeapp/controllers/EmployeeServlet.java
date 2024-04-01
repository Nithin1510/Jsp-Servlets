package com.employeeapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.model.Employee;

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
		String name = request.getParameter("employeeName"); 
		String empid = request.getParameter("employeeId");
		Integer employeeId =  Integer.parseInt(empid);
		String sal = request.getParameter("salary"); 
		double salary = Double.parseDouble(sal);
		String city = request.getParameter("city"); 
		String course = request.getParameter("Course"); 
		
		Employee employee = new Employee();
		employee.setEmployeename(name);
		employee.setEmployeeId(employeeId);
		employee.setCity(city);
		employee.setCourse(course);
		employee.setSalry(salary);
		
		request.setAttribute("employee", employee);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("empsuccess.jsp");
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
