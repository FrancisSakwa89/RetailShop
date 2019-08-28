package com.tutorial.BatchProcessing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BatchProcessing {
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost/Sqlearn";
    private String DB_USER = "root";
    private String DB_PASSWORD = "Francis_2019";

    public void batch(){
        try {
            Class.forName(JDBC_DRIVER);

            Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            PreparedStatement ps = conn.prepareStatement("INSERT INTO student VALUES(?,?,?,?),");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true){

                System.out.println("Enter id: ");
                String id = br.readLine();
                int i = Integer.parseInt(id);

                System.out.println("Enter name: ");
                String name = br.readLine();

                System.out.println("Enter date of birth: ");
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String dateString = dateFormat.format(new Date(br.readLine()));

                System.out.println("Enter course: ");
                String course = br.readLine();


                ps.setInt(1, Integer.parseInt(id));
                ps.setString(2,name);
                ps.setDate(3, java.sql.Date.valueOf(dateString));
                ps.setString(4,course);

                ps.addBatch();
                System.out.println("Want to add records y/n");
                String answer = br.readLine();
                if (answer.equals("n")){
                    break;
                }



            }
            ps.executeBatch();
            System.out.println("record successfully saved");
            conn.close();




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
