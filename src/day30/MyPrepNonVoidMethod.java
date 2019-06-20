package day30;

public class MyPrepNonVoidMethod {

	public static void main(String[] args) {
		giveMe5$ ();//tek boyle print etmez
		int amount = giveMe5$ (); //5 int value ya assign olur 
		System.out.println(amount);//5 int old icin tek 5 print olur
		
		System.out.println(giveMe5$()); 
		getPresidentName(); //method old icin hep parantez koyarsin 
		                    //parantez olmazsa variable olur cunku
		
	   String president = getPresidentName();
	   System.out.println("US president is " + president);
		
		whatIsYourName();	
		teacherName("Berin");
		System.out.println(teacherName("Berin"));
		
		
	}	
	//////methods with return value; non-void
		public static int giveMe5$ (){
			 int d = 5;
			 return d;
			 }
			 
			 public static  String getPresidentName(){
			 return "Donald Trump";
			 }
			 
			 public static  String whatIsYourName(){
			  String name = "Zeliha";
			  return name; //return non-void ler icin syntax
			              // CUNKU RETURNS VALUE METODU
                          //RETURN YAZMAZSAN COMPILE ETMEZ!	
			  
			  }
			 public static  String teacherName(String teacher) {
				  String teacher1 = "Berin";
				  return teacher1;
	
			 
		

	}

}
