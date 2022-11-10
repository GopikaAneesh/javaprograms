package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {
		ArrayList<Float> lst=new ArrayList<Float>();
		//also we can use Linked list,Vector istead of arraylist as
		//LinkedList<Float> lst=new LinkedList<Float>();
		//all the methods are same for array and linked
		//Vector<Float> lst=new Vector<Float>();
		//vector methods are syncronized
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the elements");
		/*float a=sc.nextFloat();
		lst.add(a);
		float b=sc.nextFloat();
		lst.add(b);*/
		//this can be used for accepting two or three elements
		
		//using for loop to accept n number of values
		System.out.println("Enter the no. of elements : ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter float value");
			float val=sc.nextFloat();
			lst.add(val);
		}
		ArrayList<Float> lst1=new ArrayList<Float>();
		lst1.add(34.4f);
		lst1.add(56.8f);
		lst1.add(59.3f);
		System.out.println(lst);
		
		for(float n1:lst) {
			System.out.print(n1 +" ");
		}
		lst.remove(1);
		System.out.println(lst);

		System.out.println(lst.contains(34.4));
		
		lst.addAll(lst1);
		System.out.println(lst);
		
		System.out.println(lst.containsAll(lst1));
		
		lst.clear();
		System.out.println(lst);
		
		
	}

}
