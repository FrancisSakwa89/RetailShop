package com.tutorial.DatabaseConnectionExample;

import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DatabaseHelper {
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost/Sqlearn";
    private String DB_USER = "root";
    private String DB_PASSWORD = "Francis_2019";

    //SETUP
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;


    public void operate() {

        try {
            Class.forName(JDBC_DRIVER);

            //setup connection
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //create statement
            statement = connection.createStatement();

            //declare a query8

            String query = "CREATE TABLE IF NOT EXISTS student(" +

                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(30) NOT NULL," +
                    "date_of_birth DATE ," +
                    "course VARCHAR(50) NOT NULL" +

                    ");";

            statement.executeUpdate(query);
            //insert values
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = date.format(new Date("9/12/1999"));

//            String query1="insert into student (id,name,date_of_birth,course) values(10,'agnes', '1993/03/12','bsc')";
            String sql = "INSERT INTO student(name,date_of_birth,course)VALUES(" +
                    "'Francis','" +
                    dateString +
                    "','Education'" +


                    ");";
//            System.out.println(sql);
//            statement.executeUpdate(sql);
//            resultSet = statement.executeQuery("select * from student;");

            String resul = "SELECT * FROM student;";
            resultSet =statement.executeQuery(resul);

            System.out.println("ID      .NAME        DATE OF BIRTH       COURSE");

            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+"     "+resultSet.getString("name")+"     "+resultSet.getDate("date_of_birth")+"      "+resultSet.getString("course"));
            }


            System.out.println(resultSet);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }
    }


}
