package conditionalstmt;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// findind the number is odd or even
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of n : ");
		
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println(n+" is even");
		}
		else
		{
			System.out.println(n+" is odd");
		}

	}

}
