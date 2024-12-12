/*
 *	Author:  Sathvi Reddy
 *  Date: 12/2
*/

package pkg;
import java.util.*;

public class Spiderman {
	String name;
	String villain;
	int age;
	
	public Spiderman() {
		name="Miles Morales";
		age=13;
		villain="King Pin";
	}
	public Spiderman(String name){
		this.name=name;
		villain="None";
		age=0;
	}
	public Spiderman(String name, int age){
		this.name=name;
		this.age=age;
		villain="None";
	}
	public Spiderman(String name, String villain){
		this.name=name;
		this.age=age;
		this.villain=villain;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setVillain(String villain){
		this.villain=villain;
	}
	public void print(){
		System.out.println("--------------------------------");
		System.out.println("The actor "+name+" is "+age+" years old");
		System.out.println("They play Spiderman who's villain is "+villain);
		System.out.println("--------------------------------");
		System.out.println();
	}
	
}
