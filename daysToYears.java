package com.sumanth.practice.Operators;

public class daysToYears {
	public static void main(String[] args) {
		int inputDays = 1000;

		int years = inputDays/365 ;
		int weeks=(inputDays%365)/7;
		int days=(inputDays%365)%7;
		System.out.println("For " + inputDays + " days :");
		System.out.println("Years :"+ years);
		System.out.println("Weeks : "+ weeks);
		System.out.println("Days :"+ days);
 	}
}