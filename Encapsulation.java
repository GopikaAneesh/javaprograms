package oopsconcept;

import java.util.Scanner;

class Employee{
	String ename;
	int eid;
	String edept;
	float esalary;
	
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Employee:");
		ename=sc.next();
		System.out.println("Enter the employee id:");
		eid=sc.nextInt();
		System.out.println("Enter the department of the employee:");
		edept=sc.next();
		System.out.println("Enter the salary of the employee:");
		esalary=sc.nextFloat();
		
	}
	void display() {
		System.out.println("Name:"+ename);
		System.out.println("Id:"+eid);
		System.out.println("Department:"+edept);
		System.out.println("Salary:"+esalary);
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e.inputData();
		e1.inputData();
		e2.inputData();
		e3.inputData();
		e.display();
		e1.display();
		e2.display();
		e3.display();
		
		
	}

}
