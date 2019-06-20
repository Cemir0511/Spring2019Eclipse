package day44;

public class Job {
	
	
	/*
	Job class
    *
    * private fields 
     title , company , annualSalary
 *
 *   Encapsulate above private instance fields
 *   Create no arg constructor -- constructor with no parameter
 *       to set title to “undefined”
         to set company to “unknown”
   
   -- constructor with 1 parameter   
 *   Create 1 arg constructor to set title  
 *  -- constructor with 3 parameters   
    Create 3 arg constructor to set all 3 fields
 *
 
 *   create a method called toString     ********************
 *   it accepts no parameters and
 *   return concatenation of all field value in nice format
 *
   
   Inside another class Called JobSeeking with main method 
 
 *   Create few job objects and and add it to ArrayList<Job> object
 *   iterate over all items and print them out
 *
    *
    * */

	//  POJO --->Plain Old Java Object
	//            
	
	
	
	private String title;                    //all encapsulated with private*
	private String company;
	private double annualSalary;
	
	
	// // right click -- source -- generate getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public Job () {
		System.out.println("Message form : Job");
		title = "undefined";
		company = "unknown";
		
	}  
	public Job (String title) {                                  // (Sting newTitle)      this. ile yanda yazilmis haliyle bu newTitle hali ayni sey
		System.out.println("Message from : Job(String title");   
		this.title = title;                                     
		company = "unknown";                                       // title = newTitle  
		
	}
	public Job (String title, String company, double annualSalary) {
		System.out.println("Message from : Job(String title, String company, double annualSalary");
		this.title = title;
		this.company = company;
		this.annualSalary = annualSalary;
		
	}
	  // toString methodu:
	
	  // this is the special method that will be called
	  // when reference variable printed out directly 
	  // and method header should exactly as below 
	  // toString , does not accept parameter and return String
	public String toString () {                   // u just concatinate them  and it gives nice output
		String allFields = "Title: " + this.title     
				+ " | Company: " + this.company               // this. lar burda ne demek oluyor?
				+ " | Annual Salary:" + this.annualSalary;    // yani it means specifically they are fields
        return allFields;                                     
	}   // return "abc";
	    // main class da abc print ederdi
	                                                           // burda tanilanan toString methodu String olmak zorunda ozellikle
	    // return "spartan needs job";                                                      // ve bu main class ta default olarak objectleri String seklinde print etmesini saglar
	                                                          // yoksa hashcode olurdu
	    // bunu print ederdi                                   // toString, returns String, ve parameter almaz
	
	
	
	//   eger toString de return abc olsaydi, burda hep abcprint olurdu 
	
	// you can shortcut :
	// right click >> Source >> Generate toString()
	// orda    @Override    cikacak, henuz bilmiyoruz, sil onu
	
	
	
	
	
	
	
	
	
	
	/*
	 * public class Job {

  private String title;
  private String company;
  private double annualSalary;

  public Job() {
    System.out.println("Message from : Job() ");
    title = "undefined";
    company = "unknown";
  }

  public Job(String title) {

    System.out.println("Message from : Job(String title) ");
    this.title = title;

  }

  public Job(String title, String company, long annualSalary) {
    
    System.out.println("Message from : Job(String title, String company, long annualSalary) ");
    this.title = title;
    this.company = company;
    this.annualSalary = annualSalary;
  }
  
  public String toString () {
        
    String allFields = "Title: " + this.title 
        + " | Company: " + this.company 
        + " | Annual Salary:" + this.annualSalary; 
    
    return allFields;
    }
  
  

  // right click -- source -- generate getters and setters
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public double getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

	 */
	
	
	
	
	
	
	
	/*
	 *package day44;

public class Job {

  private String title;
  private String company;
  private double annualSalary;

  public Job() {
    //System.out.println("Message from : Job() ");
    title = "undefined";
    company = "unknown";
  }

  public Job(String title) {

    //System.out.println("Message from : Job(String title) ");
    this.title = title;

  }

  public Job(String title, String company, double annualSalary) {
    
    //System.out.println("Message from : Job(String title, String company, long annualSalary) ");
    this.title = title;
    this.company = company;
    this.annualSalary = annualSalary;
  }
  
  // this is the special method that will be called
  // when reference variable printed out directly 
  // and method header should exactly as below 
  // toString , does not accept parameter and return String
//  public String toString () {
//        
//    String allFields = "Title: " + this.title 
//        + " | Company: " + this.company 
//        + " | Annual Salary:" + this.annualSalary; 
//    
//    return allFields;
//    }

  public String toString() {
    return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
  }
  

  // right click -- source -- generate getters and setters
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public double getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
  }

}


	 * 
	 */
	
}
