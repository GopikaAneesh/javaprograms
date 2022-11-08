package exception;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
			int a[]=new int[3];
			System.out.println("Before assignment");
			try {
				a[0]=2;
				a[1]=3;
				a[2]=5;
				//a[3]=10;//if we give this it executes normally
				//when we include more elements than array size it shows the exception
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			System.out.println("After assignment");
	}

}
