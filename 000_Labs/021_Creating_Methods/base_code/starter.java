/*
 *	Author:  Sathvi Reddy
 *  Date: 9/19
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a){
		System.out.println(a);
		return;
	}
	
	public static void toStringCombined(String a, String b){
		System.out.println(a+" "+b);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Give me a sentence: ");
		String sen1=sc.nextLine();
		System.out.println("Give me another sentence: ");
		String sen2=sc.nextLine();
		toString(sen1);
		toStringCombined(sen1, sen2);
	}
}
