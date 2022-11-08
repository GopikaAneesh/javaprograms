package switchStatement;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		//Odd or even using switch case
		
		int num,res;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
        res=num%2;
        
        switch(res)
        {
        case 0:System.out.println("The entered number is even");
        break;
        case 1:System.out.println("The entered number is odd");
        break;
        }
		
	}

}
