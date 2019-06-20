package day42;

public class CopyingA_VariableValue {

	public static void main(String[] args) {
		
		
		int i =10;
		int j = i;
		j=100;
		
		System.out.println(i); // 10
		System.out.println(j); // 100
		
		
		Dog d1 = new Dog();  // her new yazildiginda yeni object is created, 
		                        //that's how u know how many object created
		d1.name = "puppy";
		d1.breed = "pitbull";
		
		
		Dog d2 = d1;
		d2.name = "yumak"; // we have 1 object only, d2 yeni object degil, d1 i isaret ediyor o da.
		
		System.out.println(d1.name);  // // yumak // even if i have hundred leash, its still showing 1 dog.
		
		//further biseyler
		
		d2 = new Dog();    // d2 simdi d1 i artik gostermiyor, mila yi yeni object i gosteriyor
		
		d2.name= "Mila";   // d1 hala yumak
		
		System.out.println (d1.name); // yumak
		
		 
	                          	// ve burda there is no object eligible for garbage collection
	
	    System.out.println(d2.name); // Mila
	
	}

}
