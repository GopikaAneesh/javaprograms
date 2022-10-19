package area;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		//Finding the area of the triangle by getting user input
        float b,h;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the base of the triangle:");
        b=sc.nextInt();
        System.out.println("Enter the height of the triangle:"); 
        h=sc.nextInt();
        
        double area = ( b*h) / 2 ;
        System.out.println("Area of Triangle with base "+b+" and height "+h+" is "+area);

	}

}
