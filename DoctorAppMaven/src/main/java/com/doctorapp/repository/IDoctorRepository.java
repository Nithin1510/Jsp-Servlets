package com.doctorapp.repository;

import java.util.List;

import com.doctorapp.model.Doctor;

public interface IDoctorRepository {
	void addDoctor(Doctor doctor);

    void updateDoctor(int doctorId, double fees);

    void deleteDoctor(int doctorId);

    Doctor findById(int doctorId);

    List<Doctor> findAll();

    List<Doctor> findBySpeciality(String speciality);

    List<Doctor> findBySpecialityAndExp(String speciality, int experience);

    List<Doctor> findBySpecialityAndLessFees(String speciality, double fees);

    List<Doctor> findBySpecialityAndRatings(String speciality, int ratings);

    List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName);
}
