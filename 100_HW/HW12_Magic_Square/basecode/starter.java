/*
 *	Author: Sathvi Reddy
 *  Date: 11/24
*/

import pkg.*;
import java.util.*;
import java.io.*;  

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many special squares would you like?: ");
		int n=sc.nextInt();
		System.out.println();
		CVMath.specialSquare(n);
		// System.out.println(CVMath.findMid(2, 3, 1));
	}
}
