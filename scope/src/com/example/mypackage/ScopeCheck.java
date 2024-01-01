//package com.example.mypackage;
//
//public class ScopeCheck {
//    public int publicVar;
//    private int privateVar;
//    {
//        privateVar=15;
//        publicVar=0;
//    }
//
//    public int getPrivateVar() {
//        return privateVar;
//    }
//
//    public ScopeCheck(){
//        System.out.println("Scope check created ,publicvar = "+publicVar+
//                " privatevar = "+privateVar);
//
//
//    }
//
////    public void timesTwo(){
//////        int privateVar=2; //global private var is hidded...local is give more priority
////        for(int i=0;i<10;i++)
//////            System.out.println(i+" time two is "+privateVar*i);
////            System.out.println(i+" time two is "+privateVar*i);
////    }
//
//    public void timesTwo(){
//        int privateVar=2; //redundant
//        for(int i=0;i<10;i++)
//            System.out.println(i+" time two of outer class is "+this.privateVar*i);
//    }
//
//    public class InnerClass{
////        public int privateVar=4;
//        public InnerClass(){
//            System.out.println("innerClass crated, privatevar is "+privateVar);
//        }
////        public void timesTwo(){
////            for(int i=0;i<10;i++)
//////                System.out.println(i+" time two of inner clasa is "+this.privateVar*i);//this.privateVar give error if inner class do not have privateVar
////                System.out.println(i+" time two of inner clasa is "+privateVar*i);
////        }
//
//                public void timesTwo(){
//                int privateVar=4; //redundant
//            for(int i=0;i<10;i++)
//                System.out.println(i+" time two of inner clasa is "+ScopeCheck.this.privateVar*i);
//        }
//
////                public void timesTwo(){
////                    ScopeCheck.this.timesTwo(); //ScopeCheck.timesTwo() wrong as it is not static it hast to be associated with obj
////                    //timeTwo() is wrong it recursively call itself
////                    //ScopeCheck.(this.timeTwo()) ok
////        }
//
//    }
//}


//////refactoring

package com.example.mypackage;

public class ScopeCheck {
    public int publicVar;
    private int varOne;
    {
        varOne =15;
        publicVar=0;
    }

    public int getVarOne() {
        return varOne;
    }

    public ScopeCheck(){
        System.out.println("Scope check created ,publicvar = "+publicVar+
                " privatevar = "+ varOne);


    }

    public void timesTwo(){
        int var2=2;
        for(int i=0;i<10;i++)
            System.out.println(i+" time two of outer class is "+var2 *i);
    }

    public void useInner(){
        InnerClass innerClass=new InnerClass();
        System.out.println("varThree "+innerClass.varThree);
    }

    public class InnerClass{
        private int varThree;
        {
            varThree=4;
        }
        public InnerClass(){
            System.out.println("innerClass crated, varThree is "+ varThree+" varOne is "+varOne);
        }

        public void timesTwo(){
            System.out.println("varone is still available here(private) "+varOne);
            for(int i=0;i<10;i++)
                System.out.println(i+" time two of inner clasa is "+ varThree *i);
        }


    }
}
