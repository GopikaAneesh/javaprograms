package collection;

import java.util.Iterator;
import java.util.LinkedList;



class Employee{
	int eid;
	String ename;
	float esal;
	String dept;
	
	
	


	public Employee(int eid, String ename, float esal, String dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", dept=" + dept + "]";
	}


	
}
public class EmployeeLinked {

	public static void main(String[] args) {
		LinkedList<Employee> elst=new LinkedList<Employee>();
		Employee e1=new Employee(1,"Gopika",4567.78f,"Sales");
		Employee e2=new Employee(2,"Aneesh",4657.67f,"Quality");
		Employee e3=new Employee(3,"Devi",4467.67f,"Testing");
		
		//add employee object to list
		elst.add(e1);
		elst.add(e2);
		elst.add(e3);
		
		System.out.println(elst);
		
		Iterator<Employee> it=elst.iterator();
		System.out.println("Employee id\tEmployee name\tSalary\tDepartment");
		while(it.hasNext()) {
			Employee s=it.next();
			System.out.println(s.eid+"\t\t"+s.ename+"\t\t"+s.esal+"\t    "+s.dept);
		}

	}

}
