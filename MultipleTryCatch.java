package exception;

public class MultipleTryCatch {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]=new int[3];
		System.out.println("Before division");
		//put seperate try and catch
		//so that it handles multiple exception
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		try {
			ar[5]=10;;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		System.out.println("After division");
	}

}
