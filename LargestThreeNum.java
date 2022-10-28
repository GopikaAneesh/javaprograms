package conditionalstmt;

import java.util.Scanner;

public class LargestThreeNum {

	public static void main(String[] args) {
		// finding largest of three number
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("Largest of "+a+" and "+b+" and "+c+" is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest of "+a+" and "+b+" and "+c+" is "+b);
		}
		else {
			System.out.println("Largest of "+a+" and "+b+" and "+c+" is "+c);
		}

	}

}
