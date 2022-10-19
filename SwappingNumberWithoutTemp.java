package swaping;

public class SwappingNumberWithoutTemp {

	public static void main(String[] args) {
		// Swapping without temporary variable
		int a=10,b=20;
		System.out.println("Before swapping a= "+a+" and b= "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping value of a is "+a+" and b is "+b);

	}

}
