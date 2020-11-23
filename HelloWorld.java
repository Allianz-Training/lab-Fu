package com.buzzfreeze.helloWorld;

public class HelloWorld {
	public static void main(String [] args) {
		lab1();
		lab2_1("John");
		lab2_2();
		lab2_3();
		lab3();
		lab4(20,false);
		lab4_opt_1(101);
		lab4_opt_2();
		lab5(80);
		lab6_1();
		lab6_2();
		lab6_3();
		lab6_4();
		lab7_1();
		lab7_2();
		lab8();
		lab9();
		lab10();
		lab11_1();
		System.out.println(lab11_2());
	}
	public static void lab1() {
		System.out.println("Hello World");
//		comment 1 line
		/*
		 comment
		 many
		 lines
		*/
		int myNum = 99;
		boolean myBoolean = true;
		String myString = "Hello";
		float myFloat = 99.9f;
		double myDouble = 99.99d;
		char myChar = 'C';
		System.out.println("This is int = " + myNum);
		System.out.println("This is boolean = " + myBoolean);
		System.out.println("This is String = " + myString);
		System.out.println("This is float = " + myFloat);
		System.out.println("This is double = " + myDouble);
		System.out.println("This is char = " + myChar);
	}
	public static void lab2_1(String args) {
		String dogname = args;
		System.out.println("The Dog name = " + dogname + " bark");
	}
	public static void lab2_2() {
		float primInt = 99; //change int to float
		int primFloat = 99.99f; //change float to int 
		float primDouble = 99.99d; //change double to float
		int primChar = 'C'; //change char to int
	}
	public static void lab2_3() {
			final String hello = "Hello";
			hello = "World";
			System.out.println(hello);
	}
	public static void lab3() {
		int i = 20;
		for(int j=0;j<5;j++) i++;
		System.out.println("i++ 5 times = " + i);
		for(int j=0;j<5;j++) i--;
		System.out.println("i-- 5 times = " + i);
		float float1 = 1;
		float float2 = 2;
		if((float1 == 1) && (float2 == 2)) System.out.println("float1 is 1 AND float2 is 2");
		if((float1 == 1) || (float2 == 1)) System.out.println("float1 is 1 OR float2 is 1");
	}
	public static void lab4(int score, boolean isHansome) {
		if(isHansome) {
			System.out.println("Good");
		}
		else {
			if(score >= 80) System.out.println("Good");
			else if(score >= 50) System.out.println("normal");
			else System.out.println("fail");
		}
	}
	public static void lab4_opt_1(int waterPoint) {
		float waterCost = 0;
		if(waterPoint<1) {
			waterPoint = 1;
			waterCost = 4.25f;
		}
		else if(waterPoint<=50) waterCost = 4.25f;
		else if(waterPoint<=100) waterCost = 3.25f;
		else waterCost = 2.25f;
		System.out.println("Cost of water is " + waterCost*waterPoint);
	}
	public static void lab4_opt_2() {
		int product = 2000;
		int count = 0;
		while(product<5000) {
			product += 365;
			count++;
		}
		System.out.println("This copany take " + count + " years to produce product over 5000 units per year.");
	}
	public static void lab5(int score) {
		switch(score) {
		case 80:
			System.out.println("A"); break;
		case 70:
			System.out.println("B"); break;
		case 60:
			System.out.println("C"); break;
		case 50:
			System.out.println("D"); break;
		case 40:
			System.out.println("F"); break;
		default:
			System.out.println("E");
		}
	}
	public static void lab6_1() {
		int i = 0;
		while(i++ <= 10) {
			System.out.println("i = " + i);
		}
	}
	public static void lab6_2() {
		int i = 1;
		int sum = 0;
		while(i<=10) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of 1-10 = " + sum);
	}
	public static void lab6_3() {
		int i = 1;
		while(i<=100) {
			if(i%12 == 0) System.out.println(i + " : mod 12 = 0");
			i++;
		}
	}
	public static void lab6_4() {
		int [] number = {1,2,3,4,5};
		for(int count : number) {
			System.out.println(count);
		}
	}
	public static void lab7_1() {
		int count = 20;
		do {
			System.out.println(count);
			count--;
		} while(count>0);
	}
	public static void lab7_2() {
		
	}
	public static void lab8() {		
		for(int count = 0; count<=20; count++) {
			if(count == 11) {
				System.out.println(count);
				break;
			}
			System.out.println("Hello");
		}
	}
	public static void lab9() {
		for(int count = 0; count<=20; count++) {
			if(count == 11) {
				System.out.println(count);
				continue;
			}
			System.out.println("Hello");
		}
	}
	public static void lab10() {
		for(int count = 0; count<10; count++) {
			if(count == 2) continue;
			System.out.println(count);
		}
	}
	public static void lab11_1() {
		System.out.println("not return method");
	}
	public static String lab11_2() {
		return "return method";
	}
}
