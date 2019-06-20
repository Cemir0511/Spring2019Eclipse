package day47;

public class Course {
	
	public static String school ; // static makes it shared by everyone, how I will fix it-the value, so that nobody can cahneg it,  will come
//	System.out.println(school);  // burda calismaz cunku mainmethod degil, COMMON ERROR

	public static boolean isRamadan;   // beacuse the default value is false, we get normal schedule down
	
	public Course () {
	System.out.println("Constructor");	
	}
	
	///////                INITIALIZER BLOCK    STATIC        |   STATIC BLOCK
	
     // static initializer block: (yada static block):
	 // It will only run once when the class is loaded
     // It's used to initialize the static fileds value before
	 // the type's first usage 
	 //and it will run only one time
	
	static {                         // istedigin kadar block olabilir ama genlde tek olur
		 school = "Cybertek School";
		// school = "Cybertek School";
		 isRamadan = true;  // simdi true ya dondugu icin, use ramadan schedule print eder 
		 
		System.out.println("WELCOME TO OUT SCHOOL: " + school);    //block with no name
		System.out.println("Let the journey begin");
		
		
		//if (isRamadan) {
			//System.out.println("Use Ramadan schedule");     ya hepsi bi yerde olur boyle, yada ayri asada oldugu gibi
		                                                       // ama SIRALAMA ONEMLI
		//}else {
			//System.out.println("Use normal schedule");
		//}
	}

	    // if you have more than one block
	    // it will run in the order it appears
		
		static {
		
		if (isRamadan) {
			System.out.println("Use Ramadan schedule");
		}else {
			System.out.println("Use normal schedule");
		}
		
			
		
	}
	
	
	
	
	
	//int courseId;
	
	
	// public static void main (String[] args) {
		
	//	System.out.println(school);    // why this worked cause its static, then u can directly acess it
//		System.out.println(courseId);   // its not static so we cant access directly( normally u can access by creating obj)
	
	
	
	
	
	
	
	
	
	
	
	}

}
