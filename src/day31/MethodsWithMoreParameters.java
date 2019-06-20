package day31;

import java.util.Scanner;

public class MethodsWithMoreParameters {

	public static void main(String[] args) {
		
	
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user");
		String user= scan.next();
		System.out.println("Enter password");
		String password=scan.next();
		System.out.println("Enter if u remeber me");
		;
		*/
		
		login("Esra", "abc", true);
		
		///////yada boyle call edersin:
		String user = "abc";
		String password= "abc";
		boolean isChecked = false; //ve asagi yine de method call edersin:
		
	    login (user, password, isChecked);
		
		

	}
	//u have to put string user, string password to say what kind of parameter u will use
	public static void login ( String user, String password, boolean rememberMe) {
		System.out.println("You entered username: " + user);
		System.out.println("You entered password: " + password);
		if (rememberMe == true) {
			System.out.println("You checked rememberme box");
		} else {
			System.out.println("You did not check remember me box");
		
		
	}
//
	 // create a static method called login 
	  /* 
	   * it return nothing
	   * It takes 3 parameters : 
	   *     user as String , password as String, 
	   *     rememberMe as boolean
	   * inside body 
	   *     You entered username : ----
	   *     You entered password : ----
	   *     print you checked remeberMe checkbox if it's true 
	   *     print you did not check remeberMe checkbox if it's false
	   * */
	  
	}
	//Akbar's :
	/*
	 * public static void main(String[] args) {
    
    login("spartan","s300",true) ; 
    
    login("horse","h300",false) ; 
    
  }
  
  public static void login(String username, String password
              ,boolean rememberMe) {
  
    System.out.println("You entered username : " + username);
    System.out.println("You entered password : " + password);
    
    if(rememberMe==true) {
      System.out.println("you checked remeberMe checkbox");
    }else {
      System.out.println("you did not check remeberMe checkbox");
    }
	 */
}
