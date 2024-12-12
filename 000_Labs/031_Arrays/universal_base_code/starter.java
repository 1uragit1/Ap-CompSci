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
		int [] arr=new int[10];
		int c=0;
		while(c<10){
			arr[c]=(10-(c+1));
			System.out.println(arr[c]);
			c=c+1;
		}
	}
}
