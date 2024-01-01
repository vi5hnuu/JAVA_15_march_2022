package com.company;
import com.mysql.jdbc.Driver;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/javabook","scott","tiger");
            Statement statement=connection.createStatement();
//            statement.executeUpdate("create table Tempp(col1 char(5),col2 char(5));");
            ResultSet resultSet=statement.executeQuery("select firstName from student where lastName = 'smith'");
//            System.out.println(resultSet);
            while (resultSet.next()){
                System.out.println("First name :"+resultSet.getString(1));
            }
        }
        catch (Exception e){
            System.out.println("Connection failed");
        }

    }
}
