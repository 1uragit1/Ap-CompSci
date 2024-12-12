/*
 *	Author:  Sathvi Reddy
 *  Date: 9/24
*/

import java.util.Scanner;
import java.util.Random;

class Character {
	String role= new String("Wizard");
	int charisma=7;
	int strength=5;
	int intelligence=3;
	int dexterity=5;
	
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Character myStats=new Character();
		System.out.println("Your character is a "+myStats.role);
		System.out.println("Charisma: "+myStats.charisma);
		System.out.println("Intelligence: "+myStats.intelligence);
		System.out.println("Strength: "+myStats.strength);
		System.out.println("Dexterity: "+myStats.dexterity);
		
	}
}
