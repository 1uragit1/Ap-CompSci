/*
 *	Author:  Sathvi Reddy
 *  Date: 9/11
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Can I have a number please?");
		int x=sc.nextInt();
		
		System.out.println("Can I have another number please?");
		int y=sc.nextInt();
		
		System.out.println("Can I have a third number please?");
		int z=sc.nextInt();
		
		if((x>y) && (x>z)){
			System.out.println("Your first number was the biggest!!!!");
		}
		if((y>x )&& (y>z)){
			System.out.println("Your second number was the biggest!!!!");
		}
		if((z>y) && (z>x)){
			System.out.println("Your third number was the biggest!!!!");
		}
		
		if((x<y) && (x<z)){
			System.out.println("Your first number was the smallest!!!!");
		}
		if((y<x) && (y<z)){
			System.out.println("Your second number was the smallest!!!!");
		}
		if((z<y) && (z<x)){
			System.out.println("Your third number was the smallest!!!!");
		}
	}
}
