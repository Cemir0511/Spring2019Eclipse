package day49;

public class Employee extends Object{

	// if a class does not extends another class explicitly 
	// it will extends a class called Object implicitly 

	public class Employee extends Object{

	  private String title;
	  private int id;

	  public String getTitle() {
	    return title;
	  }

	  public void setTitle(String title) {
	    this.title = title;
	  }

	  public int getId() {
	    return id;
	  }

	  public void setId(int id) {
	    this.id = id;
	  }

	  @Override
	  public String toString() {
	    return "spartan";
	  }
	  
	  
	  
	  
	  
	  
	}
	
}
