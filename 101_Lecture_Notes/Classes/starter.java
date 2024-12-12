/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        Car mobile=new Car();
        Car batmobile=new Car("lambo", 525, "black");
        batmobile.paint("pink");
        mobile.vroom();
        batmobile.vroom();
	}
}