package exception;

class PersonAge extends Exception{ //here PersonAge class behaves like Arithmetic
	public PersonAge(String s) {
		super(s);
	}
}
class Vote{
	void checkAge(int a) {
		try {
			if(a<18) throw new PersonAge("Age less than not eligible for vote");
			else 
				System.out.println("Eligible to vote");
		}catch(PersonAge e) {
			e.printStackTrace();
		}
	}
}

public class CustomExceptionVoting {

	public static void main(String[] args) {
		Vote vob=new Vote();//create an object for the class with try and catch
		vob.checkAge(35);//pass the argument to the parameter int a
		

	}

}
