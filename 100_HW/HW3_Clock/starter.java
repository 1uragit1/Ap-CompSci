/*
 *	Author: Sathvi Reddy
 *  Date: 9/22
 *	Collaborator(s): None
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.println("What day of the week is it?(Type 0 for Sunday, 1 for Monday . . . )");
		int day=sc.nextInt();
		
		if(day>=1 && day<=5){
			System.out.print("Wake up! It's 7:00 AM on a weekday!");
		}
		else if(day==0||day==6){
			System.out.print("Wake up! It's 10:00 AM on a weekend!");
		}
		else{
			System.out.print("You messed up. Make sure you entered a number between 0 and 6");
		}
	}
}
