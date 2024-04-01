package com.employeeapp.model;

public class Employee {

	private String employeeName;
	private Integer  employeeId;
	private String city;
	private double salary;
	private String course;
	
	public Employee(String employeename, Integer employeeId, String city, double salary, String course) {
		super();
		this.employeeName = employeename;
		this.employeeId = employeeId;
		this.city = city;
		this.salary = salary;
		this.course = course;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmployeename() {
		return employeeName;
	}

	public void setEmployeename(String employeename) {
		this.employeeName = employeename;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalry() {
		return salary;
	}

	public void setSalry(double salary) {
		this.salary = salary;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Employee [employeename=" + employeeName + ", employeeId=" + employeeId + ", city=" + city + ", salry="
				+ salary + ", course=" + course + "]";
	}
	
	
}
