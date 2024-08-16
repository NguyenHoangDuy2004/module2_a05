package com.example.case1.repository;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private final static String URL = "jdbc:mysql://localhost:3306/phongtro";
    private final static String USER = "root";
    private final static String PASSWORD = "123456789";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER , PASSWORD);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return connection;
    }
}
