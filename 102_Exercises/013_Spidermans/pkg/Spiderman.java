package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?
	
	public Spiderman(){
		actor="unknown";
		age=0;
		villain="unknown";
	}
	
	public Spiderman(String actor){
		this.actor=actor;
		age=0;
		villain="unknown";
	}
	
	public Spiderman(int age){
		this.age=age;
		actor="unknown";
		villain="unknown";
	}
	
	public Spiderman(String actor, int age){
		this.actor=actor;
		this.age=age;
		villain="unknown";
	}
	
	public Spiderman(String n, int a, String v){
		actor=n;
		age=a;
		villain=v;
	}
	
	

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	
	public void setVillain(String villain){
		this.villain=villain;
	}
	public void setActor(String actor){
		this.actor=actor;
	}
	public void setAge(int age){
		this.age=age;
	}
	
	
	
	public int getAge(){
		return age;
	}
	public String getActor(){
		return actor;
	}
	public String getVillain(){
		return villain;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}