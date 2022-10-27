package array;

public class Array {

	public static void main(String[] args) {
		// Array declaration
		//syntax:datatype var_name=new datatype[size]
		float a[]=new float[5];
		a[0]=4.6f;
		a[1]=8.9f;
		a[2]=3.4f;
		a[3]=5.2f;
		a[4]=4.8f;
		
		System.out.println("The array elements are:");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//adding array elements
		float s=a[0]+a[1]+a[2]+a[3]+a[4];
		System.out.println("Sum of array elements:"+s);

	}

}
