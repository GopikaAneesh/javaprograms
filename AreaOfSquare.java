package area;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
         //Finding area of square by getting user input
		int s;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the length of the square:");
        s=sc.nextInt();
        int area = s*s;
        
        System.out.println("Area of the square with length "+s+" is "+area);

	}

}
