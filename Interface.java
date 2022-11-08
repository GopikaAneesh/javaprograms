package interfacepackage;

interface MyInterface{
	int i=10;//public/ststic/final inti=10;
	void m1();//public/abstract void m1();
	void m2();//public/abstract void m2();
}

class Product implements MyInterface{

	@Override
	public void m1() {
			System.out.println("m1");		
	}

	@Override
	public void m2() {
			System.out.println("m2");		
	}
	
}
public class Interface {

	public static void main(String[] args) {
			Product p=new Product();//create object for child class
			//call m1 and m2 from child class
			p.m1();
			p.m2();

	}

}
