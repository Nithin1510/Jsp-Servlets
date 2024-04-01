package com.doctorapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDb;
import com.doctorapp.util.Queries;

public class DoctorRepositoryImpl  implements IDoctorRepository {
	 @Override
	    public void addDoctor(Doctor doctor) {

	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.InsertQuery)){

	            preparedStatement.setString(1,doctor.getDoctorName());
	            preparedStatement.setString(2, doctor.getSpeciality());
	            preparedStatement.setDouble(3, doctor.getFees());
	            preparedStatement.setInt(4, doctor.getRatings());
	            preparedStatement.setDouble(5, doctor.getExperience());

	            // call execute
	            boolean result = preparedStatement.execute();
	            System.out.println("One row inserted " + !result);
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void updateDoctor(int doctorId, double fees) {
	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.UpdateQuery)){
	            preparedStatement.setInt(2, doctorId);
	            preparedStatement.setDouble(1, fees);
	            int result = preparedStatement.executeUpdate();
	            System.out.println("one row updated " + result);
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void deleteDoctor(int doctorId) {
	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.DeleteQuery)){
	            preparedStatement.setInt(1, doctorId);
	            // call execute
	            boolean result = preparedStatement.execute();
	            System.out.println("One row deleted " + !result);
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public Doctor findById(int doctorId) {
	        Doctor doctor = null;
	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.findById);
	             ResultSet resultSet = preparedStatement.          executeQuery()){
	             preparedStatement.setInt(1,doctorId);{

	                while (resultSet.next()) {
	                    String doctorName = resultSet.getString("doctor_name");
	                    String speciality = resultSet.getString("speciality");
	                    double fees = resultSet.getDouble("fees");
	                    int ratings = resultSet.getInt("ratings");
	                    int experience = resultSet.getInt("experience");
	                    doctor = new Doctor(doctorId, doctorName, speciality, fees, ratings, experience);
	                }
	            }
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	        return doctor;
	    }

	    @Override
	    public List<Doctor> findAll() {
	        List<Doctor> doctors = new ArrayList<>();
	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.findAllQuery);
	             ResultSet resultSet = preparedStatement.executeQuery()){
	            while (resultSet.next()){
	                int doctorId = resultSet.getInt("doctor_id");
	                String doctorName = resultSet.getString("doctor_name");
	                String speciality = resultSet.getString("speciality");
	                double fees = resultSet.getDouble("fees");
	                int ratings = resultSet.getInt("ratings");
	                int experience = resultSet.getInt("experience");
	                Doctor doctor = new Doctor(doctorId,doctorName,speciality,fees,ratings,experience);
	                doctors.add(doctor);
	            }
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	        return doctors;
	    }

	    @Override
	    public List<Doctor> findBySpeciality(String speciality) {
	        List<Doctor> doctors = new ArrayList<>();
	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.findBySpeciality)){
	            preparedStatement.setString(1, speciality);
	            try (ResultSet resultSet = preparedStatement.executeQuery()){
	                while (resultSet.next()){
	                    int doctorId = resultSet.getInt("doctor_id");
	                    String doctorName = resultSet.getString("doctor_name");
	                    double fees = resultSet.getDouble("fees");
	                    int ratings = resultSet.getInt("ratings");
	                    int experience = resultSet.getInt("experience");
	                    Doctor doctor = new Doctor();
	                    doctor.setDoctorName(doctorName);
	                    doctor.setSpeciality(speciality);
	                    doctor.setExperience(experience);
	                    doctor.setDoctorId(doctorId);
	                    doctor.setRatings(ratings);
	                    doctor.setFees(fees);

	                    doctors.add(doctor);
	                }
	            }
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	        return doctors;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndExp(String speciality, int experience) {
	        List<Doctor> doctors = new ArrayList<>();
	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.findBySpecAndExp)){
	            preparedStatement.setString(1, speciality);
	            preparedStatement.setInt(2, experience);
	            try (ResultSet resultSet = preparedStatement.executeQuery()){
	                while (resultSet.next()){
	                    int doctorId = resultSet.getInt("doctor_id");
	                    String doctorName = resultSet.getString("doctor_name");
	                    double fees = resultSet.getDouble("fees");
	                    int ratings = resultSet.getInt("ratings");
	                    Doctor doctor = new Doctor();
	                    doctor.setDoctorName(doctorName);
	                    doctor.setSpeciality(speciality);
	                    doctor.setExperience(experience);
	                    doctor.setDoctorId(doctorId);
	                    doctor.setRatings(ratings);
	                    doctor.setFees(fees);

	                    doctors.add(doctor);
	                }
	            }
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	        return doctors;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndLessFees(String speciality, double fees) {
	        List<Doctor> doctors = new ArrayList<>();
	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.findBySpecAndFees)){
	            preparedStatement.setString(1, speciality);
	            preparedStatement.setDouble(1, fees);
	            try (ResultSet resultSet = preparedStatement.executeQuery()){
	                while (resultSet.next()){
	                    int doctorId = resultSet.getInt("doctor_id");
	                    String doctorName = resultSet.getString("doctor_name");
	                    int ratings = resultSet.getInt("ratings");
	                    int experience = resultSet.getInt("experience");
	                    Doctor doctor = new Doctor();
	                    doctor.setDoctorName(doctorName);
	                    doctor.setDoctorId(doctorId);
	                    doctor.setSpeciality(speciality);
	                    doctor.setExperience(experience);
	                    doctor.setRatings(ratings);
	                    doctor.setFees(fees);

	                    doctors.add(doctor);
	                }
	            }
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	        return doctors;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
	        List<Doctor> doctors = new ArrayList<>();
	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.findBySpecAndRatings)){
	            preparedStatement.setString(1, speciality);
	            preparedStatement.setInt(1, ratings);
	            try (ResultSet resultSet = preparedStatement.executeQuery()){
	                while (resultSet.next()){
	                    int doctorId = resultSet.getInt("doctor_id");
	                    String doctorName = resultSet.getString("doctor_name");
	                    double fees = resultSet.getDouble("fees");
	                    int experience = resultSet.getInt("experience");
	                    Doctor doctor = new Doctor();
	                    doctor.setDoctorName(doctorName);
	                    doctor.setDoctorId(doctorId);
	                    doctor.setSpeciality(speciality);
	                    doctor.setExperience(experience);
	                    doctor.setRatings(ratings);
	                    doctor.setFees(fees);

	                    doctors.add(doctor);
	                }
	            }
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	        return doctors;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
	        List<Doctor> doctors = new ArrayList<>();
	        try (Connection connection = DoctorDb.openConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(Queries.findBySpecAndName)){
	            preparedStatement.setString(1, speciality);
	            preparedStatement.setString(1, "%"+doctorName+"%");
	            try (ResultSet resultSet = preparedStatement.executeQuery()){
	                while (resultSet.next()){
	                    int doctorId = resultSet.getInt("doctor_id");
	                    int ratings = resultSet.getInt("ratings");
	                    double fees = resultSet.getDouble("fees");
	                    int experience = resultSet.getInt("experience");
	                    Doctor doctor = new Doctor();
	                    doctor.setDoctorName(doctorName);
	                    doctor.setDoctorId(doctorId);
	                    doctor.setSpeciality(speciality);
	                    doctor.setExperience(experience);
	                    doctor.setRatings(ratings);
	                    doctor.setFees(fees);

	                    doctors.add(doctor);
	                }
	            }
	        } catch (Exception e){
	            e.printStackTrace();
	        }
	        return doctors;
	    }
}
