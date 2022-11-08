package conditionalstmt;

import java.util.Scanner;

class ElectricityBill1   
{     
    public static void main(String args[])   
    {     
        double unit;  
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number of unit consumed : ");
         unit=sc.nextDouble();
        double bill = 0;  
          
        /*if(unit < 100)  
        {  
            bill = unit * 1.20;  
        }  
        
        else if(unit < 300){  
            bill = 100 * 1.20 + (unit - 100) * 2;  
        }  
        
        else if(unit > 300)  
        {  
            bill = 100 * 1.20 + 200 * 2 + (unit - 300) * 3;  
        }  */
        
        if(unit<=100) {
        	bill=unit*1.25;
        }
        else if(unit>100 && unit <= 200) {
        	bill=100*1.25+(unit-100)*1.50;
        }
        else if(unit>200) {
        	bill=100*1.25+100*1.50+(unit-200)*1.80;
        }
        System.out.println("The electricity bill for " +unit+ " is : " + bill);   
    }   
}


