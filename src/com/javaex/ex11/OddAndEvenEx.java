package com.javaex.ex11;

import java.util.Scanner;

public class OddAndEvenEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(num % 2 == 0 ) {
				System.out.println();
			} else if(num % 2 == 1) {
				System.out.println(sum);
			} 
			
		}
		
		sc.close();
	}

}
