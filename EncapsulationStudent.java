package oopsconcept;

import java.util.Scanner;

class Student{
	String sname;
	int sid;
	float sfee;
	
	void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Student:");
		sname=sc.next();
		System.out.println("Enter the student id:");
		sid=sc.nextInt();
		System.out.println("Enter the fee of the student:");
		sfee=sc.nextFloat();
		
	}
	void display() {
		System.out.println("Name:"+sname);
		System.out.println("Id:"+sid);
		System.out.println("Salary:"+sfee);
	}
}

public class EncapsulationStudent {

	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student();
		s.acceptData();
		s1.acceptData();
		s.display();
		s1.display();
		
		
		
	}

}
