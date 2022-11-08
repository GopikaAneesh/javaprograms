package assignment;

import java.util.Scanner;

class RailwayTicket1{
	String name,coach;
	long mobno;
	int amt,totalamt;
	
	void accept() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of customer:");
		name=sc.nextLine();
		System.out.println("Enter the mobile number :");
		mobno=sc.nextInt();
		System.out.println("Enter the coach First_AC/Second_AC/Third_AC/Sleeper :");
		coach=sc.next();
		System.out.println("Enter the amount :");
		amt=sc.nextInt();
		
	}
	
	void update() {
		
		if(coach.equals("First_AC"))
	           totalamt=amt+700;
	    else if(coach.equals("Second_AC"))
	        	   totalamt=amt+500;
	    else if(coach.equals("Third_AC"))
	        	   totalamt=amt+250;
	    else if(coach.equals("Sleeper"))
	        	   totalamt=amt;
	}
	
	void display() {
		
		System.out.println("Name : "+name);
		System.out.println("Mobile number : "+mobno);
		System.out.println("Coach : "+coach);
		System.out.println("Toatal amount : "+totalamt);
		
	}
	
}
public class RailwayTicket {

	public static void main(String[] args) {
                 
		RailwayTicket1 rt=new RailwayTicket1();
		rt.accept();
		rt.update();
		rt.display();
	}

}
