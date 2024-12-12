/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Your are a Wizard, Warrior or a Rogue");
		Scanner sc=new Scanner(System.in);
		String role=sc.nextLine();
		
		if((role.equals("Wizard"))||(role.equals("wizard"))||(role.equals("Warrior"))||(role.equals("warrior"))||(role.equals("Rogue"))||(role.equals("rogue"))){
			System.out.println("You got it!");
		}
		else{
			System.out.println("Try again!");
		}
	}
}
