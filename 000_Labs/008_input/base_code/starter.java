/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name?");
		String text = sc.nextLine();
		System.out.println("Your name is "+text);
		
		System.out.println("What is your age?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Your age is "+age);
		
		System.out.println("What is your birthday month?");
		String birthdaymonth = sc.nextLine();
		System.out.println("Your birth month is "+birthdaymonth);
		
		System.out.println("What is your birthday day?");
		int birthdayday = sc.nextInt();
		System.out.println("Your birthdate is " + birthdayday);
		
		System.out.println("What is your birthday year?");
		int birthdayyear = sc.nextInt();
		sc.nextLine();
		System.out.println("Your birthyear is "+birthdayyear);
		
		System.out.println("How much is a buck fifty?");
		double buckfifty = sc.nextDouble();
		System.out.println("A buck fifty is "+buckfifty);
	}
}
