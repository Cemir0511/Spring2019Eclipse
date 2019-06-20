package gunlukTekrarim;

import java.util.ArrayList;
import java.util.Arrays;

public class BlackBoard {

	public static void main(String[] args) {
		
		String [] arr2 = {"cat", "dog", "birds","chivava"};
		
		for ( String animal : arr2) {   /// condition koyalim: if I see a "ll break out from the loop:
			
			if (animal.contains("z")) {
				System.out.println("Found b, getting out form the loop");
				break;
			}
		}
		
		for (int i=0; i<10;i++){   
			if(i==5){ 
				break;
			
			}
		System.out.println("Numbers"+i);
		}
		
		for (int i=0; i<10; i++){
			 
			 if(i%2!=0){
			 continue;
			 }
			 System.out.println("Even numbers" + i);
			 }
		
		int [] rows = {1,2,3,4};
		   int[] cols = {1,2,3};
		   
		   for (int row : rows){
		   
		     for (int col: cols){
		     
		     System.out.print(" |Row" + row + "-Col" +col);
		     }
		     System.out.println();
		     }
		
		   int [] dan = {1,2,3};
		   int [] don = {1,2,3};
		    
		   for (int da:dan) {
			   for (int dod : don) {
				   System.out.println(da +","+ dod);
				   
			   }
		   }
		   
		   
		   String[] canlarim = {"Kemal", "Cemal", "Melih"};
		   String [] gullerim = {"Annecim", "Babacim", "Ablacim"};
		   
		   for (String can : canlarim) {
			   for (String gul : gullerim) {
				   System.out.println(can + ", " + gul);
			   }
		   }
			System.out.println();	
			
		double []d1 = {1.0,1.1,1.3};
		double [] d2 = {9.0,9.1, 9.2};
		 for(double da : d1) {
			 for (double de : d2) {
				
				 System.out.println(da + "/"+ de);
			 }
		 }
		//// creating an array of primitieves and assigning it:
		 
		 int [] numbers = new int [3];
		  numbers [0] = 2;
		  numbers [1] = 3;
		  numbers [2] = 7;
		  
		  System.out.println(numbers); // hashcode verir
		  System.out.println(Arrays.toString(numbers)); // array icinde print eder
		
		   
		///// creating String array and assigning :
		  
		 
		  
		  
		  
		  //// looping an array:
		  
		  String [] names = {"John", "Adam", "Don"};
		
			for (int i = 0; i <names.length; i++){
		     
		          System.out.println("her are names " + names[i]);
			}
		  
		  
	///// ve       For Each Loop ile Array:
	 
	 String [] names1 = {"John", "Adam", "Don"};
	 for ( String name : names1){
	 System.out.println("names  " + name);
	 }
	 
	 
	 String [] kimler = {"ben", "sen", "biz"};
	 
	 for (String kim : kimler ) {
		 System.out.println(kim);
	 }
	 
	 System.out.println(Arrays.toString(kimler));
	 
	 
	 Arrays.sort(names);
	 System.out.println(Arrays.binarySearch(names, "Adam"));  //0
	 
	 Arrays.sort(kimler);
	 System.out.println(Arrays.binarySearch(kimler, "biz"));  //1
	 
	
	
	String [] hepsi = {"Ahmet", "Mehmet","Kemal", "Melih"};
	for (String hep: hepsi) {
		System.out.println("Student names: "+ hep);
	}
	
	Arrays.sort(hepsi);
	System.out.println(Arrays.binarySearch(hepsi, "Melih"));
	System.out.println(Arrays.deepToString(hepsi));
	
	
	/// for loop multidimetioanl array:
	
	String [][] meyveler = { { "elma","armut","grape"}, {"kavun", "karpuz", "kelek"}};
	for (int i= 0; i<meyveler.length; i++) {
		System.out.println("meyveler: "+ i); // 0 indexli row, yani 1. sira
	
	 for (int j=0; j<meyveler[i].length; j++) {
		            // cunku i is row now   ..checking second row
		 System.out.print(meyveler[i][j] + " ");
	 }
	 System.out.println();
	}
	
	
	System.out.println();
	
	String[][] sebzeler = { {"patates","domates","biber"},{"patlican","kereviz"}};
	for (String [] row: sebzeler) {
		System.out.println("rows  ");
		for (String column : row ) {
			System.out.print(column +" ");
		}
		System.out.println();
	}
	
	System.out.println();
	////
	String [][] nicknames = {{"Zeli","Meli","Muro"},{"Muru","Cemo","Kemo"}};
	
	for ( String [] ro: nicknames ) {
		System.out.println("ro ");
		for (String colum: ro) {
			System.out.print(colum+ " ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	///
	
	int [][] numberss = { {1,2,3},{4,5,6}};
	
    for (int [] roww : numberss) {
    	System.out.println("roww");
    	for (int columnn: roww) {
    		System.out.println(columnn + " ");
    	}
    	System.out.println();	
    	
    }
    
    
    
    int [][] pencils = {{2,3},{4,5}};
    for (int i= 0; i<pencils.length; i++) {
    	System.out.println("benim rows" + i);
    	for (int j=0; j<pencils[i].length; j++){
    		System.out.print(pencils[i][j] + " ");
    	}
    	System.out.println();
    }
    
    
    
    
    
    ///
    
    System.out.println();
	
    int [][] kisiSayisi = {{6,7,8}, {9,2}};
     for ( int [] siraa : kisiSayisi) {
    	 System.out.println("siraa");
    	 for ( int columni : siraa) {
    		 System.out.println(columni+" ");
    	 }
    	 System.out.println();
     }
	
	
     
     //// Array list
     
     ArrayList<String> list = new ArrayList<>();
     list.add("apple"); list.add("patatoes"); list.add("enginar"); 
     list.add("edecik"); list.add("kedicik"); list.add("nenecik");
     System.out.println(list);
	
     for(int i=0; i<list.size ();i++) {
    	 System.out.println(i);
     }
     
     System.out.println(list.get(0));
     
     
    // Sout (list.contains(item));
     System.out.println(list.contains("enginar"));
     System.out.println(list.contains("apple"));
     
     
     //   String leri primitive e cecirme, .parse ile:
    	  
     System.out.println(Boolean.parseBoolean("true")); // true verdi
     System.out.println(Integer.parseInt("1"));        // 1 verdi
     System.out.println(Long.parseLong("1"));         //1
     System.out.println(Float.parseFloat("1"));        //1.0 verdi
     System.out.println(Double.parseDouble("1"));      // 1.0 
	 System.out.println(Byte.parseByte("1"));     // 1
	 System.out.println(Short.parseShort("1"));   //1
	 // chararcter de yok
	
	
	 //    Stringleri   wrapper class object e cevirme  .valueOf() ile:
	 
	 System.out.println(Boolean.valueOf("False"));  // false
	 // char // none
	 
	 System.out.println(Byte.valueOf("1")); //1
	 // ve digerleri hep valueOf lu..
	
	// CREATE ARRAYLIST OF DOUBLE 
	    // CALL IT priceList 
	    // Add 5 prices  
	    // try to get 3rd items 
	    // iterate over arraylist using both loops 
	    // and print out 
	    
	    // in another loop 
	    // only print out price more than 10 ; 
		
	 
	 ArrayList<Double> pricelist = new ArrayList<> ();
	 pricelist.add(1.1);
	 pricelist.add(2.1);
	 pricelist.add(3.1);
	 pricelist.add(4.1);
	 pricelist.add(5.1);
	 
	 System.out.println("third item: " + pricelist.get(2));
	 
	 for (int i = 0; i< pricelist.size(); i++) {
		 if (pricelist.get(i)>10.0) {
			 System.out.println(i);
		 }else {
			 System.out.println("do not print");
		 }
		 
		// System.out.println(pricelist.get(i));
	 }
	 System.out.println();
	 for(Double each: pricelist){
		 
		 
		 System.out.println(each);
	 }
	} 
}
