package conditionalstmt;

import java.util.Scanner;

class largest{
	
	int a,b,c;
	
	void inputData() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 3 numbers :");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
		
}
void Greatest() {
	if(a>b && a>c) {
		System.out.println("Largest of "+a+","+b+" and "+c+" is "+a);
	}
	else if(b>a && b>c) {
		System.out.println("Largest of "+a+","+b+" and "+c+" is "+b);
	}
	else {
		System.out.println("Largest of "+a+","+b+" and "+c+" is "+c);
	}

}

public class UsingEncapsulation {

	public static void main(String[] args) {
		largest l=new largest();
		l.inputData();
		l.Greatest();
	}
		
		

	}

}
