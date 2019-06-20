package day44;

import java.util.ArrayList;
import java.util.List;

public class JobSeeking {

	public static void main(String[] args) {
		
		
		
		
		
    Job j1= new Job();
    Job j2= new Job("Senior Sdet");
    Job j3= new Job("Scrum Master","Oracle",130000);
    Job j4= new Job("Sdet","Santander",125000);
    Job j5= new Job("Tester", "Google", 100000.0);  
    Job j6= new Job("Programmer", "Apple", 2000000); 
    
    System.out.println( j1.getAnnualSalary()  );
    System.out.println( j1.getTitle()  );
    
    
    System.out.println(j1.toString() );   // bu, its just a method specifically have name toString
    System.out.println(j2.toString() );
    System.out.println(j3.toString() );
    System.out.println(j4.toString() );
    System.out.println(j5.toString() );
    // if we print out any reference variable directly 
    // or any object directly
    // it will by default call j6.toString() method
    System.out.println(j6 );                      // toString() method is invoked automatically when an object 
                                                  // is printed, so if you don’t define it yourself in your class, 
                                                  // it will print hashcode
		
		//      ***** Yani bu toString onceden tanimlandi class ta
      // public String toString  demistik class ta, 
      // o yuzden burda default olarak toString var ve devreye girer, class ta tanimladigin icin hashcode vermez.
      // ama class ta toString i yazmasaydin, hepsi hashcode veriridi 
      // j6   da   j6.toString, j1.toString ler de hashcode veriridi, class ta toString olmasaydi
	  // complier looks for toString method to turn parameters to nice String format
 
    List<Job> jobs = new ArrayList<>(); 
    jobs.add(  new Job("Programmer", "Apple", 2000000) ) ;
    jobs.add(j1) ; 
    jobs.add(j2) ; 
    jobs.add(j3) ; 
    jobs.add(j4) ; 
    jobs.add(j5) ; 
    
    //System.out.println( jobs  );
    //System.out.println( jobs.get(0)  );
    for( Job each : jobs  ) {                // for each each each guzel guzel liste seklinde print eder , arraylist de zaten
     // bu Job data type
      System.out.println(each);
      
    }
    System.out.println("---------------");
    for (int i = 0; i < jobs.size(); i++) {
      System.out.println( jobs.get(i) );
    }
    
		
		
		
		/// eger toString de return abc olsaydi, burda hep abcprint olurdu 
		
    
      // if you have toString method defined in your own class
      // it will print out whatever that method returns
      // if not, we will get hashcode
		 
		
		
	 // when we print out:
     // List<WrapperType> List<String> objects directly
                                      //it will just show what's inside directly
		
		
		// if its list of customType object and  if there is toString method 
        //  defined in that custom class, it will print each item as toString return value
		// instead of hashcode
		
		
		
	}

}
