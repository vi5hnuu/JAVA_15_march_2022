package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of points:");
        int numberofPoints=input.nextInt();

        double[][] points=new double[numberofPoints][2];
        System.out.println("Enter "+numberofPoints+" points.");
        for(int i=0;i<numberofPoints;i++){
            points[i][0]=input.nextDouble();
            points[i][1]=input.nextDouble();
        }
        double shortest_distance=Integer.MAX_VALUE;
        int row_p1=-1;
        int row_p2=-1;
        for(int i=0;i<points.length;i++)
            for(int j=i+1;j<points.length;j++){
                double dist=distance(points[i][0],points[i][1],points[j][0],points[j][1]);
                if(shortest_distance>dist){
                    shortest_distance=dist;
                    row_p1=i;
                    row_p2=j;
                }
            }
        System.out.println("Shortest distance :"+shortest_distance+
                "Points are : ("+points[row_p1][0]+","+points[row_p1][1]+") and "+
                "("+points[row_p2][0]+","+points[row_p2][1]+")");
    }
    public static double distance(double... pts_4){
        return Math.sqrt(Math.pow((pts_4[0]-pts_4[2]),2)+Math.pow((pts_4[1]-pts_4[3]),2));
    }
}
