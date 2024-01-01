package com.company;

import java.lang.reflect.Type;
import java.sql.*;

public class TestCallableStatement {
    public static void main(String[] args) throws Exception{
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/javabook","scott","tiger");
        CallableStatement callableStatement=connection.prepareCall("{? = call studentFound(?,?}");

        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("Enter student first Name:");
        String firstName=input.nextLine();
        System.out.println("Enter Student last name :");
        String lastName=input.nextLine();

        callableStatement.setString(2,firstName);
        callableStatement.setString(3,lastName);
        callableStatement.registerOutParameter(1,Types.INTEGER);
        callableStatement.execute();

        if(callableStatement.getInt(1)>=1)
            System.out.println(firstName+" "+lastName+" is in database");
        else
            System.out.println(firstName+" "+lastName+" not in database");
    }
}
