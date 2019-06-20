package day51;

public class AdminUser extends SlackUser{

	 int adminLevel;
	  /*
	   * String displayName; 
	   * int timeZone; 
	   * String status;
	   */
	  public AdminUser(String displayName, String status, int timezone, int adminLevel) {

	    super(displayName, timezone, status);
	    this.adminLevel = adminLevel;
	  }

	  // optional annotation to make sure
	  // you are overriding it correctly
	  @Override
	  public void sendMessage(String message) {

	    System.out.println("@channel Dear good people of sparta");
//	    System.out.println("<"+displayName+"> is sending <" 
//	        + message+">" );
	    System.out.println("abashdgsajhdgahjsgd ");
	    System.out.println("rebellios kids ");
	    
	  }
	  
	  public static void main(String[] args) {
	    
	    AdminUser a1 = new AdminUser("B11", "FULLY CHARGED", 5, 1); 
	    a1.sendMessage("abc");
	    
	  }
	
}
