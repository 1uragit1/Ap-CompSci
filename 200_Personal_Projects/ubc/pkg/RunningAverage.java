/*
 *	Author: Sathvi Reddy
 *  Date: 11/3
*/


package pkg;
import java.util.Scanner;
import java.util.Random;


public class RunningAverage 
{ 
/** The number of ratings included in the running average. */ private int count; 
/** The average of the ratings that have been entered. */ private double average; 
// There are no other instance variables. 

/** Creates a RunningAverage object. 
* Postcondition: count is initialized to 0 and average is 
* initialized to 0.0. 
*/ 
	public RunningAverage() 
	{ /* implementation not shown */ 
		count=0;
		average=0.0;
	} 
	
/** Updates the running average to reflect the entry of a new 
* rating, as described in part (a). 
*/  double b;
	public void updateAverage(double newVal) 
	{ /* to be implemented in part (a) */
		b=newVal;
		average=((average*count)+newVal)/(count+1);
		count=count+1;
	}
	
/** Processes num new ratings by considering them for inclusion 
* in the running average and updating the running average as 
necessary. Returns an integer that represents the number of 
* invalid ratings, as described in part (b). 
* Precondition: num >> 
*/ 
	public int processNewRatings(int num) 
	{ /* to be implemented in part (b) */
		int s=0;
		
		while(num>0){
			if(getNewRating()<0){
				s=s+1;
				num=num-1;
				average=((average*count)-getNewRating())/(count-1);
				count=count-1;
			}
		}
		return s;
	} 
/** Returns a single numeric rating. */ 
	public double getNewRating() 
	{ /* implementation not shown */ /*?*/
		return b;
	} 
	
}