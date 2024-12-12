/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Hey there! You're at a park right now, and you have a decision to make. Which of these will you do?");
        System.out.println("1. Go to the playground ");
        System.out.println("2. Climb a tree");
        System.out.println("3. Ride your bike!");
        
        int answer1=sc.nextInt();
        
        if(answer1==1){
            System.out.println("You visit the playground and have a look around");
            System.out.println("What playground activity will you participate in?");
            System.out.println("1. Swing set\n2. Make a new friend\n2. Use the slide!");
            int answer2=sc.nextInt();
            System.out.println("ok");
            
        }
        else if(answer1==2){
            System.out.println("You walk over to the tree grove");
            System.out.println("Under the trees, a birthday is happening. Someone invites you to play. What do you do?");
            System.out.println("1. Go climb a coconut tree\n2. Run away because you are shy\n3. Join the group and play tag!");
            int answer2=sc.nextInt();
            System.out.println("ok");
            
        }
        else if(answer1==3){
            System.out.println("You go fetch your bike and come back to the park");
            System.out.println("You see some kids playing tag. What do you do?");
            System.out.println("1. Scare them away on your bike\n2. Drop your bike and ask to play tag\n3. Go on the bike loop around the park");
            int answer2=sc.nextInt();
            System.out.println("ok");
            
        }
        else{
            System.out.println("ok");
            System.out.println("You pass out from dehydration");
        }
        
	}
}