package variable;

public class VariableTypes {
	
	int a;//instance variable
	static int b=10;//static variable
	
	void display() {
		int d;//local variable
		System.out.println("a="+a);//default=0
		System.out.println("static b="+b);
		
	}

	public static void main(String[] args) {
		
		int a=10;//local variable
		VariableTypes var=new VariableTypes();//object creation
		System.out.println("a="+var.a);//default value=0
		System.out.println("static b="+VariableTypes.b);
		System.out.println("ststic b="+var.b);
		System.out.println("ststic b="+b);
		
		

	}

}
