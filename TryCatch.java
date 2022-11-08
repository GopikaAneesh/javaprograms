package exception;

public class TryCatch {

	public static void main(String[] args) {
		int a=10,b=0,c=0;
		
		System.out.println("Before division");
		try {
		c=a/b;//run time error
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("After division ");
	}

}
