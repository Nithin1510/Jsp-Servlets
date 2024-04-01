package com.doctorapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialization;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDoctorService doctorService = new DoctorServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    IDoctorService service = new DoctorServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("twxt/html");
		
		Doctor doctor = new Doctor();

		String doctorName = request.getParameter("doctorName");

		String speciality = request.getParameter("speciality");

		String docFees = request.getParameter("doctorFees");
		Double doctorFees = Double.parseDouble(docFees);

		String docRatings = request.getParameter("doctorRatings");
		int doctorRatings = Integer.parseInt(docRatings);

		String docExperience = request.getParameter("doctorExperience");
		int doctorExperience = Integer.parseInt(docExperience);

		Specialization specialization = Specialization.valueOf(speciality.toUpperCase());
		String spec = specialization.getSpeciality();

		doctor.setDoctorName(doctorName);
		doctor.setSpeciality(spec);
		doctor.setFees(doctorFees);
		doctor.setRatings(doctorRatings);
		doctor.setExperience(doctorExperience);
		System.out.println(doctor);

		doctorService.addDoctor(doctor);
		
		PrintWriter writer = response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("adminDash.jsp");
		dispatcher.include(request, response);
		
		writer.print("<p>Doctor data added successfully</p>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
