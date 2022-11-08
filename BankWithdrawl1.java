package assignment;

import java.util.Scanner;


public class BankWithdrawl1 {

	public static void main(String[] args) {
		int balance=50000,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Your current account balance is "+balance);
		System.out.println("Enter the amount for withdrawl :"); 
		a=sc.nextInt();
		try {
			
			if(a>balance)throw new BankBalance("Low Balance ");
			else 
				System.out.println("Succeccfully withdrawed");
				balance=balance-a;
			System.out.println("Current balance : "+balance);
		}
		catch(BankBalance e) {
			e.printStackTrace();
		}
	}
	}


