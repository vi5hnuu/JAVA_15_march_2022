package com.company;

public class Main {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Berlin");

        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1); // autoboxing 1 to an Integer object
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
    }
}
