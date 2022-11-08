package accessmodifier;

class Student{
	//private data cannot be accessed outside the class
	//default can be accessed from outside the class
	private int sid;
	private String name;
	//always make constructor as public
	//only variable is private
	public Student() {
		System.out.println("condtructor");
		System.out.println("need to create an object");
	}
	void display() {
		System.out.println("Student id: "+sid);
		System.out.println("Student name: "+name);
	}
}
public class AccessModifiers {

	public static void main(String[] args) {
		Student s=new Student();
		s.display();
			
	}

}
