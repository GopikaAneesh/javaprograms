package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;



class Student{
	int sid;
	String sname;
	float fee;
	
	
	public Student(int sid, String sname, float fee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fee=" + fee + "]";
	}
	
}
public class ToStringMethod {

	public static void main(String[] args) {
		LinkedList<Student> slst=new LinkedList<Student>();
		Student s1=new Student(1,"Gopika",4567.78f);
		Student s2=new Student(2,"Aneesh",4657.678f);
		Student s3=new Student(3,"Devi",45467.67f);
		
		//add student object to list
		slst.add(s1);
		slst.add(s2);
		slst.add(s3);
		
		System.out.println(slst);
		
		Iterator<Student> it=slst.iterator();
		System.out.println("Sid\tSname\tFee");
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s.sid+"\t"+s.sname+"\t"+s.fee);
		}

	}

}
