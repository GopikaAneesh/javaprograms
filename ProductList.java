package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*create a class Product with
pid,pname,pprice

add product objects to ArrayList

and display the using Iterator*/
class Product{
	int pid;
	String pname;
	float pprice;

void input() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the product id : ");
	pid=sc.nextInt();
	System.out.println("Enter the product name :");
	pname=sc.next();
	System.out.println("Enter the product price :");
	pprice=sc.nextFloat();
	
}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + "]";
	}
	
}
public class ProductList {

	public static void main(String[] args) {
		
		LinkedList<Product> pro=new LinkedList<Product>();
	Product p1=new Product();
	Product p2=new Product();
	Product p3=new Product();
	Product p4=new Product();
	
	p1.input();
	p2.input();
	p3.input();
	p4.input();
	
		pro.add(p1);
		pro.add(p2);
		pro.add(p3);
		pro.add(p4);
		
		
		System.out.println(pro);
		
		Iterator<Product> it=pro.iterator();
		System.out.println("Product id\tProduct name\tPrice");
		while(it.hasNext()) {
			Product p=it.next();
			System.out.println(p.pid+"\t\t"+p.pname+"\t\t"+p.pprice);
		}
	}


}
