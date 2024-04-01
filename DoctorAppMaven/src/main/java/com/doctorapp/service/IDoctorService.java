package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorService {
	void addDoctor(Doctor doctor);

	void updateDoctor(int doctorId, double fees);

	void deleteDoctor(int doctorId);

	Doctor findById(int doctorId) throws IdNotFoundException;

	List<Doctor> findAll();

	List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException;

	List<Doctor> findBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException;

	List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException;

	List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException;

	List<Doctor> findBySpecialityAndName(String speciality, String doctorName) throws DoctorNotFoundException;

}
