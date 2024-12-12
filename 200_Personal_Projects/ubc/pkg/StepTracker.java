/*
 *	Author:  Sathvi Reddy
 *  Date: 11/3
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class StepTracker {
	int day;
	double average;
	int active;
	int steps;
	int min;
	
	
	public StepTracker(int n) {
		min=n;
		day=0;
		average=0.0;
		steps=0;
	}
	
	public void addDailySteps(int reading){
		steps=steps+reading;
		
		// average=(reading+(average*day))/(day+1);
		day=day+1;
		
		if(reading>min){
			active=active+1;
		}
	}
	
	public int activeDays(){
		return active;
	}
	
	public double averageSteps(){
		if(day==0){
			return 0.0;
		}
		else{
			average=steps/(day*1.0);
			return average;
		}
	}
	
	
}
