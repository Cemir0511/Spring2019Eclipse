package day50;

public class SlackUser {

	/*
	 
	 TASK 1 
Create classes as below 
SlackUser
  instance fileds : 
      displayName as String
      timezone as int
      status as String
constructor --
    no arg constructor to jsut print out empty slack user  
    3 args constructor to set All fields value
    instance methods : 
    sendMessage    
        have one parameter as message and has no return type
        print --- <displayName> is sending<Message>
    changeStatus
        accept one String as parameter and change status to new status
2 sub classes :
StudentUser
    groupNumber as int 
    
    Create a 4 args constructor to set all field values of StudentUser
    
    // generate toString method so we can print out object directly 
  // create method called displayGroup return nothing 
  Optional 
    print out message --<displayName> is member of group <groupNumber>
       
  
Optional : 
AdminUser
    adminLevel as int 
  
    Create a 4 args constructor to set all field values of AdminUser
   // generate toString method so we can print out object directly 
      
	 * 
	
	 */     

	  String displayName; 
	  int timeZone; 
	  String status; 
	  
	  public SlackUser() {
	    super(); 
	    System.out.println("Slackuser no arg constructor");
	  }
	  public SlackUser(String displayName,int timeZone
	      , String status) {
	    
	    this.displayName = displayName; 
	    this.timeZone = timeZone; 
	    this.status = status; 
	  }    
	  
	  public void sendMessage(String message) {
	    
	    System.out.println("<"+displayName+"> is sending <" 
	            + message+">" );
	    
	  }
	  
	  public void changeStatus(String status) {
	    this.status = status;
	  }
	  
	
	
	
	
	
	
	/*
	 * Shah:
	 * public class SlackUser {
	String displayName;
	int timeZone;
	String status;
	
	
	public SlackUser() {
		super();
	}


	public SlackUser(String displayName, int timeZone, String status) {
		super();
		this.displayName = displayName;
		this.timeZone = timeZone;
		this.status = status;
	}
	
	public void sendMessage (String message) {
		System.out.println(this.displayName + " is " + message);
	}
	
	public void changeStatus (String status) {
		this.status = status;
	}
	
	
	
	
}

package day50;

public class StudentUser extends SlackUser {
	
	int groupNumber;

	public StudentUser(String displayName, int timeZone, String status, int groupNumber) {
		super(displayName, timeZone, status);
		this.groupNumber = groupNumber;
	}


	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + ", displayName=" + displayName + ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}
	
	public void displayGroup () {
		System.out.println(displayName + " is member of group " + this.groupNumber);
	}
	

}

	 */
	
	
	
	
}
