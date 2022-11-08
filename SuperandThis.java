package inherit;

class PClass{
	  int i, j;
	   PClass(int i, int j){
		   System.out.println("Parent class constructor");
	     this.i=i;//this referes to present object
	     this.j=j;
	   }
	}

	class CClass extends PClass{ //Single inheritance
	     int s;
	     CClass(int i, int j){
	    	 super(i, j);
	    	 System.out.println("child constructor");
	    	
	     }
	     void add(){
	    	
	        s=i+j;
	         System.out.println("sum="+s);
	      }
	}

public class SuperandThis {

	public static void main(String[] args) {
		
		 CClass  ob=new CClass(8,9);
	      ob.add();

	}

}
