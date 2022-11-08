package exception;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]=new int[3];
		System.out.println("Before division");
		//put seperate try and catch
		//so that it handles multiple exception
		try {
			c=a/b;
			ar[3]=10;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
		}
		finally {
		System.out.println("finally block excecutes always");
	}
   System.out.println("After division");
}
}
