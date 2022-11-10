package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int eid;
	String ename;
	int eage;
	public Employee(int eid, String ename, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}


}
//sort using user defined datatype
class SortAge implements Comparator<Employee>{

	@Override
	//based on id
	public int compare(Employee e1, Employee e2) {
		if (e1.eid<e2.eid)
			return -1;
		else if (e1.eid>e2.eid)
				return 1;
		else
		return 0;
	}
}
	class SortName implements Comparator<Employee>{

		@Override
		public int compare(Employee e1, Employee e2) {
			
			return e1.ename.compareTo(e2.ename);
			

		}

		


	
	}
	

public class CompatatorSort {

	public static void main(String[] args) {
		
ArrayList<Employee>elst=new ArrayList<Employee>();
		
		Employee e1=new Employee(1, "Gopika", 22);
		Employee e2=new Employee(2, "Aneesh", 25);
		Employee e3=new Employee(6, "Devi", 21);
		Employee e4=new Employee(5, "Achu",20);
		
		elst.add(e1);
		elst.add(e2);
		elst.add(e3);
		elst.add(e4);
		
		System.out.println(elst);
		
		SortAge eage=new SortAge();
		Collections.sort(elst,eage);
		
		System.out.println("After sort");
		
		System.out.println(elst);
		
		Iterator<Employee> it=elst.iterator();
		System.out.println("Sort by id");
		while(it.hasNext()) {
			//Employee e=it.next();
			System.out.println(it.next());
		}

System.out.println(elst);
		
		SortName ename=new SortName();
		Collections.sort(elst,ename);
		
		System.out.println("After sort");
		
		System.out.println(elst);
		
		Iterator<Employee> et=elst.iterator();
		System.out.println("Employee id\tEmployee name\tEmployee age");
		while(et.hasNext()) {
			Employee em=et.next();
			System.out.println(em.eid+"\t\t"+em.ename+"\t\t"+em.eage);
		}
			
			}
			
		}



