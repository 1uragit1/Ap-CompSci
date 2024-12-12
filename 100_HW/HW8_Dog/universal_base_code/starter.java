/*
 *	Author: Sathvi Reddy
 *  Date: 10/26
 *	Collaborator(s): None
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		
		
		Dog speedo=new Dog("Speedo");
		speedo.setAge(10);

		Dog max=new Dog("German Shepherd","Max");
		
		if(speedo.isSleeping()==true){
			System.out.println("Speedo's sleeping!");
		}
		else{
			speedo.bark();
		}
		if(max.isSleeping()){
			if(speedo.isSleeping()==true){
				max.bark();
			}
			else{
				max.bark();
			}
		}

	}
}
