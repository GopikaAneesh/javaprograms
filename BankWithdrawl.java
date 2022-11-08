package assignment;

class BankBalance extends Exception{
public BankBalance(String s) {
	super(s);
	
}
}
class Withdrawl{
	void checkBalance(int a) {
		int balance = 30000;
		try {
			
			if(a>balance)throw new BankBalance("Low Balance \n Your account balance is 30,000");
			else 
				balance=balance-a;
			System.out.println("Current balance : "+balance);
		}
		catch(BankBalance e) {
			e.printStackTrace();
		}
	}
}
public class BankWithdrawl {

	public static void main(String[] args) {
		Withdrawl w=new Withdrawl();
		w.checkBalance(50000);

	}

}


