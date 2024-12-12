/*
 *	Author: Sathvi Reddy
 *  Date: 11/24
*/

package pkg;

public class CVMath {		
	// public static int findMid(int one, int two, int three)
	// {
	// 	return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	// }
	public static void specialSquare(int a){
		int num=1;
		int squares=0;
		while(squares!=a){
			boolean isSquare=false;
			int c=0;
		
			while(isSquare==false){
				c=c+1;
				if(c*c>num){
					break;
				}
				if(c*c==num){
					isSquare=true;
				}
			}
		
			int i=0;
			int sum=0;
			boolean consec=false;
		
			while(consec==false){
				i=i+1;
				sum=sum+i;
			
				if(sum>num){
					break;
				}
				if(sum==num){
					consec=true;
				}
			}
			if(consec&isSquare){
				System.out.println(num);
				squares=squares+1;
				
			}
			num=num+1;
		}
	}	
}
