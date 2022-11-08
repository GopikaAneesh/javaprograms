package inherit;

class ParentClass{
	//if parent don't want to share the info to child class
	//use private int while declaring
	int i,j;
	ParentClass(){
		//first parent class will be printed
		//because chaild class object calls the parent class first
		System.out.println("parent Class");
		i=10;
		j=20;
		
	}
}
class ChildClass extends ParentClass{
	//single inheritance-one parent can have only one child class
	int s;
	ChildClass(){
		System.out.println("Chid class");
	}
	void add() {
		s=i+j;
		System.out.println("Sum = "+s);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
			ChildClass cc=new ChildClass();
			cc.add();
	}

}
