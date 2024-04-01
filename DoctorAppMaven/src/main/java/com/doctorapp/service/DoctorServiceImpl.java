package com.doctorapp.service;

import java.util.Collections;
import java.util.List;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.DoctorRepositoryImpl;
import com.doctorapp.repository.IDoctorRepository;

public class DoctorServiceImpl implements IDoctorService{
	 private IDoctorRepository doctorRepository = new DoctorRepositoryImpl();
	    @Override
	    public void addDoctor(Doctor doctor) {
	        doctorRepository.addDoctor(doctor);
	    }

	    @Override
	    public void updateDoctor(int doctorId, double fees) {
	        doctorRepository.updateDoctor(doctorId, fees);
	    }

	    @Override
	    public void deleteDoctor(int doctorId) {
	        doctorRepository.deleteDoctor(doctorId);
	    }

	    @Override
	    public Doctor findById(int doctorId) throws IdNotFoundException {
	        Doctor doctor = doctorRepository.findById(doctorId);
	        if(doctor == null)
	            throw new IdNotFoundException("Invalid id");
	        return doctor;
	    }

	    @Override
	    public List<Doctor> findAll() {
	        List<Doctor> doctorList = doctorRepository.findAll();
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpeciality(String speciality) throws DoctorNotFoundException {
	        List<Doctor> doctorList = doctorRepository.findBySpeciality(speciality);
	        if(doctorList.isEmpty())
	            throw new DoctorNotFoundException("Doctor not found with this speciality.");
	        Collections.sort(doctorList, (d1,d2) -> d1.getDoctorName().compareTo(d2.getDoctorName()));
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
	        List<Doctor> doctorList = doctorRepository.findBySpecialityAndExp(speciality, experience);
	        if(doctorList.isEmpty())
	            throw new DoctorNotFoundException("Doctor not found with this speciality and Experience.");
	        Collections.sort(doctorList, (d1,d2) -> ((Integer)d2.getExperience()).compareTo(d1.getExperience()));
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) throws DoctorNotFoundException {
	        List<Doctor> doctorList = doctorRepository.findBySpecialityAndLessFees(speciality, fees);
	        if(doctorList.isEmpty())
	            throw new DoctorNotFoundException("Doctor not found with this speciality and Fees.");
	        Collections.sort(doctorList, (d1,d2) -> ((Double)d1.getFees()).compareTo(d2.getFees()));
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
	        List<Doctor> doctorList = doctorRepository.findBySpecialityAndRatings(speciality, ratings);
	        if(doctorList.isEmpty())
	            throw new DoctorNotFoundException("Doctor not found with this speciality and Ratings.");
	        Collections.sort(doctorList, (d1,d2) -> ((Integer)d1.getRatings()).compareTo(d2.getRatings()));
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndName(String speciality, String doctorName) throws DoctorNotFoundException {
	        List<Doctor> doctorList = doctorRepository.findBySpecialityAndNameContains(speciality, doctorName);
	        if(doctorList.isEmpty())
	            throw new DoctorNotFoundException("Doctor not found with this speciality and Name.");
	        Collections.sort(doctorList, (d1,d2) -> (d2.getDoctorName()).compareTo(d1.getDoctorName()));
	        return doctorList;
	    }
}
