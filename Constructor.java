package classandobject;
//using diff types of costructor in a program is also called as constructor overloading
//(constructor such as with argument and without argument)

class Construct{
	//variables are called fields or instance variable
	
	int pid;
	String pname;
	float pprice;
	//constructor is same name as the class name
	//constructor is used to initialize the instance variable of the class
	Construct(){//constructor Construct()
		
		pid=89;
		pname="Speaker";
		pprice=39000.56f;
	}
	
	Construct(int i, String s, float f) {//i=10,s=Television f=56000.45
		
		pid=i;
		pname=s;
		pprice=f;
	
	}
	void display() {
		
		System.out.println("Product id = "+pid+"\nProduct name = "+pname+"\nProduct price = "+pprice);
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		//int sum;//local variable will not be executed if we donot initialize a value
		//instance variable has a default value 0 if we donoy initialize it
		//local variables donot have a default value
		Construct c=new Construct();//calls the no argument costructor
		
		System.out.println("Product id :"+c.pid);
		System.out.println("Product name : "+c.pname);
		System.out.println("Product price : "+c.pprice);//first set of output
		//System.out.println("sum"+sum);
		
		Construct c1=new Construct(10,"Television",56000.45f);//passing data while creating an object
		      //this values are passed to the constructor created
		//The argument values are passed to the parameters
		c.display();//second set of output
		c1.display();//third set of output

	}

}
