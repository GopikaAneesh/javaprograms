package showroom;

import java.util.Scanner;

class Showroom{
	String name;
	long mobno;
	double cost,dis,amount;
	
	void ShowRoom(){
		name=" ";
		mobno=0;
		cost=0;
		dis=0;
		amount=0;
	}
	void input() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of the customer : ");
		name=sc.nextLine();
		System.out.println("Enter the mobile number : ");
		mobno=sc.nextLong();
		System.out.println("Enter cost : ");
		cost=sc.nextDouble();
	
}
	
	void calculate() {
		
		if(cost<=10000) {
			
			dis=(cost*5)/100;
			amount=cost-dis;
		}
		else if(cost>10000 && cost<=20000) {
			
			dis=(cost*10)/100;
			amount=cost-dis;
		}
		else if(cost>20000 && cost<=35000) {
			
			dis=(cost*15)/100;
			amount=cost-dis;
		}
		else{
			
			dis=(cost*20)/100;
			amount=cost-dis;
		}
	}
	void display() {
		
		System.out.println("Name of the customer : "+name);
		System.out.println("Mobile number : "+mobno);
		System.out.println("Amount to be paid after discount : "+amount);
	}
	
}

public class ShowRoomMain {

	public static void main(String[] args) {
		
		Showroom sr=new Showroom();
		
		sr.input();
		sr.calculate();
		sr.display();
	}

}
