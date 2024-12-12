/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		
		Employee dwight=new Employee(1987, "Dwight", "Schrute", 4416.66);
		
		Employee jim=new Employee(2474, "Jim", "Halpert", 4416.66);
		
		Employee pam=new Employee(2011, "Pam", "Beesly", 2250);
		
		pam.raiseSalary(10);
		michael.raiseSalary(5);
		dwight.raiseSalary(20);
		jim.raiseSalary(37);
		
		pam.employeeToString();
		System.out.println("Annual Salary: "+pam.getAnnualSalary());
		michael.employeeToString();
		System.out.println("Annual Salary: "+michael.getAnnualSalary());
		dwight.employeeToString();
		System.out.println("Annual Salary: "+dwight.getAnnualSalary());
		jim.employeeToString();
		System.out.println("Annual Salary: "+jim.getAnnualSalary());
	}
}
