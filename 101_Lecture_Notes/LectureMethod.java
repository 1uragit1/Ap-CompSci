/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        greeting("Bro");
        double num=(raise(10000, 15));
        System.out.println(num);
        num=raise(num+6000, 15);
        num=raise(num+6000, 15);
        num=raise(num+6000, 15);
        num=raise(num+6000, 15);
        num=raise(num+6000, 15);
        num=raise(num+6000, 15);
        num=raise(num+6000, 15);
        num=raise(num+6000, 15);
        num=raise(num+6000, 15);
        System.out.println(num);
	}
	
	public static double raise(double salary, int percent){
	    double amount=salary+(salary*percent/100.0);
	    return amount;
	}
	
	public static void greeting(String name){
	    System.out.println("Hey "+name+"! How's it going?");
	}
	
	public static void printAnimal(){
	    System.out.println("      __)\\_  ");
	    System.out.println("(\\_.-'    a`-.");
	    System.out.println("(/~~````(/~^^`;");
	    return;
	}
}