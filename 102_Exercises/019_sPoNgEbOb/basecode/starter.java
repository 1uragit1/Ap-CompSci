/*
	Author:Sathvi Reddy
	Date:12/5
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("ENTER A WORD! ");
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		
		while(true){
			if(sentence.indexOf(" ")==-1){
				System.out.print(spongeCase(sentence)+" ");
				break;
			}
			int space=sentence.indexOf(" ");
			String word=sentence.substring(0,space);
			System.out.print(spongeCase(word)+" ");
			
			sentence=sentence.substring(space+1);
		}
		
			// for(int i=0; i<x.length(); i++){
			// 	if(i%2==0){
			// 		part=x.substring(i,i+1);
			// 		System.out.print(part.toLowerCase());
			// 	}
			// 	else{
			// 		part=x.substring(i,i+1);
			// 		System.out.print(part.toUpperCase());
			// 	}
			// }
	}
	public static String spongeCase(String x){
		String x2="";
		String part="";
		for(int i=0; i<x.length(); i++){
				if(i%2==0){
					part=x.substring(i,i+1);
					x2=x2+(part.toLowerCase());
				}
				else{
					part=x.substring(i,i+1);
					x2=x2+(part.toUpperCase());
				}
			}
			return x2;
	}
}
