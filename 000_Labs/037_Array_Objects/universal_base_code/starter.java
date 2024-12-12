/*
 *	Author:  Sathvi Reddy
 *  Date: 11/14
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard [] x=new Wizard[100];
		Warrior [] y=new Warrior[100];
		int wi=0;
		int wa=0;
		
		for(int i=0; i<100; i++){
			x[i]=new Wizard();
			wi=wi+x[i].getHealth();
			y[i]=new Warrior();
			wa=wa+y[i].getHealth();
		}
		int za=0;
		int zi=0;
		int dwa=0;
		int dwi=0;
		while(wi>0 && wa>0 && dwa<100 && dwi<100 && za<100 && zi<100){
			
				if(!x[zi].isDead()){
					x[zi].attack(y[za]);
				}
				else{
					dwi=dwi+1;
					zi=zi+1;
					if(zi>=100 || za>=100){
						break;
					}
					else{
						x[zi].attack(y[za]);
					}
				}
				
				if(zi==100){
					break;
				}
				
				if(!y[za].isDead()){
					y[za].attack(x[zi]);
				}
				else{
					dwa=dwa+1;
					za=za+1;
					if(za>=100 || zi>=100){
						break;
					}
					else{
						y[za].attack(x[zi]);
					}
				}
				
			}
			if(dwi<dwa){
				System.out.println("The wizards won with "+(100-dwi)+" remaining");
			}
			else{
				System.out.println("The warriors won with "+(100-dwa)+" remaining");
			}
		}

	}

