/*
 *	Author:  Sathvi Reddy
 *  Date: 9/16
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ENTER A NUMBER: ");
		int num1=sc.nextInt();
		
		System.out.print("ENTER ANOTHER NUMBER: ");
		int num2=sc.nextInt();
		
		if(num1==num2){
			System.out.println("\nYOUR NUMBERS ARE THE SAME!");
		}
		
		if(num1!=num2){
			System.out.println("\nYOUR NUMBERS ARE NOT THE SAME!");
		}
		
	}
}
