package conditionalstmt;

import java.util.Scanner;

public class LargestTwoNum {

	public static void main(String[] args) {
		//finding largest of two numbers using if else
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");	
		b=sc.nextInt();
		
		if(a==b) {
			System.out.println(a+" is equal to "+b);
		}
		else if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else {
			System.out.println(b+" is greater than "+a);
		}
	}

}
