package com.sumanth.practice.Condtions;

import java.util.Scanner;

public class checkInputCharacter {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a Character : ");
		char ch= scn.next().charAt(0);

		if (ch>='0' && ch<='9'){
			System.out.println(ch + " is a Digit");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println(ch + " is an Alphabet");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println(ch + " is an Alphabet");
		}
		else {
			System.out.println(ch + " is a Special Character");
		}
	}
}
