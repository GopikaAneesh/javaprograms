package looping;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
			
		int t,f1=1,f2=1,f3,n=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		t=sc.nextInt();
		System.out.println(f1);
		System.out.println(f2);
		
		while(n<=t-2) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			n=n+1;
		}
	}

}
