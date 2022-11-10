package collection;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lst=new ArrayList<Integer>();
		lst.add(23);
		lst.add(34);
		lst.add(45);
		
		System.out.println(lst);
		
		ArrayList<Integer> lst1=new ArrayList<Integer>();
		lst1.add(234);
		lst1.add(34);
		lst1.add(457);
		
		System.out.println(lst.contains(45));
		System.out.println(lst1);
		
		lst.addAll(lst1);
		System.out.println(lst);
		
		Iterator<Integer> it=lst.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() +" ");
		}

	}

}
