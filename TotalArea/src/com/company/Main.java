package com.company;

public class Main {

    public static void main(String[] args) {
        Circle[] circleArray=createCircleArray();
        printCircleArray(circleArray);
    }
    public static Circle[] createCircleArray(){
        Circle[] circleArray=new Circle[5]; // all references are null
//        if(circleArray[0]==null){
//            System.out.println("Its null");
//        }
        for(int i=0;i<5;i++)
        circleArray[i]=new Circle(Math.random()*100);

        return circleArray;
    }

    public static void printCircleArray(Circle[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for(int i=0;i<circleArray.length;i++){
            System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),circleArray[i].getArea());
        }
        System.out.printf("%-30s%-15f\n","The total area of circle is ",sum(circleArray));
    }

    public static double sum(Circle[] circleArray){
        double sum=0;
        for(int i=0;i<circleArray.length;i++)
            sum+=circleArray[i].getArea();

        return sum;
    }
}
