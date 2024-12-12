/*
 *	Author:  Sathvi Reddy
 *  Date: 10/17
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter stats=new myCharacter();
		System.out.println("Your role is "+stats.role);
		System.out.println("\n--------------STATS----------------");
		System.out.println("Strength: "+stats.strength);
		System.out.println("Intelligence: "+stats.intelligence);
		System.out.println("Charisma: "+stats.charisma);
		System.out.println("Dexterity: "+stats.dexterity);
	}
}
