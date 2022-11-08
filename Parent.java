package p1;

public class Parent {

	protected int i, j;
	  public int k;
	  public  Parent(int i, int j){
		   System.out.println("Parent class constructor");
	     this.i=i;//this refers to present object
	     this.j=j;
	     k=100;
	   }


}
