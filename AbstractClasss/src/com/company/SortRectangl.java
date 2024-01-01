package com.company;

public class SortRectangl {
    public static void main(String[] args){
        ComparabelRectangle[] rectangles={
                new ComparabelRectangle(3.4, 5.4),
                 new ComparabelRectangle(13.24, 55.4),
                 new ComparabelRectangle(7.4, 35.4),
                 new ComparabelRectangle(1.4, 25.4)};
        java.util.Arrays.sort(rectangles);
        for(Rectangle rectangle:rectangles)
            System.out.println(rectangle+" "); //tostring of Rectangle->at run time to string of ComaparableRectangle class (Rectangle do not have tostring so inherited from object)
        System.out.println();

        }

    }
