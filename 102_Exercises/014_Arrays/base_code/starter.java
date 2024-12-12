/*
 *	Author:Sathvi Reddy
 *  Date:11/4
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr=new int[1001];
		 int i=0;
		 while(i<(arr.length)){
		 	arr[i]=(i+1)*3;
		 	System.out.println(arr[i]);
		 	i++;
		 }
		 System.out.println();
		 
		 for(i=0; i<arr.length; i++){
		 	arr[i]=(i+1)*3;
		 	System.out.println(arr[i]);
		 }
		 
		 System.out.println();
		 i=0;
		 
		 int [] maria=new int[1001];
		 while(i<maria.length){
		 	maria[i]=maria.length-1-i;
		 	System.out.println(maria[i]);
		 	i=i+1;
		 }
		 
		 
	}
}
