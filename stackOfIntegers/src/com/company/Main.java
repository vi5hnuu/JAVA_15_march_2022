package com.company;

public class Main {

    public static void main(String[] args) {
        StackOfIntegers stack=new StackOfIntegers();
        System.out.println("Size is :"+stack.getSize());
        for(int i=0;i<17;i++)
            stack.push(i);
        System.out.println("Size is :"+stack.getSize());
        while(!stack.empty())
            System.out.println(stack.pop()+" ");
        System.out.println("Size is :"+stack.getSize());
        System.out.println("top of stack :"+stack.peek());
    }
}
