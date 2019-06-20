package day36;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		
		// do not name your class as ArrayList to prevent colliding with JDK
		// u need to import java.ytil.ArrayList;
	
		
		
		
  //order duyunca bil ki index 
   //collction type olarak en iyisi array list
		
  //Unlike array, it is resizeable
		
  //	can only hold objects, can not store primitives..args bu yuzden primitive wrapper class a ihtiyacimiz var
	
		 
		int i = 10;                                     // 10   bir containerda, i container
		Scanner sxan = new Scanner (System.in);         // scan container, pointer, address
		Double d = new Double ("2.14");                // Double d .args.object yani, 2.14 e point ediyor
		float f = 1.4f;
	
		// an ArrayList variable lst1 is created 
		// and ArrayList object (new Arraylist olan yani) is created and assigned to lst1
		//it did not specify what we can store in this ArrayList
		ArrayList lst1 = new ArrayList(); // this is suggesting us to store a specific type when u creating an array list
		              
		          //lst1 ne?   lst1 is a variable, its a container
		          // ArraylList de type oluyor, just like String, uppercase le basliyorsa, class
		          // new ArrayList de yeni object with multiple slots, you can add whatever u want, diomond la specify edilmedigi icin
		
		lst1.add("abc");        // lst1 bir container, I wanna add ....
		lst1.add("efg");        // string ekledik
		lst1.add(new Integer(10));   // integer object ekledik
		lst1.add( Character.valueOf('A'));  // yani character object ekledik
		                                  //** bunlari cesitli type ekleyebiliriz AMA
		                                //***
		                                // Ama one type / same type add etme recommended always
		                                // while u get it will be chaos, o yuzden same type store suggested
		                               // ve store only one type da soyle olur:
		                              //ArrayList<String> lst = new ArrayLisy<>();
		
		System.out.println(lst1);     // ArrayList te direk print olur, hashcode vermez
		                            // [abc, efg, 10, A] verdi
		
		// ArrayList with type:
		ArrayList<String> lst2 = new ArrayList<>();   // diamond oprator  a specific type yazinca , it means I'm gonna sotore only string
		
		
	}

}
/*

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListCreate {
    public static void main(String[] args) {
        int i =10;
        Scanner in = new Scanner(System.in);
        
        Double d = new Double ("2.14");
        float f = 1.4f;
        
        //Create an  ArrayList object and assign it to list1
        ArrayList list1 = new ArrayList();
        
        //Create an ArrayList object with no arg constructor
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        
        
        list1.add("Go");
        list1.add("Snail");
        list1.add("Mail");
        list1.add("Go");
        list1.add(new Integer(1));
        list1.add(Character.valueOf('A'));
        
        System.out.println(list1);
    }
    
    
    
    
    
    
    
    
    // No primitive type allowed as type
	// ArrayList<int>numList ; THIS IS BAD CODE	
		//arrayList that store only Integer
		ArrayList<Integer> numList = new ArrayList<>(); // correct one
		//numList.add("ABC"); it has to be number only nut STRING(wrong)
		
		
		Integer i = 100; // autoboxing to Integer Object	
		
		// adding item
		//we call add method from Array List class
		
		numList.add(i);		
		numList.add(200);
		numList.add(300);
		
		//Getting single item from arraylist
		//we call get(index) of ArrayList
		Integer i1 = numList.get(0);
		int i2 = numList.get(1);// auto unboxing happened here
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(numList.get(2));
		
		// we can directly see what is inside		
		System.out.println(numList);
*/
