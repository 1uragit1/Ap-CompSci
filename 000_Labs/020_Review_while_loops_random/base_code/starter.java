/*
 *	Author: Sathvi Reddy
 *  Date: 10/1
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		
		int guess=0;
		int secret=(int)(Math.random()*100);
		
		while(true){
			if(guess==secret){
				break;
			}
			
			System.out.println("Enter your guess: ");
			guess=sc.nextInt();
			
		}
		
		System.out.println("You got it!");

		
	}
}
