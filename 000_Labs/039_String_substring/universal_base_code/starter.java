/*
 *	Author: Sathvi Reddy
 *  Date: 11/22
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A WORD: ");
		String x=sc.nextLine();
		
		System.out.print("The word you entered was ");
		for(int i=0; i<x.length(); i++){
			System.out.print(x.substring(i, i+1));
		}
		System.out.println("\nYour word---letter by letter:");
		for(int i=0; i<x.length(); i++){
			System.out.println(""+i+" "+x.substring(i, i+1));
		}

		
	}
}
