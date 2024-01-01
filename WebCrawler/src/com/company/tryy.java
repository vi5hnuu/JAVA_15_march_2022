//package com.company;
//
//public class tryy {
//    public static void main(String[] args){
//        int[][] a={{1,2,3},{4,5,6}};
//        int[][] b={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        int[][] c=multiplyMatrix(a,b);
//        if(c!=null)
//        for(int[] r:c){
//            for(int x:r){
//                System.out.print(x+" ");
//        }
//            System.out.println();
//        }
//        else{
//            System.out.println("Invalid matrix1 or matrix2");
//        }
//    }
//
//    public static int[][] multiplyMatrix(int[][] m1,int[][] m2){
//
//        if(m1[0].length!=m2.length) {
//            System.out.println("col of matrix1 != rows of matrix2");
//            return null; //but what if zig zag array is given  //use try catch or see below
//        }
//        int[][] result=new int[m1.length][m2[0].length];
//    for(int k=0;k<m1.length;k++){
//        if(k<m1.length-1 && m1[k].length!=m1[k+1].length) {//if number of elems in all rows are not same in m1
//            System.out.println("Zagged");
//            return null;}
//        for(int i=0;i< m2[k].length;i++){
//            int sum=0;
//            for (int j=0;j<m2.length;j++){
//                if(j<m2.length-1 && m2[j].length!=m2[j+1].length){//if all rows do not have same number of elements in m2
//                    System.out.println("Zagged");
//                    return null;
//                }
//                sum+=m1[k][j]*m2[j][i];
//            }
//            result[k][i]=sum;
//        }
//    }
//    return result;
//    }
//}


//////////////////////////////////////////
package com.company;

public class tryy {
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6}};
        int[][] b={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] c=multiplyMatrix(a,b);
        if(c!=null)
            for(int[] r:c){
                for(int x:r){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        else{
            System.out.println("Invalid matrix1 or matrix2");
        }
    }

    public static int[][] multiplyMatrix(int[][] m1,int[][] m2){

        if(m1[0].length!=m2.length) {
            System.out.println("col of matrix1 != rows of matrix2");
            return null;
        }
        int[][] result=new int[m1.length][m2[0].length];
        for(int k=0;k<m1.length;k++){
            for(int i=0;i< m2[k].length;i++){
                int sum=0;
                for (int j=0;j<m2.length;j++){
                    sum+=m1[k][j]*m2[j][i];
                }
                result[k][i]=sum;
            }
        }
        return result;
    }
}
