package area;

class AreaFigure{
	void area(int l) {
		int a;
		a=l*l;
		System.out.println("Area of square of side "+l+" is = "+a);
	}
	
		void area(float r) {
			float a;
			a=3.14f*r*r;
			System.out.println("Area of circle of radius "+r+" is = "+a);
		}
		void area(int l,int b) {
			int a;
			a=l*b;
			System.out.println("Area of rectangle of length "+l+" and height "+b+" is = "+a);
		}
		void area(float b,float h) {
			float a;
			a=0.5f*b*h;
			System.out.println("Area of triangle of base "+b+" and height "+h+" is = "+a);
		}
}
public class AreaFunctionOverLoading {

	public static void main(String[] args) {
				
		AreaFigure af=new AreaFigure();
		af.area(5);
		af.area(3f);
		af.area(5,6);
		af.area(3.5f,6.7f);
	}

}
