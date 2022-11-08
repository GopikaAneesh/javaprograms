package exception;

public class TwoExceptions {

	public static void main(String[] args) {
			int a=10,b=2,c=0;
			int ar[]=new int[3];
			System.out.println("Before division");
			try {
				c=a/b;
				ar[5]=10;
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			System.out.println("After division");
	}
//to handle both the exceptions go to multiple try and catch 
	//orelse this program terminates when an erroe occurs in a line 
	//and does not move to the next line
	//refer multipletrycatch program
}
