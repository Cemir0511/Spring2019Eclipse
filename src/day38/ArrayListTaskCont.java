package day38;

import java.util.ArrayList;

public class ArrayListTaskCont {

	public static void main(String[] args) {
		
		ArrayList<String> lst1 = new ArrayList<> ();
		lst1.add("Superman");
		lst1.add("BAtman");
		lst1.add("Aquaman");
		
		ArrayList<String> lst2 = new ArrayList<> ();
		lst2.add("Wonder Woman");
		lst2.add("Cyberg");
		lst2.add("Flash");
		
		lst1.addAll(lst2);
		System.out.println(lst2);
		
		lst1.addAll(2, lst2);
		System.out.println("Justice league: "+ lst1);
		
		
		
		
		//creating arrayList with all the items from another list:
		
		ArrayList<String> lst3 = new ArrayList<> (lst1);
		
		System.out.println(lst3);
		
		
		//How to get String representation out of arrayList objetc?
		String lst3AsString = lst1.toString();
		System.out.println((lst3AsString));
		
		// whenever u print out a reference variable that point to an object; 
		//it will automatically call toString() method implicitly
		
		System.out.println(lst1);              // ayni seyi print ederler, tum listeyi yani
		System.out.println(lst1.toString());   //ayni seyi print eder
		
		
	}

}
