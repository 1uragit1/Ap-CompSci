/*
 *	Author:  Sathvi Reddy
 *  Date: 10/14
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String [] arr=new String[10];
		arr[0]="Blackbird singing in the dead of night";
		arr[1]="Take these broken wings and learn to fly";
		arr[2]="All your life, you were only waiting for this moment to arise";
		arr[3]="Blackbird singing in the dead of night";
		arr[4]="Take these sunken eyes and learn to see";
		arr[5]="All your life, you were only waiting for this moment to be free";
		arr[6]="Blackbird fly";
		arr[7]="Blackbird fly";
		arr[8]="Into the light of a dark, black night";
		arr[9]="Blackbird fly";
		int c=0;
		while(c<10){
			System.out.println(arr[c]);
			c=c+1;
		}
		
	}
}
