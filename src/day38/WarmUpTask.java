package day38;

import java.util.ArrayList;

public class WarmUpTask {

	public static void main(String[] args) {
		
		/*
	     * TASK 1 : 
	     * Create an ArrayList of integer from 1-100
	     * 
	     * get the sum of the each items 
	     * get the average
	     * 
	     * Create another list that contain items from 100- 1 
	     * get the count of numbers divisible by 3 and 5 
	     * 
	     * OPTIONAL 
	     * Combine above 2 lists -- add everything from 2nd list to first one
	     * 
	     * Update every odd items to 0 ; 
	     * 
	     * */
		
		
		ArrayList<Integer> liste = new ArrayList<>();
		
		for (int i = 1; i< 100 ; i++) {
			liste.add(i);
			System.out.println(liste);
			
		}
		
		int sume =0;
		for (int i =0; i<liste.size(); i++) {
			System.out.println(liste.get(i));
		}
		
		
		
		
		
		
		
		
	    ArrayList<Integer> lst1 = new ArrayList<>();
	    // adding 1-100 to the list 
	    for(int i=1; i<=100; i++) {
	      lst1.add(i);
	    }
	    System.out.println(  lst1  );
	    
	    
	    int sum = 0;
	    for (int i = 0; i < lst1.size(); i++)
	    {
	      sum+= lst1.get(i);
	    }
	    int average = sum/ lst1.size(); 
	    System.out.println( "the average is : " + average);
	    
	    
	    
	    
	    // 2. part of task 1
	    ArrayList<Integer> lst2=new ArrayList<>();
		for (int i = 100; i >0; i--) {
			if(i%3==0 && i%5==0) {
				lst2.add(i);
			}
		}
		System.out.println(lst2);
	    
	    // when u don't care about index, u can orefer for each loop..
		 
         // 2. icin for each loop lu:
		int count = 0;
		for (Integer each :lst2) {
			if (each %3 == 0 && each %5==0) {
				count++;
			
        //System.out.println("target number : " + each); print etme sadec
			}		
				//ama count da soruyor:
			System.out.println("The target count is : " + count);
				
		}
	       
		//Optional part:  bozuk oldu bu sayfayi duzelt
		
		for (int i = 0; i < lst2.size(); i++) {
			//System.out.println(lst.get(i));
			
			lst2.add(lst2.get(i));
		}
		
		System.out.println(lst2);
		
		////////////             addAll methodu iki sekli:
		
		//to the end of the list:
		///adAll method of ArrayList class
		//this will just add every item in lst2 by the end of the list1 items:
		
		lst1.addAll(lst2);
		System.out.println((lst1));
		
		
		
		//to specified index:
		////addAll method , second version is :
		// this will just add every item on ls2 to the specified index
		
		lst1.addAll(1,lst2);
		System.out.println(lst1);
	      
	  /*    
	Akbar's
		/*
     * TASK 1 : 
     * Create an ArrayList of integer from 1-100
     * 
     * get the sum of the each items 
     * get the average
     * 
     * Create another list that contain items from 100- 1 
     * get the count of numbers divisible by 3 and 5 
     * 
     * OPTIONAL 
     * Combine above 2 lists -- add everything from 2nd list to first one
     * 
     * Update every odd items to 0 ; 
     * 
     * */
     /*
    ArrayList<Integer> lst1 = new ArrayList<>();
    // adding 1-100 to the list 
    for(int i=1; i<=100; i++) {
      lst1.add(i);
    }
    System.out.println(  lst1  );
    
    
    ArrayList<Integer> lst2 = new ArrayList<>();
    // adding 1-100 to the list 
    for (int i = 100; i > 0; i--) {
      lst2.add(i);
    }
    System.out.println(lst2);
    
    // the logic is : pick each and every item in lst2 and add it to lst 1 
    
    for (int i = 0; i < lst2.size(); i++) {
      //System.out.println( lst2.get(i) );
      Integer eachIn2 = lst2.get(i)  ; 
      lst1.add( eachIn2  ) ; 
    }
    
    System.out.println(lst1);
    
    
  }

}
		 */
	
		 
		
		
		
	}

}
