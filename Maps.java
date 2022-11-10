package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		//linked map maintains the insertion order,allows null values,no duplicate values
		LinkedHashMap<Integer,String>lm=new LinkedHashMap<Integer,String>();
		lm.put(1111, "Ravi");
		
		lm.put(1112, "Bharathi");
		lm.put(114, "Kiran");
		lm.put(1113, "Ravi");
		System.out.println(lm);
		//hashmap does not maintains the insertion order,allows null values,no duplicate values
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1111, "Ravi");
		
		hm.put(1112, "Bharathi");
		hm.put(114, "Kiran");
		hm.put(1113, "Ravi");
		System.out.println(hm);
	
		//Treemap sorts key value in acsending order,does not allow null values,no duplicate values
		TreeMap<Integer,String>tm=new TreeMap();
		tm.put(1111, "Ravi");
		
		tm.put(1112, "Bharathi");
		tm.put(114, "Kiran");
		tm.put(1113, "Ravi");
		System.out.println(tm);
	
	}

}
