package com.company;

public class WilCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> intStack=new GenericStack<Integer>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(-2);
        System.out.println("The max Number is  "+max(intStack));
    }

    public static double max(GenericStack<? extends Number> stack){//understand it properly
        double max=stack.pop().doubleValue();
        while(!stack.isEmpty()){
            double value=stack.pop().doubleValue();
            if(value>max)
                max=value;
        }
        return max;
    }
}
