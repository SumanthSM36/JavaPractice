package com.sumanth.practice.Condtions;

import java.util.Scanner;

public class checkVowels {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a Character : ");
		char ch = scn.next().charAt(0);

		if ((ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')  |
				(ch == 'A'  || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
			System.out.println(ch + " is a Vowel");
		}
		else if((ch>='a' && ch<='z') | (ch>='A' && ch<='Z')){
			System.out.println(ch + " is Consonant");
		}
		else{
			System.out.println(ch + " is not a Vowel or Consonant");
		}

	}
}
