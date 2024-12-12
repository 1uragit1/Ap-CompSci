/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter your name");
        String name=sc.nextLine();
        System.out.println("Hey "+ name+"!!!");
        
        
        System.out.println("Give me a number");
        int number1=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Give me another number");
        int number2=sc.nextInt();
        sc.nextLine();
        
        System.out.println("The sum of these number is " + (number1+number2));
        
        System.out.println("What's your favorite food?");
        String food=nextLine();
	}
}