/*
 *	Author:  Sathvi Reddy
 *  Date: 11/3
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class starter {
    public static void main(String args[]) {
        RunningAverage tr=new RunningAverage();
        tr.updateAverage(10);
        tr.updateAverage(-2);
        System.out.println(tr.processNewRatings(2));
    }
     
}