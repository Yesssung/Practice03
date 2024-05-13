package com.javaex.ex10;

import java.util.Scanner;

public class NumFiveEx {

	public static void main(String[] args) {
		
		int num [] = new int [5];
		int max = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		System.out.print("숫자 : ");
		for (int i = 0; i < num.length; i++) {
			
			num[i] = sc.nextInt();
			System.out.print("숫자 : ");
				if(max < num[i]) {
					max = num[i];
			}
		}
		System.out.println("최대값은" + max + "입니다.");
		
		sc.close();
	}

}
