package com.sumanth.practice.Operators;

import java.util.Scanner;

public class daysToYears {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a Days :");
		int inputDays = scn.nextInt();

		int years = inputDays/365 ;
		int weeks=(inputDays%365)/7;
		int days=(inputDays%365)%7;
		long a= 102047;
		System.out.println("For " + inputDays + " days :");
		System.out.println("Years :"+ years);
		System.out.println("Weeks : "+ weeks);
		System.out.println("Days :"+ days);
 	}
}