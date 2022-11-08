package switchStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
         int ch;
         float n1,n2,ans;
         Scanner sc=new Scanner(System.in);
		System.out.println("----------MENU----------");
		
		System.out.println("Enter your choice");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		ch=sc.nextInt();
		System.out.println("Enter two numbers");
		
		n1=sc.nextFloat();
		n2=sc.nextFloat();
		 switch(ch) {
		 case 1:ans=n1+n2;
		 System.out.println("Sum of "+n1+" and "+n2+" is: "+ans);
		 break;
		 case 2:ans=n1-n2;
		 System.out.println("Difference of "+n1+" and "+n2+" is: "+ans);
		 break;
		 case 3:ans=n1*n2;
		 System.out.println("Product of "+n1+" and "+n2+" is: "+ans);
		 break;
		 case 4:
			 if(n2!=0) {
				 ans=n1/n2;
				 System.out.println("Quotient of "+n1+" and "+n2+" is: "+ans);			 
			 }
			 else {
				 System.out.println("Divided by zero error");
			 }
			 
			 break;
			 
			 default:System.out.println("Invalid input");
		 
			 
		 }
	}

}
