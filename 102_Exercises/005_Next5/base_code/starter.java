/*
 *	Author: Sathvi Reddy
 *  Date: 9/11
 *	Collaborator(s): Catherine
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int number=sc.nextInt();
		
		System.out.println("Here are the next five numbers!!!");
		System.out.println((number+1)+", "+(number+2)+", "+(number+3)+", "+(number+4)+", "+(number+5));
		
		System.out.println("Here are the next five multiples!!!");
		int x=1;
		while(x<=5){
			System.out.print((number*x)+", ");
			x=x+1;
		}
		System.out.println();
		
		System.out.println("Here is your number divided by 100!!!");
		System.out.println(number/100.0);
		
		System.out.println("Here is your number divided by 10!");
		System.out.println(number/10.0);

	}
}
