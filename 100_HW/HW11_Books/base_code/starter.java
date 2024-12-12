/*
 *	Author: Sathvi Reddy
 *  Date: 11/13

/**/import java.util.*;
import java.io.*;

/**/class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = sc.nextLine();
			System.out.println();

			// Your code goes here.

			System.out.println("----------");
			
			if(choice.equals("change")){
				System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
				textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
				arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
				System.out.println();
			}
		
			if(choice.equals("common")){
				System.out.println("The most common word is "+mostCommon(arr));
			}
			
			if(choice.equals("print")){
				printsArray(arr);
			}
			if(choice.equals("printBack")){
				printsArrayBack(arr);
			}
			if(choice.equals("printNum")){
				System.out.println("How many words would you like to print?");
				int x=sc.nextInt();
				printsNumber(arr,x);
			}
			int cx=0;
			if(choice.equals("check")){
				System.out.println("What word would you like to check for?");
				String x=sc.nextLine();
				System.out.println("There are "+checksArray(arr, x)+" uses of "+x);
				
				cx++;
			}
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array given.
	*/
	public static void printsArray(String[] arr){
		for(int i=0; i<arr.length-1; i++){
			System.out.print(arr[i]+" ");
		}

	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array given in opposite order.
	*/
	public static void printsArrayBack(String[] arr){
		for(int i=0; i<arr.length-1; i++){
			System.out.print(arr[arr.length-i-1]+" ");
		}

	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
			This should immediately end the method.
	*/
	public static void printsNumber(String[] arr, int num){
		if(num>arr.length){
			return;
		}
		for(int i=0; i<num; i++){
			System.out.print(arr[i]+" ");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checksArray(String[] arr, String check){
		int x=0;
		for(int i =0; i<arr.length; i++){
			if(arr[i].equals(check)){
				x=x+1;
			}
		}
		return x;
		// Dummy value, delete when needed.
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		String maxwrd=arr[0];
		int [] maxdup= new int[arr.length];
		
		for(int i=0; i<maxdup.length-1; i++){
			maxdup[i]=1;
		}
		
		for(int i=0; i<arr.length-1; i++){
			for(int c=1; c<arr.length-1; c++){
				if(arr[i].equals(arr[c])){
					maxdup[i]=maxdup[i]+1;
				}
			}
			if(i>0){
				if(maxdup[i]>maxdup[i-1]){
					maxwrd=arr[i];
				}
			}
		}
		return maxwrd;	// Dummy value, delete when needed.
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg)throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
