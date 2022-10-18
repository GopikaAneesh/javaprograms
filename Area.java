package area;

public class Area {

	public static void main(String[] args) {
		// Area of rectangle,square,triangle and circle
		//rectangle
		    int length=4;
			int height=10;
			double area=length*height;
			System.out.println("Area of rectangle of length "+length+" and height "+height+" is = "+area);
			//circle
			int r=4;
	        double pi = 3.14;
	        area=pi*r*r;
	        System.out.println("Area of circle with radius "+r+" is "+area);
	        //square
	        int s=11;
	        area=s*s;
	        System.out.println("Area of the square with length "+s+" is "+area);
	        //triangle
	        float b=5,h =11;
	        area = ( b*h) / 2 ;
	        System.out.println("Area of Triangle with breadth "+b+" and height "+h+" is "+area);
			
	}

}
