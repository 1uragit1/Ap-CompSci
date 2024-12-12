/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    String model;
    double maxSpeed;
    boolean isElectric;
    String color;
    
    public Car(){
        model="bus";
        maxSpeed=1.1;
        isElectric=false;
        color="blue and red";
    }
    public Car(String m, double s, String c){
        m=model;
        s=maxSpeed;
        c=color;
        isElectric=false;
    }
    
    public void paint(String c){
        color=c;
    }
    public void vroom(){
        
        int count=0;
        
        while(count<maxSpeed){
            System.out.print(model+" goes VROOM!!!!");
            count=count+10;
        }
    }
}