/*
 *	Author: Sathvi Reddy  
 *  Date: 9/26
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int s;
	int i;
	int d;
	int c;
	Scanner sc=new Scanner(System.in);

	public BaseClass() {
		
		role=("no role");
		s=0;
		i=0;
		d=0;
		c=0;
		
		
	}
	public void askClass(){
			System.out.print("What is your class?: ");
			
			role=sc.nextLine();
		}
		public void myToString(){
			System.out.println("Your role is a "+role);
			System.out.println("Strength: "+s);
			System.out.println("Charisma: "+c);
			System.out.println("Intelligence: "+i);
			System.out.println("Dexterity: "+d);
		}

}

