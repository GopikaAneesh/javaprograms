package area;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		//Finding area of circle by getting user input
		int r;
        double pi = 3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle:");
        r=sc.nextInt();
        		
        double area=pi*r*r;
        System.out.println("Area of circle with radius "+r+" is "+area);
	}

}
