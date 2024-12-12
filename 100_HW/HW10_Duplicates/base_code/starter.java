/*
 *	Author: Sathvi Reddy
 *  Date: 11/7
 * 	Collaborator(s): Catherine Chiu
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr =new int[20];
		for(int i=0; i<20;i++){
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		int x=(int)(Math.random()*10+1);
		System.out.println("\nThe random number we're looking for is "+x);
		int dup=0;
		for(int i=0; i<20; i++){
			if(arr[i]==x){
				dup=dup+1;
				System.out.println("Duplicate found at index "+i);
			}
		}
		System.out.println("There are "+dup+" duplicate(s) of "+x);
		
		for (int i=0; i<19; i++){
			if(arr[i]==(arr[i+1]-1)){
				System.out.println("Consecutive integers: "+arr[i]+" (index "+i+")"+" and "+arr[i+1]+" (index "+(i+1)+")");
			}
		}
	}
}
