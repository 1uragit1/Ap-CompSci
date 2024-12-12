/*
 *	Author: Sathvi Reddy
 *  Date: 10/7
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int c){
		int counter=2;
		while(counter<c){
			if(c%counter==0){
				return false;
			}
			counter=counter+1;
		}
		return true;
	}
	
	public static void printPrimes(int p){
		int count=2;
		while(count<p){
			if(checkPrime(count)==true){
				System.out.println(count);
			}
			count=count+1;
		}
	}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.print("Input an integer: ");
		int m=sc.nextInt();
		printPrimes(m);
	}
}
