package classandobject;

public class Blocks {

		static {
			
			System.out.println("static block executes before the main ");
		}
		{
			System.out.println("Annonymous block executes before constructor call");

	}
		Blocks(){
			System.out.println("Constructor block will execute on object creation");
		}
		
		//constructor is initialized in newly created object
		//block of code similar to methor
		
		//constructor void display()
		void display() {
			
			System.out.println("Display method");
		}

	public static void main(String[] args) {
		System.out.println("main method");
		Blocks bm=new Blocks();
		bm.display();//constructor is called by using the newly created object
	}
}

