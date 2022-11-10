package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		String ename;
		int eage;
		float salary;
		
	/*	InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);*/
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name");
		
		ename=br.readLine();
		//there is only readLine() in buffer it accepts as string String
		System.out.println("Enter age");
		eage=Integer.parseInt(br.readLine());
		//use wrapper class or else it returns integer as "23"
		System.out.println("Enter salary");
		salary=Float.parseFloat(br.readLine());
		//for short float will be replaced by short
		
		System.out.println("Employee Details");
		System.out.println("Name="+ename);
		System.out.println("Age="+eage);
		System.out.println("Salary="+salary);


	}

}
