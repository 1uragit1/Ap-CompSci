/*
 *	Author:  Sathvi Reddy
 *  Date: 11/1
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

public class starter {
	
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf d1=new PooleDwarf(randName(),5);
		PooleDwarf d2=new PooleDwarf(randName(), 6);
		PooleDwarf d3=new PooleDwarf(randName(), 7);
		PooleDwarf d4=new PooleDwarf(randName(), 8);
		PooleDwarf d5=new PooleDwarf(randName(), 9);
		PooleDwarf d6=new PooleDwarf(randName(), 10);
		PooleDwarf d7=new PooleDwarf(randName(), 10);
		
		int c=0;
		
		if(d1.isSameName(d2)){
			c++;
		}
		if(d1.isSameName(d3)){
			c++;
		}
		if(d1.isSameName(d4)){
			c++;
		}
		if(d1.isSameName(d5)){
			c++;
		}
		if(d1.isSameName(d6)){
			c++;
		}
		if(d1.isSameName(d7)){
			c++;
		}
		
		System.out.println("There were "+c+" duplicates of "+d1.getName());
	}
}
