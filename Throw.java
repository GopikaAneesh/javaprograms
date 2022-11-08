package exception;

public class Throw {

	public static void main(String[] args) {
			 
		int a=10,b=5,c=0;
		System.out.println("Before division");
		try {
			if(b==0) throw new ArithmeticException("Divide by zero error");
			else 
				c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
