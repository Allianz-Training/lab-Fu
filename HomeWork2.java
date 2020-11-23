package com.buzzfreeze.helloWorld;

public class HomeWork2 extends HomeWork1 {
	public static void main(String [] args) {
		String[][] table = { 
			     { "1", "2", "3" }, 
			     { "4", "5", "6" }, 
			     { "7", "8", "9" } 
			}; 
			multiplyTable(table);
	}
	public static void multiplyTable(String[][] table) {
		for(String[] row : table) {
			int count = 0;
			for(String element : row) {
				int elementInt = Integer.parseInt(element);
				System.out.print(elementInt*2);
				if(count<row.length-1) System.out.print(",");
				count++;
			}
			System.out.println();
		}
	}
}
