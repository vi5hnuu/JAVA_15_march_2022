package com.company;

public class Main {

    public static void main(String[] args) {
	StringBuilder stringBuilder=new StringBuilder();
	stringBuilder.append("welcome");
	stringBuilder.append(' ');
	stringBuilder.append("to");
	stringBuilder.append(' ');
	stringBuilder.append("Java");
	stringBuilder.insert(11,"HTML AND ");
	System.out.println(stringBuilder);
    stringBuilder.delete(11,20);
    stringBuilder.deleteCharAt(10);
		System.out.println(stringBuilder);
    stringBuilder.reverse();
		System.out.println(stringBuilder);
		stringBuilder.replace(11,15,"HTML");
		stringBuilder.setCharAt(0,'W');
		System.out.println(stringBuilder);

		System.out.println("-------------------");
		StringBuilder s1=stringBuilder.reverse();
		System.out.println(stringBuilder);
		System.out.println(s1);
		s1.append(15);
		System.out.println(stringBuilder);
		System.out.println(s1);
    }
}
