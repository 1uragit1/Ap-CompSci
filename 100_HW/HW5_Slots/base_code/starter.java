/*
 *	Author: Sathvi Reddy
 *  Date: 9/30
 * 	Collaborator(s): Catherine

import java.util.Scanner;

class starter {
	public static void slotmachine(){
		
		System.out.println("WELCOME TO THE SLOT MACHINE");
		System.out.println("\nSlot Machine Rules: \n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\na. If two numbers match, you double your money.\nb. If three numbers match, you triple your money.c. If none match, you lose your money");
		Scanner sc=new Scanner(System.in);
		
		int pts=100;
		
		while(true){

				System.out.println("\nWould you like to play the slots? (Yes/yes/y/Y) or (No/no/n/N)");
				String ans=sc.nextLine();
				
				if(ans.equals("No")||ans.equals("no")||ans.equals("n")||ans.equals("N")){
					System.out.print("All good!");
					break;
				}
					
				else if(ans.equals("Yes")||ans.equals("yes")||ans.equals("y")||ans.equals("Y")){
					
					System.out.println("\nYou have " +pts+". How much would you like to wager?");
					int wgr=sc.nextInt();
					sc.nextLine();
					
					while(wgr>pts){
						System.out.println("That's too big! You only have "+pts+" points!");
						System.out.println("Let's try this again: How much would you like to wager?");
						wgr=sc.nextInt();
					}

					int x=(int)(Math.random()*10)+1;
					int y=(int)(Math.random()*10)+1;
					int z=(int)(Math.random()*10)+1;
					System.out.println("\n||  "+x+"  ||  "+y+"  ||  "+z+"  ||\n");
					
					if(x==y && y==z){
						pts=pts+wgr+wgr;
						System.out.println("\nYour wager has been tripled!");
						System.out.println("You now have "+pts+" points!");
					}
					else if((x==y&&y!=z)||(x==z&&z!=y)||(y==z&&z!=x)){
						pts=pts+wgr;
						System.out.println("\nYour wager has been doubled!");
						System.out.println("You now have "+pts+" points!");
					}
					else{
						pts=pts-wgr;
						System.out.println("\nYou lost your wager money!");
						System.out.println("You now have "+pts+" points!");
					}
					
					if(pts==0){
						System.out.println("Sorry! You have no money!");
						break;
					}
					
				}
				else{
					System.out.println("You typed something wrong!");
				}
			}
	}
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
			slotmachine();
	
	}
}
