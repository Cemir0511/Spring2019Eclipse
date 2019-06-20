package day40;

public class BankAccount {

	
	// 2 instance variable or fields:
	// it has default access modifier(

	String accountHolder;
	double balance;
	
	public void showAccountHolder() {
		
		System.out.println("Account holder name is " + accountHolder);
	
	}
	
	public void showBalance () {
		
		System.out.println("Account balance: " + balance);
		
	}
	
	// adding 100 to current balance value
	public void add100Dollar() {
		balance = balance+100;
	}
	
	// adding <custom> amount dollar to current balance
	public void addDollar(int amount) {
		balance = balance + amount;
	}
	
	//create an instance method (demek instance method is not a static method
	//yani I need an object if i need to use this outside my class
	//called showAccountHolder -->> printOut Account holder name
	
	
	
	// create a instance method showBalance accept no paramenetr 
	// and return nothing
	// and print out the balance 
	//---> printOut holder name
	       // nonstatic  - no static, instance demek
	
	
	
	
	//OPTIONAL
	// create an instance method called add100Dollar
	// increase the balance of the account by 100;
	
	//create another class called BankActivity with main method
	//create bank account object
	//set account holder name  and balance value
	//call your showAccountHolder and showBalance method
	
	//OPTIONALL CALL YOUR add100Dollar
	// and call your showBalance method again to see whether balance has changed 
	  
	
	
	
	

	
}
