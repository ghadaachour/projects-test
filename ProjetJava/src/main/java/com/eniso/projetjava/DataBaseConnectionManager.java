/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.projetjava;

/**
 *
 * @author GHADA
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseConnectionManager {
     // Static instance variable to hold the single instance of the class
    private static DataBaseConnectionManager instance;

    // Database connection parameters
    private static final String URL = "jdbc:postgresql://localhost:5432/mydatabase";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    // Connection object
    private Connection connection;

    // Private constructor to prevent instantiation from outside
    private DataBaseConnectionManager() {
        try {
            // Create a database connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to get the single instance of the class
    public static synchronized DataBaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DataBaseConnectionManager();
        }
        return instance;
    }

    // Method to get the database connection
    public Connection getConnection() {
        return connection;
    }

    // Method to close the database connection
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
