package conditionalstmt;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		//finding a number is positive or negative
		
        int n;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value of n:");
        		n=sc.nextInt();
        
        if(n>0) {
        	System.out.println(n+" is positive");
        }
        else {
        	System.out.println(n+" is negative");
        }
	}

}
