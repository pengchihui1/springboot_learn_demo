package com.example.diyu.demo.controller;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//      Class.forName("com.mysql.jdbc.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/book_system?serverTimezone=GMT%2B8";
//      String url = "jdbc:mysql://127.0.0.1:3306/mysql";
        Connection con = DriverManager.getConnection(url, "root", "root");
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from db ");
        while(resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }

}
