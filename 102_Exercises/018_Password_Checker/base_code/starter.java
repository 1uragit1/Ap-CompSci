import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count]; // This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int one=0;
		int two=0;
		int three=0;
		boolean oneTrue=false;
		boolean twoTrue=false;
		String x;
		
        for(int a=0; a<count; a++){
            int b=passwords[a].length();
            if(b>=8){
                one=one+1;
                oneTrue=true;
            }
            if(passwords[a].contains("!")||passwords[a].contains("#")||passwords[a].contains("@")||passwords[a].contains("$")||passwords[a].contains("%")||passwords[a].contains("^")||passwords[a].contains("&")||passwords[a].contains("*")){
                two=two+1;
                twoTrue=true;
            }
            if(oneTrue&&twoTrue){
                three=three+1;
            }
            oneTrue=false;
            twoTrue=false;
            
        }
        
        System.out.println(one+" passwords have more than 8 characters");
        System.out.println(two+" passwords have the folowing characters: ! @ # $ % ^ & *");
        System.out.println(three+" passwords satisfy both of the previous questions");
            
	}
}
