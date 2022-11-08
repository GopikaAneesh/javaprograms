package Abstraction;

abstract class Shape{
	abstract void area();
}

 class Reactangle extends Shape{

	@Override
	void area() {
		int l=9;
		int b=8;
		int a;
		a=l*b;
		System.out.println("Area of reactangle="+a);
		
	}
	 
 }
 class Square extends Shape{

	@Override
	void area() {
		int l=9;
		
		int a;
		a=l*l;
		System.out.println("Area of square="+a);
		
	}
	 
 }



public class ShapeMain {

	public static void main(String[] args) {
		Reactangle rob=new Reactangle();
		Square sob=new Square();
		rob.area();
		sob.area();
		//
		Shape obj;
		obj=new Reactangle();
		obj.area();//reactangle
		obj=new Square();
		obj.area();//square

	}

}
