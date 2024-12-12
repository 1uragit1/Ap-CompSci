/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		// BaseClass test = new BaseClass();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name(first and last): ");
		String name=sc.nextLine();
		
		System.out.println(name.substring(name.indexOf(" ")+1));
		
	}
}
