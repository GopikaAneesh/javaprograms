package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class SortSwapShuffle {
	
public static void main(String args[]) {
	
	ArrayList<String> list=new ArrayList<String>();
	list.add("Gopika");
	list.add("Aneeesh");
	list.add("Vishnu");
	list.add("Devi");
	
	System.out.println(list);
	//using for loop
	for(String n:list) {
		System.out.println(n);
	}
	
	Collections.sort(list);
	//try with iterator
	Iterator<String>it=list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	Collections.swap(list, 1, 3);
	System.out.println("After swapping");
	System.out.println(list);
	
	Collections.shuffle(list);
	System.out.println("First shuffle");
	System.out.println(list);
	
	Collections.shuffle(list);
	System.out.println("second shuffle");
	System.out.println(list);
}




}

