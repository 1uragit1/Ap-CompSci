/*
 *	Author:Sathvi Reddy
 *  Date:9/16
 *	Collaborator(s): Catherine
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1=sc.nextInt();
		System.out.println("Enter your second number(bigger than the first)");
		int num2=sc.nextInt();
		
		System.out.println("Your range is "+num1+" to "+num2);
		System.out.print("5 random numbers within this range are ");
		
		System.out.print((int)(Math.random()*(num2-num1)+num1)+", ");
		System.out.print((int)(Math.random()*(num2-num1)+num1)+", ");
		System.out.print((int)(Math.random()*(num2-num1)+num1)+", ");
		System.out.print((int)(Math.random()*(num2-num1)+num1)+", ");
		System.out.print((int)(Math.random()*(num2-num1)+num1)+", ");
	}
}
