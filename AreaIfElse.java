package assignment;

import java.util.Scanner;

public class AreaIfElse {

	public static void main(String[] args) {

			double pi=3.14;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Rectangle\n2.Square\n3.Circle\n4.Triangle");
			System.out.println("Select the number to find the area:");
			int num = sc.nextInt();
			
			if(num==1) {
				
				int l,b,area;
				System.out.println("Enter the length and breadth of the rectangle : ");
				l=sc.nextInt();
				b=sc.nextInt();
				area=l*b;
				System.out.println("Area of the rectangle with length "+l+" and breadth "+b+" = "+area);
				
			}
			else if(num==2) {
				
				int l,area;
				System.out.println("Enter the length of the square : ");
				l=sc.nextInt();
				area=l*l;
				System.out.println("Area of the square of length "+l+" = "+area);
				
			}
			else if(num==3) {
				
				long r;
				double area;
				System.out.println("Enter the radius of the circle : ");
				r=sc.nextInt();
				area=pi*r*r;
				System.out.println("Area of the circle with radius "+r+" = "+area);
				
			}
			else if(num==4) {
				
				int b,h,area;
				System.out.println("Enter the base and height of the triangle : ");
				b=sc.nextInt();
				h=sc.nextInt();
				area=(b*h)/2;
				System.out.println("Area of the triangle with base "+b+" and height "+h+" = "+area);
				
			}
			else {
				System.out.println("Invalid selection!!!!");
			}
	}

}
