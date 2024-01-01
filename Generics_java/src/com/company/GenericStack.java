package com.company;

public class GenericStack<E> { //E extends Object ..so not for primitives...bue we can use wrapper class
private java.util.ArrayList<E> list=new java.util.ArrayList<>();

public int getSize(){
    return list.size();
}
public boolean isEmpty(){
    return list.size()==0 ? true:false;
}
public E peek(){
    return list.get(getSize()-1);
}
public void push(E o){
    list.add(o);
}
public E pop(){
    E o=list.get(getSize()-1);
    list.remove(getSize()-1);
    return o;
}
@Override
    public String toString(){
    return "Stack :"+list.toString();
}
}

