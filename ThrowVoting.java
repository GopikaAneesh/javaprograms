package exception;

import java.util.Scanner;

public class ThrowVoting {

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age ");
		age=sc.nextInt();
		try {
			if(age<18)
				//custom exception is written
				throw new ArithmeticException("Not eligible for voting");
			else
				System.out.println("you are eligible to vote");
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
