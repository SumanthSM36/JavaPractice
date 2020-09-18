import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
	// write your code here
	    Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Integer value:");
        int a = scn.nextInt();
        System.out.println("Enter a Char value:");
        char ch = scn.next().charAt(0);
        System.out.println("Enter a Float value:");
        float f = scn.nextFloat();
        System.out.println("The Integer Value is:" + a);
        System.out.println("The Character Value is:" + ch);
        System.out.println("The Float Value is:" + f);
    }
}
