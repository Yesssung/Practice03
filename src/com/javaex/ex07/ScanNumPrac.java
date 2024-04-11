package com.javaex.ex07;

import java.util.Scanner;

public class ScanNumPrac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for(int a = 1; a <= num; a++  ) {
			for(int b = 0; b <= a; b++) {
				System.out.print(b);
			}
			System.out.println();
		}

		
		sc.close();
	}

}
