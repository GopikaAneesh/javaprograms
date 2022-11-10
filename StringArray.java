package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArray {

	public static void main(String[] args) {

		ArrayList<String> lst=new ArrayList<String>();
		lst.add("Sam");
		lst.add("John");
		lst.add("Jose");
		
		System.out.println(lst);
		
		for(String n:lst) {
			System.out.println(n);
		}
		
		Iterator<String> it=lst.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() +" ");
	}

}
}
