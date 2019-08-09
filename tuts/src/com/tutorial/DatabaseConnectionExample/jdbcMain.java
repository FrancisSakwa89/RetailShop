package com.tutorial.DatabaseConnectionExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static com.tutorial.DatabaseConnectionExample.JDBCExample.*;

public class jdbcMain {
    public static void main(String[] args) throws SQLException {
        JDBCExample jdbcExample = new JDBCExample();
        Connection conn = null;
        Statement statement = null;

        try {
            //REGISTER JDBC DRIVER
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            //OPEN CONNECTION
            System.out.println("connecting to database");
            conn = DriverManager.getConnection(JDBCExample.DB_URL,JDBCExample.USER, JDBCExample.PASS);

            //EXECUTE A QUERY
            System.out.println("creating database...");
            statement = conn.createStatement();

            String sql = "CREATE DATABASE STUDENTS";
            statement.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (Exception se){se.printStackTrace();} finally {
            try {
                if (statement != null)
                    statement.close();
            }catch (SQLException se2){se2.printStackTrace();}
            try {
                if (conn != null){
                    conn.close();
                }
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye ....");
    }
}
