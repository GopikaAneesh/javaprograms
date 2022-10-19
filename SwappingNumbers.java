package swaping;

public class SwappingNumbers {

	public static void main(String[] args) {
		// swapping two numbers with temporary variable
		int a=50;
		int b=30,t;
		System.out.println("Before swapping a= "+a+" b= "+b);
		t=a;
		a=b;
		b=t;
		System.out.println("After swapping value of a is "+a+" and b is "+b);
		

	}

}
