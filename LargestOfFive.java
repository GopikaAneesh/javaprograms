package largest;

public class LargestOfFive {

	public static void main(String[] args) {
		// Finding the largest number of four numbers using ternary operator
		int a=10,b=34,c=14,d=20,e=25,l;
		l=(a>b && a>c && a>d &&a>e)?a:(b>a && b>c && b>d && b>e)?b:(c>a && c>b && c>d && c>e)?c:(d>a && d>b && d>c && d>e)?d:e;
		System.out.println("Largest of "+a+" and "+b+" and "+c+" and "+d+" and "+e+" is "+l);

	}

}
