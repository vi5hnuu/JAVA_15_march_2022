package com.company;

public class FinalMethodsOverrideornot {
}


//we cannot override final methods and static methods.
class AA {
    public void method1() { /*do something */ }		// statement 1
    public final void method2() { /*do something */ }	// statement 2
    public void method3() { /*do something */ }		// statement 3
    static void iq(){
        System.out.println("Iq");
    }
}
class BB extends AA {
    public void method1() { /*do something else */ }	// statement 4
//    public void method2() { /*do something else */ }	// statement 5
    public final void method3() { /*do something else */ }	// statement 6
//    void iq(){
//        System.out.println("IQ");
//    }
}
