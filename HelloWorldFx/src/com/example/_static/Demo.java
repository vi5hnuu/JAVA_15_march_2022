//package com.example._static;
//
//public class Demo {
//    Demo(){
//        System.out.println("Demo");
//    }
//}
//
//class Demo1 extends Demo{
//    Demo1(){
//        System.out.println("Demo1");
//    }
//}
//
//class x{
//    public static void main(String[] args) {
//        Demo x=new Demo1();
//        Demo1 y=new Demo1();
//    }
//}
//
//

///////////////////////////
//package com.example._static;
//
//public class Demo {
//    Demo(){
//        System.out.println("Demo oarg");
//    }
//    Demo(int a){
//        System.out.println("Demo 1arg");
//    }
//}
//
//class Demo1 extends Demo{
//    Demo1(){ //by default iw we do not call it call zero arg of super
//        System.out.println("Demo1");
//    }
//}
//
//class x{
//    public static void main(String[] args) {
//        Demo x=new Demo1();
//        Demo1 y=new Demo1();
//    }
//}

/////////////////////////
package com.example._static;

public class Demo {
    Demo(){
        System.out.println("Demo oarg");
    }
    Demo(int a){
        System.out.println("Demo 1arg");
    }
}

class Demo1 extends Demo{
    Demo1(){
//        super(5);
        System.out.println("Demo1");
    }
}

class x{
    public static void main(String[] args) {
//        Demo x=new Demo1();
        Demo1 y=new Demo1();
    }
}


