/*
 *	Author:  Sathvi Reddy
 *  Date:9/23
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Enter you character name: "); 
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.print("Enter your title: ");
		String title=sc.nextLine();
		System.out.print("Enter the role of your choice: Wizard, Warrior, or Rogue: ");
		String role=sc.nextLine();
		if((role.equals("Wizard"))||(role.equals("wizard"))||(role.equals("Warrior"))||(role.equals("warrior"))||(role.equals("Rogue"))||(role.equals("rogue"))){
			System.out.println("You're a "+role+"!\n");
		}
		else{
			System.out.println("You did something wrong! Try running again but watch your spelling!\n");
		}
		
		System.out.println("You have 20 points to spend on Strength, Dexterity, Intelligence, and Charisma\nYou can spend up to 10 points on each");
		
		System.out.print("\nStrength: ");
		int s=sc.nextInt();
		int total=s;
		if(s>10 ||total>20){
			System.out.print("Enter a smaller value: ");
			s=sc.nextInt();
		}
		total=s;
		System.out.println("You have "+(20-total)+" left to spend!\n");
		
		System.out.print("Dexterity: ");
		int d=sc.nextInt();
		total=s+d;
		if(d>10 || total>20){
			System.out.print("Enter a smaller value: ");
			d=sc.nextInt();
		}
		total=s+d;
		System.out.println("You have "+(20-total)+" left to spend!\n");
		
		System.out.print("Intelligence: ");
		int i=sc.nextInt();
		total=s+d+i;
		if(i>10 || total>20){
			System.out.print("Enter a smaller value: ");
			i=sc.nextInt();
		}
		total=i+s+d;
		System.out.println("You have "+(20-total)+" left to spend!\n");
	
		System.out.print("Charisma: ");
		int c=sc.nextInt();
		total=s+d+i+c;
		if(c>10 || total>20){
			System.out.print("Enter a smaller value: ");
			c=sc.nextInt();
		}
		total=c+i+s+d;
		System.out.println("You have "+(20-total)+" left to spend!");
		
		System.out.println("\n-------");
		System.out.println("STATS\n");
		System.out.println("Strength: "+s+" points");
		System.out.println("Dexterity: "+d+" points");
		System.out.println("Intelligence: "+i+" points");
		System.out.println("Charisma: "+c+" points");

		if(total<20){
			System.out.println("\nYou have "+(20-total)+" point(s) leftover");
		}
	}
}
