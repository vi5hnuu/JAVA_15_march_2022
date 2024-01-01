package com.company;

public class GenericSort {
    public static void main(String[] args) {
        Integer[] intArray={Integer.valueOf(2),Integer.valueOf(4),Integer.valueOf(3)};
        Double[] doubleArray={Double.valueOf(3.4),Double.valueOf(1.3),Double.valueOf(-22.1)};

        Character[] charArray={Character.valueOf('a'),Character.valueOf('j'),Character.valueOf('r')};

        String[] stringArray={"Tom","Susan","Kim"};

        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);
        System.out.println("Sorted Integer Array");
        printList(intArray);
        System.out.println("Sorted Double Array");
        printList(doubleArray);
        System.out.println("Sorted Character Array");
        printList(charArray);
        System.out.println("Sorted String Array");
        printList(stringArray);
    }
    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;
        for(int i=0;i<list.length-1;i++){
            currentMin=list[i];
            currentMinIndex=i;

            for(int j=i+1;j< list.length;j++){
                if(currentMin.compareTo(list[j])>0){ //at runtime compareTo of respective classes is called
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            if(currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
    }
    public static void printList(Object[] list){
        for(int i=0;i< list.length;i++)
            System.out.print(list[i]+" ");//initiall at compile time..toString of object class at runTime to string of String,Double etc class
    }
}
