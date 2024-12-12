/*
 *	Author:  Sathvi Reddy
 *  Date: 11/4
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		int x=(int)(Math.random()*150+51);
		int [] arr=new int[x];
		int c=x;
		while(c>0){
			arr[c-1]=(int)(Math.random()*100+1); 
			c=c-1;
		}
		int min=arr[0];
		
		for(int i=0; i<x ;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		
		int max=arr[0];
		
		for(int i=0; i<x ;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum=sum+arr[i];
		}
		
		System.out.println("There are "+arr.length+" elements in this array!");
		System.out.println("The minimum is "+min);
		System.out.println("The maximum is "+max);
		System.out.println("The average is "+sum/arr.length);
		
	}
}
