package com.company;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    StackOfIntegers(){
        this(DEFAULT_CAPACITY);
    }
    StackOfIntegers(int capacity){
        size=-1;
        if(capacity>0)
        elements=new int[capacity];
        else{
            System.out.println("Invalid capacity");
            return;
        }
    }
    boolean empty(){ //no modifier means publi to all classes in same package
        if(size==-1)
            return true;
        else
            return false;
    }
    int peek(){
        if(size>=0)
        return elements[size];
        else
            return Integer.MIN_VALUE;
    }
    int pop(){
        return elements[size--];
    }
    void push(int item){
        if(size+1<elements.length)
        elements[++size]=item;
        else{
            int[] temp=new int[elements.length*2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements=temp;
            elements[++size]=item;
        }
    }
    int getSize(){
        return size+1;
    }

}
