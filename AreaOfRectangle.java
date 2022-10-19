package area;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		//Area of rectangle by getting user input
		int length;
		int height;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle:");
		length=sc.nextInt();
		System.out.println("Enter the height of the rectangle:");
		height=sc.nextInt();
		int area=length*height;
		
		System.out.println("Area of rectangle of length "+length+" and height "+height+" is = "+area);

	}

}
