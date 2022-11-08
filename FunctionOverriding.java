package p1;

//Overriding : in case of parent child relation(inheritance)
class Employee{
	 public void display() {
		System.out.println("Display method of Employee");
	}
}
class HREmployee extends Employee{
	public void display() {
		
		System.out.println("Display method of HREmployee");
		super.display();
	}
}


public class FunctionOverriding {

	public static void main(String[] args) {
		HREmployee hob=new HREmployee();
		hob.display();


	}

}
