package com.tutorial.PreparedStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.sql.*;

import java.text.SimpleDateFormat;

public class UsingPreparedStatement {

        private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        private String DB_URL = "jdbc:mysql://localhost/Sqlearn";
        private String DB_USER = "root";
        private String DB_PASSWORD = "Francis_2019";

        //SETUP
//        private Connection connection = null;
//        private PreparedStatement statement = null;
//        private ResultSet resultSet = null;

    public void PreparedStatement(){
        try {
            Class.forName(JDBC_DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement ps = connection.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            do {
                System.out.println("Enter id: ");
                String id = br.readLine();
                System.out.println("Enter name: ");
                String name = br.readLine();
                System.out.println("Enter date of birth");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String dateString = dateFormat.format(new Date(br.readLine()));


                System.out.println("Enter course: ");
                String course = br.readLine();


                ps.setString(1,id);
                ps.setString(2,name);
                ps.setDate(3, java.sql.Date.valueOf(dateString));
                ps.setString(4,course);
                int i = ps.executeUpdate();
                System.out.println(i+ " record(s) added !!");

                System.out.println("Do you want to continue: y/n");
                String s = br.readLine();

                if (s.startsWith("n")){
                    break;
                }

            }while (true);

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
