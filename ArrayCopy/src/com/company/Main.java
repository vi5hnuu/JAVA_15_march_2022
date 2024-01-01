package com.company;

public class Main {

    public static void main(String[] args) {
    int[] sourceArray={2,3,1,5,10};
    int[] targetArray=new int[sourceArray.length];
    //Element by element
    //    for(int i=0;i<sourceArray.length;i++)
//        targetArray[i]=sourceArray[i];
//    for(int x:targetArray)
//        System.out.println(x);

        //java.lang.System.arrayCopy
//        java.lang.System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length);
//        for(int x:targetArray)
//            System.out.println(x);


        //passing array
        Main.printArray(new int[]{3,4,1,2,5,6,7});
    }
    public static void printArray(int[] array){
        for(int x:array) //not a pointer but reference ...u know we cannot apply foreach to pointer..also java do not have pointer(it creates references)
            System.out.println(x);
    }
}
