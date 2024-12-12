/*
 *	Author: Sathvi Reddy
 *  Date: 9/23
 * 	Collaborator: Catherine Chiu
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num1=sc.nextInt();
		System.out.print("Enter another integer: ");
		int num2=sc.nextInt();
		
		if(num1%2==0){
			System.out.println("\n"+num1+" is an even number!");
		}
		else{
			System.out.println("\n"+num1+" isn't an even number");
		}
		
		if(num1%3==0){
			System.out.println(num1+"'s divisible by 3");
		}
		if(num1%4==0){
			System.out.println(num1+"'s divisible by 4");
		}
		if(num1%5==0){
			System.out.println(num1+"'s divisible by 5");
		}
		
		else{
			System.out.println(num1+" isn't divisible by 3, 4, and 5\n");
		}
		
		
		
		if(num2%2==0){
			System.out.println("\n"+num2+" is an even number!");
		}
		else{
			System.out.println("\n"+num2+" isn't an even number");
		}
		
		if(num2%3==0){
			System.out.println(num2+"'s divisible by 3");
		}
		if(num2%4==0){
			System.out.println(num2+"'s divisible by 4");
		}
		if(num2%5==0){
			System.out.println(num2+"'s divisible by 5");
		}
		
		else{
			System.out.println(num2+" isn't divisible by 3, 4, and 5\n");
		}
	}
}
