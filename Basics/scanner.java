package com.sumanth.practice.Basics;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
	// write your code here
	    Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Integer value:");
        int a = scn.nextInt();
        System.out.println("Enter a Char value:");
        char b = scn.next().charAt(0);
        System.out.println("Enter a Float value:");
        float c = scn.nextFloat();
        System.out.println("The Integer Value is:" +a);
        System.out.println("The Character Value is:" +b);
        System.out.println("The Float Value is:" + c);
    }
}
