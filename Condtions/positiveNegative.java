package com.sumanth.practice.Condtions;

import java.util.Scanner;

public class positiveNegative {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Num:");
		int num = scn.nextInt();

		if (num>0){
			System.out.println("The number is Positive");
		}
		else if (num<0){
			System.out.println("The number is Negative");
		}
		else{
			System.out.println("The number is Zero");
		}
	}
}
