package looping;

public class SumNatural {

	public static void main(String[] args) {
      //sum of natural numbers 
		//for finding sum of even num increment by 2 (i=i+2)
		int i=1,s=0;
		while(i<=100) {
			s=s+i;
			i=i+1;
		}
		System.out.println("Sum ="+s);
	}

}
