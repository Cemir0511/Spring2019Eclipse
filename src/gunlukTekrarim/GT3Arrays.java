package gunlukTekrarim;

import java.util.Arrays;

public class GT3Arrays {

	public static void main(String[] args) {
		

///////////   Arrays  
	/*  
	 Arrays are single variable that hold multiple value of same data type. 
	 either a primitive type or a reference type
	 
	 // 100 students..in a class..no need 100 variable
	 you create an array object to store 100 student and we can access them using index.
	 Ex:
	 --grocery list
	 --contacts
	 --phone numbers
	 
	 *items of same types (many many) can be stored in same array object
	 
	 //Syntax format for array:
	  
	 
	  
	  dataType [] variableName = new dataType[size];
	           bu array before veya after variable name olabilir
	 
	 Ex: creating an array of primitives:
	 
	 int [] numbers = new int [3]; bu sadece size gosterir
	                               3 variable var icinde demek
	                               herhangi bir value assign etmeyince, 0 default value olur!
	 
	 Or:
	 
	 int numbers [] = new int [3];   yukardakiyle ayni sey
	 
	 
	 
	            numbers 
	 element      0      0    0
	 
	ve de: 
	 index        0      1    2
	 
//////////  creating an array of primitives and how you assign a value one by one using index:
 
     int [] numbers = new int [3];
     
     num[0] = 2;         3 object:
     num[1] = 5;         2   5   7
     num[2] = 7; index:  0   1   2
     
    System.out.println(numbers); // hashcode verir
	System.out.println(Arrays.toString(numbers)); // array icinde print eder
		                                         printed: [2,3,7]
	 
	 
	 
	 int [] numbers = new int [] { 2,3,7}; // boyle de assign edebilirsin 3 value
	 
	 or:
	 
	 int [] numbers = {2,5,7};    ///direk boyle de assign edebilirsin 3 value
	 
	 
	 
	 
/////// String Array Example:
    
    String [] name = new String []{"Jon", "Don", "Ron"};
    
     or directly:
     String [] names = {"Jon", "Don", "Ron"};
                          0      1       2
	 
	 
	 
	 
/////// Creating an Array of Reference Type:
    /// referans yani person demek person variable ...
	 3 person object:
	 
	  Syntax for creating Person Array:
	  
	  Person p1 = new Person();// assume name and age already assigned
	  
	  Person [] people = new Person [3];
	  
	  people [0] = p1;
	  people [1] = p2;
	  people [2] = p3;
	 
	 //created 3 person object and assigned reference value
	 
	 
// other way to create array of reference:
 
 	 Person [] people = new Person []{p1, p2, p3};
	 
	 or:
	 
	 Person [] people = { p1,p2,p3};
	 
	 
		
/// IN ORDER TO ACCESS ARRAY, WE NEED TO USE INDEX:
		
	//Syntax for accesing array elements:
		
		int [] intArray = {2,5,7};
		
	/// direk sout (intArray) dersen hashcode cikar
	// ya tek tek numbers indexle print edersin
	 * Ya da LOOP ile
	 * Yada Sout(Arrays.toString(inArray) ); ile
	 * 
		Sout ( "Numbers 1" + numbers [0]);
		Sout ( "Numbers 2" + numbers [1]);
		Sout ( "Numbers 3" + numbers [2]);
		
		
	//boyle sequential number gorurgormez loop dusun:
	
	 
////	 Looping and Array:
	 
	String [] names = {"John", "Adam", "Don"};

	for (int i = 0; i <names.length; i++){
     
          Sout("names " + names[i]);
	
	}
	                         boyle print eder:
	                         
	                         names John
                             names Adam
                             names Don
	
	
///// ve       For Each Loop ile Array:
 
 String [] names = {"John", "Adam", "Don"};
 

 for ( String name : names){
 Sout("names  " + name);
 }
                     ayni seyi print etti:
                     
                     names  John
                     names  Adam
                     names  Don

	
	
	// examples:
	
 String [] ney = { "nere", "gele", "hele"};		  
		System.out.println(Arrays.toString(ney)); 
		                                         prints:  [nere, gele, hele]
		
		 for ( String elemant : ney) {
			 System.out.println(elemant );
		 } 
		                                        prints: 
		                                        nere
		                                        gele
		                                        hele
		                                        
	   System.out.println();
	   
///	   reverse the array:
	
		for ( int i = ney.length-1; i>=0; i--) {
			 System.out.println("sonuncu "+ ney[i]);    // ney[i] index i okur arraylerde
		}	 
	
		                                        prints sondan basa:
		                                        sonuncu hele
		                                        sonuncu gele
		                                        sonuncu nere
		
		
// more ex:
 
   
	 String [] kimler = {"ben", "sen", "biz"};
	 
	 for (String kim : kimler ) {
		 System.out.println(kim); 
		                              prints:
		                              ben
		                              sen 
		                              biz
		                              
	 }
	 System.out.println(Arrays.toString(kimler)); // arrays import etmeyi unutma
	                                    
	                                  prints: no matter what: bu sekil print eder yanyana
	                                  
	                                  [ben, sen, biz]
	 
		
		                                    //****Simdi Sorting arrays and doing binary search:
		
/////////////   ARRAYS UTILITY CLASS:      Array class    * Arrays.sort(arr)
                                                          * Sout(Array.binarySearch(arr, targetItemToSearch); //index verir sorttan sonra
  import.java.util.Arrays;                                * Sout(Arrays.toString(arr));  bu da array icinde sadece print eder String yapar
                                                          * yada for loop kullanirsin 
                                                                                for (int i=0; i<arr.length; i++){
                                                                                Sout da print( arr[i]) normal print eder arraydeki icerigi
  import java.util.*;                                     * yada for each loop ile  direk item lari print edersin  for (int item:arr)
	                                                                                                                    Sout.print(item)
	                                                                                                                    
	
	Sorting ve binary search... array icinde bi sey bulmek icin Sort yaparsi once sonra binary search:
		
	
	int [] targetArrayObject = {11,4,6};   ///declared an array
	
	int targetItemSearch = 4;   // 4       //int variable to search.. 4 u arayacagiz
		
		                                 //Once sort yapmak zorundayiz
		                                  * Sort u tum primitive types ve string de kullanabiliriz
	                          
	Arrays.sort (targetArrayObject); // 4,6,11   siraya koyar ascii ye gore	
	
	Arrays.binarySearch(targetArrayObject, targetItemSearch); //0  //0..sifirinci index te
		     1st item: once array ini yaz,  2nd item: item to search
		
		                              //Arrays.sort yapmadan , binary search yapamazsin
		
	Optionally:
	
		you can use:
		
	Arrays.toString (targetArrayObject); // [4,6,11] ** for loop kullanmak istemiyorsan, direk Arrays.toString Sout icinde kullanip yazdirabilirsin
		
		
		
/// Sorting an Array;   // modifies the index of array in ascending order
 * 
   int [] intArray = {2,15,7,1,3};
 --Syntax for sorting Array elements:
   Arrays.sort (intArray);             // sort ettikten sonra for loop da kullanabilirsin
                               
   for (int item :intArray){
    Sout ("numbers " +item);
    
   }
   
   
   YA DA:::: you can use Arrays.toString de kullanabiulirsin.(for loop kullanmak istemiyorsan)
   
   int [] ints = {2,15,7,1,3};
   
   Arrays.sort(ints);     //Syntax for sorting/kucukten buyuge siralama yani array objects
   Sout(Arrays.toString(ints));  // array icini array li print eder...
   
   
   
   Sout(ints) /// bu hashcode print eder, direk sout asla array i print etmez.
   
  
   
   
   
   
   /////****** Yani sort edip siraya koyduktan sonra
    1. Arrays.binarySearch (array, itemTosearch);   ile array ojcetlerin indexini bulabilirsin
    
    2. for loop, veya for each(daha iyi) ile print ettirirsin  // duz , normal print eder
    
    3.Arrays.toString(arrayinIsmi); ile array icerisinde print ettirebilirsin.. [] icerisinde print eder ama Stringdir.
    
    
    
    
    ///// Sorting a String Array;
     
    String [] names = {"John", "Adam", "Don"};
     
    Arrays.sort(names);
    
    for (String item:names){
    
    Sout("names  " + item);     normal sekilde Adam, Don, John    sirasinda print olur
    }                          //uzunluk farketmez, harf sirasina gore siralar sort eder ascii table a gore
                              boyle print etti:
                              names  Adam
                              names  Don
                              names  John

     
     
    Ascii sirasi   :  special characters
                      numbers
                      Uppercase
                      lowercase
                      
    
    
    Again, Array.sort    changes, modifies the index of array...according to asccii, in an ascending order
                       special characters, numbers, Uppercase, lowercase siralamsinda
    
    
    
   Yine basa donersek:
   
   Searching within an Array:
   
   Arrays class from java.util package provide convenient way to search ONLY IF THE ARRAY IS ALREADY SORTED:
   
   SYNTAX FORMAT:
   
   Arrays.binarySearch(yourArray, elemntToSearch);
   
   Binary Search Results:
        Scenario                              Result
   1. Elemnt found in sorted array 
      according to index   
   
   2. Elmnt Not Found                          Negative value corresponding to normal order... normalde olsa hangi sirada olacaksa -6 falan yaziyorsun, 6.yere uyuyorsa 
    
                                             (
   
   3. Unsorted array                          Unpredictable result
                                              (sort yapmadan, binary seacrh olmaz, sort olmazsa uppredictable result olur)
    
    
    //Examples to access Array elements:
     
     int [] ints ={ 2,5,7,14};
     
     Sout(Arrays.binarySearch(ints,2)); //0      index 0
     Sout(Arrays.binarySearch(ints,7)); //2      index 2
     Sout(Arrays.binarySearch(ints,9)); //-4    normal siralamadaki negative value yu yaziyoruz
     Sout(Arrays.binarySearch(ints,15)); //-5  normal siralamda negatif value da
     
     
     
     
     Ex;
     --
      String [] names1 = {"John", "Adam", "Don"};
     
       
	 Arrays.sort(names);
	 System.out.println(Arrays.binarySearch(names, "Adam"));   // 0 verdi index for Adam sorttan sonra
	 
     --
     
     String [] kimler = {"ben", "sen", "biz"};
     
     Arrays.sort(kimler);                       // once boyle sort edersin
	 System.out.println(Arrays.binarySearch(kimler, "biz"));  //1      Sonra sout icinde Arrays.binarySearc(array,targetsearch);
     
   
   
   
   
   
   
   
   
    
    //////////          Multidimesional Arrays:
    
    -- An Array object that store other arrays
    -- Instead of storing single value, we store other arrays.
    
    
    
    int SingleDuck;
    
    int [] ducks = {1,2,3,4,5};           // bir pond da 5 duck, one dimensional array
    
    int [][] groupsOfDucks;              // bir buyuk farm array de, 0, 1, 2 location da 5 er ordek, two dimensional array
    
    int [] [] [] duckTown;               // bir town da 3 farm da, 3 er pond da, 5 er ordek  , 3 dimensional array
                                         each square bracket represent one dimension array
                                         her bracket in icinde de 3 ayri pond var, 5 er ordek var
                                        
    
    int [][][][] duckCounty              1 ulke, 4 sehir, 3 er pond, 5 er ordek
                                         we store 4 , three-dimesional array
    
    
    
    
    *** each square bracket represents each different dimension
    
    
    
    
     1 dimesional array:
     
     int [] intArray = { 12, 13, 43, 5, 66};   // we store single elements , each has index value, each index only have one value
     
     int [][] arrayOf-IntArray = { intArray, intArray,intArray, intArray,intArray, intArray};
    
                                 // yani bir buyuk container da, 6 adet container var, iclerinde 5 er sayi var herbir containerda
                                 //idex 0-5 arasi.
    
    
    int [][][] ThreeDArray = (arryOf-IntArray, ArrayOf-IntArray);
                                // yani yukardaki intArray den ikitane 2 dimesional arrayler, buyuk bir container ar girdiu , 3 dimesional oldu
    
                              index 0-1 dir , iki item var
    
    
    
    Examples:
    
    Animal [][] animalCages ; //1 farm da ,4 cage, 3 er animal (yada farkli sayida olabilir)
    
    int [][] pizzaBites;      // bir pizza, 8 slice (multiple slice), 3 er topping (multiple topping)
    
    
    Fruit [][] fruitBoxes;    // bir dolapta, 4 box, farkli sayida fruits, (1 fridge, multiple box, multiple fruits)
    
                   **container larin icine, ayni veya fakli sayida element koyabilirsin!!
    
    
    
    
    Pizza icin, slices, and bites nasil yazariz 2 dimesional:
    
    each slice first dimension, each bites, second dimesion.
    
 *   example for declaring 2 dimentional int array:
    
  - with size;
    
    int [][] intArray = new int [7][3] // 7 slice, 3 bites demek
                                          7 row  , 3 column demek
    ya da :
    
    int [] intArray [] = new int [7][3];    
    
    ya da :
    
    int intArray [][] = new int [7][3];
                                         ucu de ayni ve dogru sekilde declare etme
    
    
    
    
  * example for declaring 2 dimentional String array 
  - with size;
  
  String [][] data = new String [7][3];
  
    
 **  ve simdi declaring 2 dimetial intarray
  -  WITH SIZE AND ASSIGNING VALUE:
  
 --> int [][] data = new int [2][3]       rows, columns, excel sheet dusun 
                                 I have 2 items, and each item has 3 elements inside
    
    // just like single array, I assign the value by index in 2 dimetional arrays too:
      
     
    data [0][0]=12;   first index refers to first dimension, the second index refers to second dimension
       row 0,column 0      first index refers to row, second index refers to column.
   
    data [0][1] = 5; 
         row0,col1
    
    data [0][2]=4;                 
         row0,col1
         
    data [1][0] = 23;
    
    data [1][1] = 113;
    
    data [1][2] = 32;
    
                              12   5      4 
                              23   113    32
    
    
    yada: in other way:
    
    
   --> int [][] data = new int [2][3];
    
    data[0] = new int []{12,5,4};  index 0, yani entire row 1, new intle tum sira yazilabilir
    
    data [1] = new int [] {23,113,32};, b da index 1 yani 2.tum sira, new int [] {} ile yazilir
    
    
  -->>  second square bracket size is optional as long as you define how many item u store in first dimension with new int []:   !!!!
    
    int[] [] data = new int [2][];          // new int kullanirsan boyle, 3 veya daha fazla item store edebilirsin, doesn't matter
    data[0] = new int [] {12,5,4};
    data[1] = new int [] {23,113,32};
    
    
    
    
  ya da :
  
    
   // in one line and accesing them by index:
    
    
 --->>  int [][] data = { {12,5,4} , {23,113,32} }; 
    
    And this is how we access each item:
    
    System.out.println( data [0][0]);   direk index le access edip print edebiliriz boyle
    System.out.println( data [0][1]);
    System.out.println( data [0][2]);
    System.out.println( data [1][0]);
    System.out.println( data [1][1]);
    System.out.println( data [1][2]);
    
  -- boyle ustteki gibi tek tek print ettirebilirsin
  -- yada for loop ile acces edip print ettirebilirsin:
  
  
  
 // *****  declaring 2 dimetial int array  in one line and accessing using for loop:
   
  
    int [][] data = { { 12,5,4}, {23,113,32} };  // ne zaman sequential number gorsen for loop dusun, arraylerde for each dusun hatta:
    
    
    
    for (int i = 0; i< data.length; i++){
    
    System.out.println ("*****Row : " + i);
    }
    
    for (int j =0; j< data[i].length; j++){  //data[i].length yapiyoruz cuknu i artik row, 2. row icin boyle yapiyoruz
    System.out.println(data[i][j]+ " ");
    }
    System.out.println();
    
    
  
    
    
    
         
  ---->>  **   2 dimesional int array for each loop kullanarak yazma:
  
   int [][] data = { {12,5,4}, {23,113,32} };
   
   
   
   
   
   
   for (int [] rows : data){
   
   System.out.println ("*****Row : ");
    
   for ( int [] columnData : data){
   
    System.out.println (columnData + " ");
    }
    
     System.out.println();
     }
     
                     ///3 dimestional:
                     /////   decraring 2 dimesional Array
      
                 int [][] data1 = { { 12,5,4}, {23,113,32}};
                 int [][] data2 = { { 6,15,14}, {20.3.88}};
     
                 Storing above 2 variable to another array to make it 3 dimesional :
      
                 int [][][] threeDArray = { data1, data2};
       
                // or:
       
        
                int [][][] = new int [2][][];
                threeDArray[0]= data1;
                threeDArray[1]=data2;
        
        
       
       
       
       
       
       
       
       
       
       
       
       
     
     ///////////////////////
     
                                    VarArgs
     
     
     //////    VarArgs  is short for variable arguments where you can pass a variable numbers of argument with same type
      * 
      * It can be seen same as array when used as method arguments
      * 
      * It can only be used inside the parameter, it can not be used outside the paranthesis as arrays..only idfference..
     
      
      
      public static void main (String [] args) {}
      public static void main (String... args) {}
      
         
   
       public static void addNumbers (int [] numbers) {}
       public static void addNumbers(int... numbers) {}
      
      varargs can be used same as array inside method(can't be used outside the paranthesis/parameter).
      
      
      
   
      
      main method once: 
      public static void main (String [] args){
      
      calculator c = new Calculator();
      int nums = { 2,3,77};
      c.printAllArrayNumbers(nums);
      c.printAllNumbers(1,2,3,54,23432,423,23432): call ettik
      
      c.printAllNumbers(3,4,6,7); // baska sayilarla da call edebiliriz
     
     Array method call etmenin farki: u call single array with multiple values.
                                     vararg da ise you pass variable number of arguments as seen yukarda call ettik ve asagida methodlar
     varargli   methodum:
      
    
      public void printAllArraynumbers(int [] numbers){
      
      
      for(int =0; i<numbers.length;i++){    //for loopla array leri print etmek istiyorum
      System.out.print(numbers[i] + " ");   // index i ile okuyorum, numbers[i] yani
      
      }
      System.out.println();
      
      //instead of printing array, I want to print a variable number of arguments:
       * 
       
       public void printAllNumbers (int... numbers){ 
                                       array yerine vararg kullandik
                                       you can pass as many arguments as u want as long as the type is int
       System.out.println (numbers[i] + " ");
       }
       System.out.println();
      
      ** array ve vararg treat etme sekli ayni methodda..
      
         tek fark arrayden; var arg can only be used inside the parameter, not outside.
         you can not declare a vararg outside like you did array.
         you can only use it as method parameters!
      
      
      
      
      
      
      
    */
   

		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
