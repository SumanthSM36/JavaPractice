package com.sumanth.practice.Operators;

import java.util.Scanner;

public class swapping {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);

		//Swapping with 3rd Variable
		System.out.println("Enter a Value for a & b:");
		int a=scn.nextInt(),b=scn.nextInt(),temp;

		temp=a;
		a=b;
		b=temp;
		System.out.println("Swapping two numbers using 3rd variable: " + "a="+a+" b="+b);

//		Swapping without 3rd Variable
		System.out.println("Enter a Value for c & d:");
		int c=scn.nextInt(),d=scn.nextInt();
		c=c+d;
		d=Math.abs(c-d);
		c=Math.abs(c-d);

		System.out.println("Swapping two numbers without 3rd Variable: "+"c="+c+" d="+d);
	}
}
