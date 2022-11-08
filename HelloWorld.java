package array;

public class HelloWorld {

	public static void main(String[] args) {
		String n="Hello World!";
		String n1="Hi";
		String n2="Hello";
		
		System.out.println("Does n2 contains Hello :"+n.contains(n2));
		System.out.println("Does n1 contains Hi :"+n.contains(n1));
		
		//finding index
		System.out.println("Position of W is :"+n.indexOf('W'));
		System.out.println("Position of w is:"+n.lastIndexOf('l')); 
		
		//Replacing
		System.out.println("Replace o with e :"+n.replace('o','e'));
		System.out.println("Replace World with All :"+n.replace("World","All"));
		
		//Append,Reverse
		StringBuffer sb=new StringBuffer(n);//StringBuffer or StringBuilder
		System.out.println(sb.reverse());
		
		System.out.println(sb.append(" New"));

	}

}
