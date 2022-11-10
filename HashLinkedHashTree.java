package sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashLinkedHashTree {

	public static void main(String[] args) {
		
				Set<Integer> hob=new HashSet<Integer>();
				hob.add(89); //1. no duplicate values, 2. 
				              //2 .Insertion order not maintained 3.add null values
				
				hob.add(90);
				hob.add(65);
				hob.add(65);
				hob.add(89);
				hob.add(null);
				System.out.println(hob);
				
				Set<Integer> lh=new LinkedHashSet<Integer>();
				lh.add(89); //1. no duplicate values, 2. 
				              //2 .Insertion order is maintained 3.add null values
				
				lh.add(90);
				lh.add(65);
				lh.add(65);
				lh.add(89);
				lh.add(null);
				System.out.println(lh);
				
				Set<Integer> t=new TreeSet<Integer>();
				t.add(89); //1. no duplicate values, 2. 
				              //2 .Sorts in acsending order 3.do not add null values
				
				t.add(90);
				t.add(65);
				t.add(65);
				t.add(89);
				//t.add(null);
				System.out.println(t);
				
				//removing duplicates using hash set in array list
				ArrayList<Integer> list=new ArrayList<Integer>();
				list.add(90);
				list.add(65);
				list.add(65);
				list.add(89);
				list.add(89);
				
				Set<Integer> list1=new HashSet<Integer>(list);
				System.out.println("After sorting "+list1);
				
				

	}

}
