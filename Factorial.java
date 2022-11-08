package looping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
			//if you need to find the factorial for long numbers
		//then use double for it it wont give output with int as datatype
		//for small numbers use int
		
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		n=sc.nextInt();
		int f=1;
		while(n>=1) {
			f=f*n;
			n=n-1;
		}
		System.out.println("Factorial="+f);
	}

}
