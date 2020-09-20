package com.sumanth.practice.Condtions;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

// For two numbers
		System.out.println("Enter a 2 Num:");
		int num1 = scn.nextInt();
		int num2=scn.nextInt();

		if(num1>num2 ){
			System.out.println(num1 + " is Maximum number");
		}
		else {
			System.out.println(num2 + " is Minimum number");
		}

// For three numbers
//		System.out.println("Enter a 3 Num:");
//		int num1 = scn.nextInt();
//		int num2 = scn.nextInt();
//		int num3 = scn.nextInt();
//
//		if (num1>num2 && num1>num3){
//			System.out.println(num1 + " is a Maximum number");
//		}
//		else if (num2>num3 && num2>num1){
//			System.out.println(num2 + " is a Maximum number");
//		}
//		else {
//			System.out.println(num3 + " is a Maximum number");
//		}
	}
}
