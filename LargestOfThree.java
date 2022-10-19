package largest;

public class LargestOfThree {

	public static void main(String[] args) {
		// Finding the largest number of three numbers using ternary operator
		int a=10,b=34,c=14,l;
		l=(a>b && a>c)?a:(b>a && b>c)?b:c;
		System.out.println("Largest of "+a+" and "+b+" and "+c+" is "+l);

	}

}
