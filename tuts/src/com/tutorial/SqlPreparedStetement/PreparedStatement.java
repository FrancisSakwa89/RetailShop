package com.tutorial.SqlPreparedStetement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PreparedStatement {
    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://localhost/Sqlearn";
    private String DB_USER = "root";
    private String DB_PASSWORD = "Francis_2019";

    public void sql(){
        try {
            Class.forName(JDBC_DRIVER);

            Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            java.sql.PreparedStatement statement = conn.prepareStatement("SELECT name FROM student;");


            if (conn != null){
                conn.close();
            }
//            if (statement != null){
//                statement.close();
//            }
//


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
