//package com.company;
//
//import java.sql.*;
//
//public class SimpleJdbc{
//    public static void main(String[] args) throws SQLException,ClassNotFoundException{
//        Class.forName("com.mysql.cj.jdbc.Driver");//unnecessary
//        System.out.println("Driver Loaded");
//        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/javabook","scott","tiger");
//        System.out.println("Database connected");
//
//        Statement statement=connection.createStatement();
//        ResultSet resultSet=statement.executeQuery("select firstname,mi,lastname from student where lastname='smith'");
//        while (resultSet.next()){
//            System.out.println(resultSet.getString(1)+"\t"+resultSet.getString("mi")+"\t"+resultSet.getString(3));
//        }
//        connection.close();
//    }
//}


///////try with resource
package com.company;

import java.sql.*;

public class SimpleJdbc{
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");//unnecessary
        System.out.println("Driver Loaded");
        try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/javabook","scott","tiger");){
        System.out.println("Database connected");

        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select firstname,mi,lastname from student where lastname='smith'");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+"\t"+resultSet.getString("mi")+"\t"+resultSet.getString(3));
        }}
    }
}
