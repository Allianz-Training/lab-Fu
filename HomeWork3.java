package com.buzzfreeze.helloWorld;

public class HomeWork3 {
	public static void main(String [] args) {
//		draw9(3);
//		draw10(3);
//		draw11(4);
//		draw12(4);
//		draw13(4);
//		draw14(4);
//		draw15(4);
//		draw16(4);
		draw17(4);
	}
	public static void draw9(int n) {
		int i = 0;
		while(i<n) {
			System.out.println(i*2);
			i++;
		}
	}
	public static void draw10(int n) {
		int i = 1;
		while(i<n) {
			System.out.println(i*2);
			i++;
		}
	}
	public static void draw11(int n) {
		int row = 0;
		while(row<n) {
			int col = 0;
			int sum = 0;
			row++;
			while(col<n) {
				sum = sum + row;
				System.out.print(sum+" ");
				col++;
			}
			System.out.println();
		}
	}
	public static void draw12(int n) {
		int row = 0;
		while(row<n) {
			int col = 0;
			while(col<n) {
				if(row==col) System.out.print("_");
				else System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}
	public static void draw13(int n) {
		int row = 0;
		int underscore = n;
		while(row<n) {
			underscore--;
			int col = 0;
			while(col<n) {
				if(underscore==col) System.out.print("_");
				else System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
	}
	public static void draw14(int n) {
		int row = 0;
		int count = 0;
		while(row<n) {
			int col = 0;
			count++;
			while(col<n) {
				if(col>=count) System.out.print("_");
				else System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}	
	}
	public static void draw15(int n) {
		int row = 0;
		int count = n;
		while(row<n) {
			int col = 0;
			while(col<n) {
				if(col>=count) System.out.print("_");
				else System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
			count--;
		}	
	}
	public static void draw16(int n) {
		draw14(n);
		int row = 0;
		int count = n-1;
		while(row<n) {
			int col = 0;
			while(col<n) {
				if(col>=count && col!=n) System.out.print("_");
				else System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
			count--;
		}	
	}
	public static void draw17(int n) {
		int row = 0;
		int count = 0;
		while(row<n) {
			int col = 0;
			row++;
			count++;
			while(col<n) {
				if(col>=count) System.out.print("-");
				else System.out.print(row);
				col++;
			}
			System.out.println();
		}
		row = 0;
		count = n-1;
		while(row<n-1) {
			int col = 0;
			while(col<n) {
				if(col>=count && col!=n) System.out.print("-");
				else System.out.print(count);
				col++;
			}
			System.out.println();
			row++;
			count--;
		}	
	}
}
