package p2;

import p1.Parent;

class ChildClass extends Parent{ //Single inheritance
    int s;
    ChildClass(int i, int j){
   	 super(i, j);
   	 System.out.println("child constructor");
    }
    void add(){
       s=i+j;
        System.out.println("sum="+s);
     }
}


public class Child {

	public static void main(String[] args) {
		 ChildClass  ob=new ChildClass(8,9);
	     ob.add();
	     Parent pob=new Parent(9,8);
	     System.out.println("Protected data ="+pob.k); 

	}

}
