//package com.company;
//
//public class tryyy {
//    public static void main(String[] args){
//        int a[]={80,10,50,20,40};
//        for(int i=0;i<a.length;i++){
//            int largest=Integer.MIN_VALUE;
//            int indexOfLargest=-1;
//            for(int j=0;j<a.length-i;j++){
//                if(a[j]>largest){
//                    largest=a[j];
//                indexOfLargest=j;
//                }
//            }
//            if(i!=a.length && (a[a.length-(i+1)]<largest)){
//                int temp=a[a.length-1-i];
//                a[a.length-1-i]=largest;
//                a[indexOfLargest]=temp;
//            }
//        }
//        for(int x:a)
//            System.out.println(x);
//    }
//}
//smallest element approach
//        package com.company;
//
//public class tryyy {
//    public static void main(String[] args){
//        int a[]={80,10,50,20,40};
//        for(int i=0;i<a.length;i++){
//            int smallest=Integer.MAX_VALUE;
//            int indexOfSmallest=-1;
//            for(int j=i;j<a.length;j++){
//                if(a[j]<smallest){
//                    smallest=a[j];
//                    indexOfSmallest=j;
//                }
//            }
//            if(a[i]>smallest){
//                int temp=a[i];
//                a[i]=smallest;
//                a[indexOfSmallest]=temp;
//            }
//        }
//        for(int x:a)
//            System.out.println(x);
//    }
//}


////////////////////////////////////
package com.company;

import java.util.Scanner;

public class tryyy {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt(); //token +token(next) is ok
        String b=scn.next();
        int c=scn.nextInt(); //token +non-token(next) not ok as token will leave \n ans non token return when ready \n
//        String z=scn.nextLine();
//        System.out.println(a+b+c+z);
        System.out.println(a+b+c);
    }
}

//1 vishnu 3
//1 \n vishnu \n 3
//1 \n vishnu kumar \n 3


//wehen z in cluded
//1 vishnu 3 vishnu kumar
//1 \n vishnu \n 3  \n vishnu kumar
