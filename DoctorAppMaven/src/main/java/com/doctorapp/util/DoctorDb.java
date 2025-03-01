package com.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoctorDb {
    static Connection connection;

    public static Connection openConnection() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    	} catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";

        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to DB");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
