
package largest;

public class LargestOfFour {

	public static void main(String[] args) {
		// Finding the largest number of four numbers using ternary operator
				int a=10,b=34,c=14,d=20,l;
				l=(a>b && a>c && a>d)?a:(b>a && b>c && b>d)?b:(c>a && c>b && c>d)?c:d;
				System.out.println("Largest of "+a+" and "+b+" and "+c+" and "+d+" is "+l);

	}

}