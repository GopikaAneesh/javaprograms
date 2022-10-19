package employeedetails;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		String ename;
		int eage;
		float esalary;
		String edept;
		double eyearsalary;
		
		Scanner sc=new Scanner(System.in);
		//User input
		
		System.out.println("Enter the name of the employee:");
		ename=sc.next();
		System.out.println("Enter the age of the employee:");
		eage=sc.nextInt();
		System.out.println("Enter the department of the employee:");
		edept=sc.next();
		System.out.println("Enter the salary of the employee:");
		esalary=sc.nextFloat();
		
		//Output Console
		System.out.println("Name:"+ename);
		System.out.println("Age:"+eage);
		System.out.println("Department:"+edept);
		System.out.println("Salary:"+esalary);
		eyearsalary=esalary*12;
		System.out.println("Calculated one year salary of the employee:"+eyearsalary);
		
	}

}
