/*
 *	Author:Sathvi Reddy
 *  Date:10/19
 *	Collaborator(s):None
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		Cipher message=new Cipher();
		System.out.println("Please enter a message!");
		String mes=sc.nextLine();
		System.out.println("Your message encoded is "+message.encode(mes));
	}
}
