/*
 *	Author:  Sathvi Reddy
 *  Date: 9/19
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a name:");
		String name=sc.nextLine();
		
		System.out.println("How many times would you like this name to be printed?");
		int num=sc.nextInt();
		int c=0;
		
		while (c<num){
			System.out.println(name);
			c=c+1;
		}


		
	}
}
