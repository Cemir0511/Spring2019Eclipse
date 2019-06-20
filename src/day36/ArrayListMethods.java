package day36;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		import org.junit.experimental.categories.IncludeCategories;

		public class MoreAppraylistMethods {

		  public static void main(String[] args) {
		    
		    ArrayList<Integer> numlst = new ArrayList<>(); 
		    
		    numlst.add(100); 
		    numlst.add(200); 
		    numlst.add(300); 
		    numlst.add(400); 
		    
		    System.out.println( numlst );
		    
		    // if you try to access index does not exist 
		    // indexoutofbound exception
		    //System.out.println( numlst.get(7) );
		        
		    // inserting items at certain location 
		    
		    // insert 500 as second item 
		    
		    // when inseting a value , the index shift to the next location 
		    // add (index , value) 
		    numlst.add(1, 500) ; 
		    System.out.println( numlst );
		    
		    // it should be within range or exception occur
		    //numlst.add(10, 500) ; 
		    
		    
		    // Updating a value inside ArrayList item 
		    // set(index, newValue)
		    numlst.set(2, 1000) ; 
		    System.out.println(numlst);
		    
		    
		    // deleting everything from the list 
		    //numlst.clear();
		    //System.out.println(numlst);
		    
		    // checking whether an item exists in the list 
		    //  contain(item)  ---> return boolean
		    
		    System.out.println( numlst.contains(1000) );
		    System.out.println( numlst.contains(3000) );
		    
		    // finding out location of item 
		    
		    int indexOf1000 =  numlst.indexOf(1000) ; 
		    System.out.println(" index Of 1000 "+ indexOf1000);
		    
		    
		    boolean isitEmptyOrNot = numlst.isEmpty() ; 
		    System.out.println(" isitEmptyOrNot " + isitEmptyOrNot);
		    
		    // counting items 
		    System.out.println(" size of list  "+ numlst.size());
		    
		    
		    // removing items from arrayList 
		        // remove(ItemValue)
		        // remove(index)
		    
		    numlst.remove(1) ; 
		    System.out.println( numlst );
		    
		    // numlst.remove(300) ;  this is calling remove(index) and we dont have index 300
		    
		    
		    //numlst.remove( new Integer(300) ) ; 
		    numlst.remove(Integer.valueOf(300)) ; 
		    System.out.println( numlst);
		        
		        
		    
		    
		
		
	}

}
