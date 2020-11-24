package com.buzzfreeze.helloWorld;
import java.util.Scanner;

public class HomeWork4 {
	public static void main(String [] args) {
		multipleTable();
	}
	public static void multipleTable() {
		System.out.print("Enter number :");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		int count = 0;
		while(count<12) {
			count++;
			System.out.println(count+"X"+num+"="+count*num);
		}
	}
}
