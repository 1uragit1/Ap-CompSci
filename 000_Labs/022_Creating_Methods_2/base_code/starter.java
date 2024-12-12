/*
 *	Author:  Sathvi Reddy
 *  Date: 9/19
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static int pow(int a, int b){
        int x=a;
        int counter=1;
        int answer;
        
        while(counter<b){
            a=a*x;
            counter=counter+1;
        }
        return a;
    }
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		System.out.println("Give me your base: ");
		int base=sc.nextInt();
		
		System.out.println("Give me your exponent: ");
		int exp=sc.nextInt();
		
		System.out.print("Your answer is: "+pow(base, exp));
	}
}
