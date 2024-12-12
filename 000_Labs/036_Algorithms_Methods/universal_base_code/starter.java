/*
 *	Author:  Sathvi Reddy
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int [] a){
		System.out.println("THESE ARE THE ELEMENTS IN YOUR ARRAY!!!!");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		System.out.println();
	}
	public static void getArrayAverage(int [] a){
		System.out.print("The average of all the values in this array is ");
		int sum=0;
		for(int i=0; i<a.length;i++){
			sum=sum+a[i];
		}
		System.out.print(sum/a.length);
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		int [] arr=new int[100];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=(int)(Math.random()*100+1);
		}
		toStringArray(arr);
		getArrayAverage(arr);
		
	}
}
