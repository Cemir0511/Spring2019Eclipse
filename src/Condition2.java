	  import java.util.Scanner;
public class Condition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*grocery store:
		 * declare double variable for price of iphone , ipad, your budget
		 * assign value for iphone as 599.99, ipad as 899.99
		 * declare two more int variable for iphone count phoneCount and tabletCount
		 * ask user enter your budget
		 * ask usert o enter quantity u want to buy
		 * 
		 calculate the total price
		 /*write the conditional statementto check whwthwr total price is more than your budget
		  * if it is more, print, out of budget
		  * else print, I will take it!!*/
		 
	
		  Scanner input =new Scanner(System.in);
	
		double priceOfiPhone = 599.99, priceOfiPad = 899.99; yourBudget; 
		int iphoneCount, ipadCount;
		double total = iPhonePrice
		
		System.out.println("Enter your budget");
		double budget = input.nextDouble();
		
		System.out.println("how many iphones do you want to buy: ");
		iphoneCount=input.nextInt();
		
		System.out.println("how many tablets do you want to buy: ");
		ipadCount=input.nextInt();
		
		totalPrice= (iphoneCount*priceOfiPhone)+(priceOfiPad+ipadCount);
		if(totalPrice<budget) {
			System.out.println("I will take it");
		}else {
			System.out.println("too much for my budget");
		
		
		
		}
		
		
		
		

	}

}
