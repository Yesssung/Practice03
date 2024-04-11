package com.javaex.ex08;

public class Gugudan {

	public static void main(String[] args) {

		int dan;
		int num;
		
		for(num = 1; num <= 9; num++) {
			for(dan = 2; dan <= 9; dan++) {
				System.out.print(dan + " * " + num + " = " + (dan*num) + "\t");
			}
			System.out.println();
		}

	}

}
