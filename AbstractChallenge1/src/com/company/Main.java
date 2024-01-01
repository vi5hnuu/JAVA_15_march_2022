package com.company;

public class Main {

    public static void main(String[] args) {
//        MyLinkedList list=new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
////        String stringdata="Darwin Brisbane Perth Melborne Canberra Adelaide Sydney Canberra";
//        String stringdata="5 8 9 6 4 7 2 3 1 1";
//        String[] data=stringdata.split(" ");
//        for(String s:data)
//            list.addItem(new Node(s));
//
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("3"));
//        list.traverse(list.getRoot());
//        list.removeItem(new Node("5"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("0"));
//        list.removeItem(new Node("4"));
//        list.removeItem(new Node("2"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("9"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("8"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(new Node("6"));
//        list.traverse(list.getRoot());
//
//        list.removeItem(list.getRoot());
//        list.removeItem(list.getRoot());
//        list.removeItem(list.getRoot());

        ///search Tree
        SearchTree list=new SearchTree(null);
        list.traverse(list.getRoot());

//        String stringdata="Darwin Brisbane Perth Melborne Canberra Adelaide Sydney Canberra";
        String stringdata="5 8 9 6 4 7 2 3 1 1";
        String[] data=stringdata.split(" ");
        for(String s:data)
            list.addItem(new Node(s));
        System.out.println("==================Start===============");
        list.traverse(list.getRoot());
        System.out.println("===================End================");
        list.removeItem(new Node("3"));
        System.out.println("==================Start===============");
        list.traverse(list.getRoot());
        System.out.println("===================End================");
        list.removeItem(new Node("5"));
        System.out.println("==================Start===============");
        list.traverse(list.getRoot());
        System.out.println("===================End================");

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        System.out.println("==================Start===============");
        list.traverse(list.getRoot());
        System.out.println("===================End================");

        list.removeItem(new Node("9"));
        System.out.println("==================Start===============");
        list.traverse(list.getRoot());
        System.out.println("===================End================");

        list.removeItem(new Node("8"));
        System.out.println("==================Start===============");
        list.traverse(list.getRoot());
        System.out.println("===================End================");

        list.removeItem(new Node("6"));
        System.out.println("==================Start===============");
        list.traverse(list.getRoot());
        System.out.println("===================End================");

        list.removeItem(list.getRoot());
        list.removeItem(list.getRoot());
        list.removeItem(list.getRoot());

    }
}
