//package com.company;
//
//public class LargestPrime {
//    public static int getLargestPrime(int number){
//        if(number<=1)
//            return -1;
//        if(number==2)
//            return 2;
//
//        int largestPrime=0;
//        for(int i=3;i<number;i++){
//
//            //check if prime
////            boolean prime=false;
////            for(int j=2;j<i;j++){
////                if(i%j==0){
////                    prime=false;
////                break;
////                }
////                else
////                    prime=true;
////            }
//            //check if prime end.
//
//           if(isPrime(i) && (number%i)==0){
//               if(i>largestPrime)
//                   largestPrime=i;
//           }
//
//        }
//        if(largestPrime==0 && number%2!=0)
//            return number;
//        else if(largestPrime==0 && number%2==0)
//            return 2;
//        else
//        return largestPrime;
//    }
//
//    private static boolean isPrime(int x){
//        for(int j=2;j<x;j++){
//            if(x%j==0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//}




package com.company;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number<=1)
            return -1;
        if(number==2)
            return 2;

        int largestPrime=0;
        for(int i=number-1;i>2;i--){


            if(isPrime(i) && (number%i)==0){
                return i;
            }

        }
        return number;
    }

    private static boolean isPrime(int x){
        for(int j=2;j<x;j++){
            if(x%j==0){
                return false;
            }
        }
        return true;
    }

}

