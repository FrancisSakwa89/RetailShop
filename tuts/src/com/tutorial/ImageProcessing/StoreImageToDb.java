package com.tutorial.ImageProcessing;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StoreImageToDb {
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost/Image";
    private String DB_USER = "root";
    private String DB_PASSWORD ="Francis_2019";

    public void storeImage(){
        try {

            Class.forName(JDBC_DRIVER);

            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Student VALUES(?,?)");


            String query = "CREATE TABLE IF NOT EXISTS Student(" +

                    "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
                    "image," +


                    ");";
            ps.execute(query);

            ps.setString(1,"myImage");

            FileInputStream fin = new FileInputStream("/home/moringaschool/Pictures/java.jpeg");
            ps.setBinaryStream(2,fin,fin.available());
            int i = ps.executeUpdate();
            System.out.println(i+" records updated successfully");
            conn.close();




        }catch (Exception e){
            System.out.println(e);
        }
    }


}
