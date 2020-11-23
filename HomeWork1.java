package com.buzzfreeze.helloWorld;

public class HomeWork1 {
	public static void main (String [] args) {
		draw1(2);
		draw2(2);
		draw3(3);
		draw4(4);
		draw5(4);
		draw6(4);
		draw7(3);
		draw8(3);
	}
	public static void draw1(int n) {
		int i = 0;
		while(i<n) {
			System.out.print("*");
			i++;
		}
	}
	public static void draw2(int n) {
		int row = 0;
		while(row<n) {
			int col = 0;
			while(col<n) {
				System.out.print("*");
				col++;
			}
			row++;
			System.out.println();
		}
	}
	public static void draw3(int n) {
		int row = 0;
		while(row<n) {
			int col = 0;
			while(col<n) {
				System.out.print(col+1);
				col++;
			}
			row++;
			System.out.println();
		}
	}
	public static void draw4(int n) {
		int row = 0;
		while(row<n) {
			int col = 0;
			int newN = n;
			while(col<n) {
				System.out.print(newN);
				col++;
				newN--;
			}
			row++;
			System.out.println();
		}
	}
	public static void draw5(int n) {
		int row = 0;
		while(row<n) {
			int col = 0;
			while(col<n) {
				System.out.print(row+1);
				col++;
			}
			row++;
			System.out.println();
		}
	}
	public static void draw6(int n) {
		int row = 0;
		int newN = n;
		while(row<n) {
			int col = 0;
			while(col<n) {
				System.out.print(newN);
				col++;
			}
			newN--;
			row++;
			System.out.println();
		}
	}
	public static void draw7(int n) {
		int row = 0;
		int count = 1;
		while(row<n) {
			int col = 0;
			while(col<n) {
				System.out.print(count);
				col++;
				count++;
			}
			row++;
			System.out.println();
		}
	}
	public static void draw8(int n) {
		int row = 0;
		int count = n*n;
		while(row<n) {
			int col = 0;
			while(col<n) {
				System.out.print(count);
				col++;
				count--;
			}
			row++;
			System.out.println();
		}
	}
}
