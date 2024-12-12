/*
 *	Author:  Sathvi Reddy
 *  Date: 11/1
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	String name;
	int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("name");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name=name;
		this.age=age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String name){
		
		this.name=name;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	
	public boolean isSameName(PooleDwarf dwarf){
		if(name.equals(dwarf.getName())){
			return true;
		}
		else{
			return false;
		}
	}
}

