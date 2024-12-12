/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		
		int answer=74;
		
		System.out.println("Guess a number between 1 and 1000");
		int guess=sc.nextInt();
		
		if(answer==guess){
			System.out.print("You got it!!!");
		}
		else if(answer>guess){
			System.out.print("Your number was too small!!!");
		}
		else if(answer<guess){
			System.out.print("Your number was too huge!!!");
		}
	}
}
