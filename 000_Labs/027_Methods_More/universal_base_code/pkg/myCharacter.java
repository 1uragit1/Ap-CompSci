/*
 *	Author:  Sathvi Reddy
 *  Date: 10/25
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	Scanner sc=new Scanner(System.in);
	int s;
	int d;
	int i;
	int c;
	
	
	public myCharacter() {
		role=("no role");
		s=0;
		i=0;
		d=0;
		c=0;
		
		
	}
	public String setRole(String r){
		// System.out.println("What role would you like? Wizard, warrior, or rogue: ");
		// role=sc.nextLine();
			
		if((role.equals("Wizard"))||(role.equals("wizard"))||(role.equals("Warrior"))||(role.equals("warrior"))||(role.equals("Rogue"))||(role.equals("rogue"))){
			System.out.println("Cool, you're a "+role+"!");
		}
		else{
			role=("no role");
		}
		return role;
	}
	public int setStrength(int S){
		if(S<0){
			s=0;
		}
		return s;
	}
	
	public int setDexterity(int D){
		if(D<0){
			d=0;
		}
		return d;
	}
	
	public int setIntelligence(int I){
		if(I<0){
			i=0;
		}
		return i;
	}
	
	public int setCharisma(int C){
		if(C<0){
			c=0;
		}
		return c;
	}
	
	public boolean setAll(String k, int a, int b, int c, int d){
			return true;
	}
	
	public void myToString(){
		
		System.out.println("Your role is: "+(setRole(role)));
		System.out.println("Strength: "+ (setStrength(-6)));
		System.out.println("Intelligence: "+(setIntelligence(-9)));
		System.out.println("Charisma: "+(setCharisma(-7)));
		System.out.println("Dexterity: "+(setDexterity(-5)));
		
		System.out.println("\nWhat role would you like? Wizard, warrior, or rogue: ");
		role=sc.nextLine();
		
		if(setAll(role, s, i, d, c)==true){
			System.out.println("\nYour role is: "+(setRole(role)));
			System.out.println("Strength: "+ (setStrength(-6)));
			System.out.println("Intelligence: "+(setIntelligence(-9)));
			System.out.println("Charisma: "+(setCharisma(-7)));
			System.out.println("Dexterity: "+(setDexterity(-5)));
		}
	}

}

