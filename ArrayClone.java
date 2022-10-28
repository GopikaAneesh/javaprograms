package array;

public class ArrayClone {

	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		int a1[]=a.clone();
		
		System.out.println("Elements of a1[]: ");
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
	}

}
