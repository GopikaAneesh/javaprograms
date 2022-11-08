package assignment;

import java.util.Scanner;

class ElectricityBill1 {

	public double cal(double u) {
	double billToPay=0;

    // void calculate() {
    	 
    	
    	 if(u<=100) {
    		 
    		  billToPay=u*1.25;
    	 }
    	 else if(u>100 && u<=200) {  //150  , 100*1.25+(u-100)*1.50 , 100*1.25+50*1.50
    		 
    		 billToPay=100*1.25+(u-100)*1.50;
    	 }
    	 else if(u>200) {   //100*1.25+100*1.50+(u-200)*1.80
    		 
    		 billToPay=100*1.25+100*1.50+(u-200)*1.80;
    	 }
	return billToPay;
     }
     /*void display() {
    	 
    	 System.out.println("The bill for "+unit+" units = "+bill);*/
    	 
     
  


	public static void main(String[] args) {
                 
		int cno;
		double presr,prevr;
		double con;
		String name;
		      ElectricityBill1 ec=new ElectricityBill1();
		      Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter the name of the customer : ");
	    		name=sc.nextLine();
	    		System.out.println("Enter the customer number : ");
	    		cno=sc.nextInt();
	    		System.out.println("Enter the previous reading : ");
	    		prevr=sc.nextDouble();
	    		System.out.println("Enter the present reading : ");
	    		presr=sc.nextDouble();
	    		double consumed=presr-prevr;
				double billToPay = ec.cal(consumed);
				System.out.println("Consumer No. \t Name \t Units Consumed \t Amount");
				System.out.println(cno+"\t\t"+name+"\t\t"+consumed+"\t\t"+billToPay);
	    		
		      //ec.calculate();
		      //ec.display();
		
	}

}
