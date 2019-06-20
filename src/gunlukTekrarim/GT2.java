package gunlukTekrarim;

import java.util.Scanner;

public class GT2 {

	public static void main(String[] args) {
	
//////////////////       While Loop 
		
	/*	
	 declaration
	 
	 while (condition) {              > as long as condition is true, it keeps looping
		 Sout (keep doing this);      > the code repeated in loop is called the body of the loop curly braces ici
	 }                                > Each repetition of the loop body is called an iteration of the loop
	                                  > condition boolean koyarsin her zaman
	  
	*/
		
	int apples = 1;
	
	while (apples <=10) {    //as long ass boolean condition is true, keep looping //cury braces ici loop body, repetion lar iteration
		System.out.println("Eating an apple " +apples);
		apples ++;          //update statement; increment to reach 11, to make it false eventually and to stop the loop.
	}
	 System.out.println("No more apples :("); //after exiting loop, this will be seen eventually.
	 
	 ////
	 System.out.println();
	 ////
	 int oranges = 1;
	 while ( oranges <=5) {
		 System.out.println("Taste the organges " + oranges);
		 oranges++;
	 }
	 System.out.println("Tasted all oranges!");
	 
	 ///
	 System.out.println();
	 ///
	 
	 int count, number; //scanner dan numara girip, count adedince print ettirme
	 Scanner scan = new Scanner (System.in); // while loop ta scanner ustte..sonra while loop body
     System.out.println("Enter a number: ");
     number = scan.nextInt();
	 
     count = 1;
	 while (count <= number) {
		 System.out.println("Count is: " + count + ",");
		 count ++;       // count ++ unutma , bu durduracak loopu, kac adetse
	 }
	 //
	 System.out.println();
	 //
	 
	 int a =1;
	 while ( a<=22) {
		 System.out.print(a + ",");
		 a  +=2;    //sadece 2 serli yazdirma,atlayarak yazdirma   +=2;
	 }
	System.out.println();
	
	int a1 = 1;
	while (a1 < 11) {
		System.out.println(a);
		a1 *=2;  //iki ktini yazdirma  *= 2;
	}
	
	System.out.println();
	
	int b = 0;
	while (b < 20) {
		System.out.println(b);
		b+=5;  // = 5 li yazdirma       += 5;
	}
	System.out.println();
	
	int total = 0; //girilen poszitif sayilarin toplamini alma, negatif girince  stop
	
	System.out.println("Enter a pozitive number: "); //sadece bi kere yazilmasi icin, uste koyabilirsin, sonra loopta sadece sayilar yaziladurur
	//int nextNum = scan.nextInt();
	int nextNum=0;
    while (nextNum>=0) {
    	System.out.println("Enter a pozitive number: "); //bunun da hep yazilmasini istiyorsan loop icin e koy sout u
    	total = nextNum + total;
    	nextNum = scan.nextInt();
    }
	System.out.println("Sum of all nums: " + total); 
   
	System.out.println();
	//////
	
	System.out.println("Enter the payment: ");
	int bill = scan. nextInt();
	
	while (bill >=0 && bill <= 100) {
		bill = scan.nextInt();
		//System.out.println("Payment correct!");
	}
	System.out.println("Thanks for shopping! get your card");
	System.out.println();
	
	////
	
	// bir sayi girip 9 ex, 9 a kadar print ettirme:
	
	System.out.println("Enter your target number");
	int targetNumber = scan.nextInt();
	int counter = 0;
	
	while(counter<=targetNumber) {
		System.out.println(counter++);
		//counter++;
	}
	
//&&&&&& print ettirme:	
	String and = "&";
	int an = 1;
	
while (an <= 5) {
	System.out.println(and);
	and+="&&";
	an++;
}
System.out.println();
/////
//StairCase:
String star="*";
int x =1;
while(x<=5) {
	System.out.println(star);
	
	star=star+"*";//add one star existing star
	x++;//and so on add on existing star
}
System.out.println();

//////////
//print each char by using WHile Loop:
String name = "Zeliha Hanim";
int ind = 0;
while ( ind<=name.length()-1) {
	System.out.print(name.charAt(ind));
	ind++;
}
System.out.println();

//Print char by while loop:
String word = "Facebook";
//012345
//123456
//print each character one by one in separate lines
int idx = 0;
while(idx < word.length()) {
System.out.println(word.charAt(idx));
idx++;
}

//print each character in reverse order
int idx2  = word.length() - 1; //5

while(idx2 >= 0) {
System.out.println(word.charAt(idx2));
idx2--;
}

System.out.println();

///// Palindrome:
/*
Scanner scan = new Scanner(System.in);
System.out.println("Enter word to test:");
             //0123
String word = scan.next();
String reversed = "";
//loop through word in reverse order and 
//concetanate each character to reversed string

int idx = word.length()-1;
while(idx >= 0) {
	reversed = reversed + word.charAt(idx);
	idx--;
}

System.out.println(reversed);
//compare if word and reversed are equal
if(reversed.equalsIgnoreCase(word)) {
	System.out.println("It is palindrome");
}else {
	System.out.println("It is not palindrome");
}
*/
/*
//TASK 1 : java kelimesi ni alana kadar keep asking:
// Ask user to enter a sentence     
// if the sentence does not contains word java 
// keep asking user to enter 

Scanner scan = new Scanner(System.in); 

String theSentence = "" ; 

while( theSentence.contains("java")== false    ) {
  
  System.out.println("Enter the sentence");
  theSentence = scan.nextLine(); 
  
}

//while(! theSentence.toUpperCase().contains("JAVA")) {
while(! theSentence.toLowerCase().contains("java")) {
    System.out.println("Enter the sentence");
  theSentence = scan.nextLine();       
}


System.out.println(" END ");
*/

//while loop ile email i print ettirme:
		String email = "mike_tyson@gmail.com";
		int index = 0;
		while(index<email.length()){
			System.out.print(email.charAt(index++));
		}
		//email i tersten yazdirma while loop ile:
		System.out.println();
		while(index>0){
			System.out.print(email.charAt(--index));
		}
		
		
		System.out.println();
		index = 0;
		while(index<email.length()-1){
			System.out.print(email.charAt(++index));
		}
//////////		
		System.out.println();
////////    
		/// Give Me 5:

		//Scanner scan =new Scanner(System.in);
		
		int xs= 0;
		while(xs!=5) {//loop will keep looping until ur condition become false..!!!
			          ///tam 5 girilene kadar keeps looping..5 gorunce durur.cunku 5 degil 
			System.out.println("Give me 5 ");
			xs= scan.nextInt();

			
	///
	System.out.println();
	///
	//      GIVE ME 5$ / 10$ BILL:
	
	while(!(a==5 || a ==10)) {
		System.out.println("Give me 5, or 10");
		
		a = scan.nextInt();
		
		
	}
	System.out.println("good job,,get ur money");
	}
System.out.println();
////   
////     Give me Sum:

//Sayi girilip, hepsinin toplamini hesaplatma: whileda ust limiti yazacaksin
		//Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int counts=1;
		
		while(counts<20) {
			
			sum= sum+counts;
			System.out.println("current sum is: " + sum + "and"+ "count is: " +counts);
			//System.out.println(count);
			counts++;
		}
		System.out.println("total sum is: "+sum);
		
		/////////////// ne isim girersen, onu - ile print etme while loop ile:
		
		 String myname = scan.nextLine() ;
		    
		    int a11 = 0 ; 
		    while(a11< myname.length() ) {
		      
		      System.out.print (  myname.charAt(a11)  + "-");
		      ++a11 ;   //x++ ; ////cursor harfi arttirir, okumayi saglar legth kadar
		    }
		    /// yukardaki while in for loop hali:
		    String mynmae = "Zelish";
		for (int i = 0; i< mynmae.length(); i++) {
			System.out.println(mynmae);
		}
		    
		    
/////////////////////////////////////////////////////////
	
////////////////	 DO WHILE LOOP 
	
	/*
	
	do {                     Curly brace ici loop body.. en az bir kere run eder
		Sout(statements);
	}while (condition);      !!!! burda semi colon var fark!!
	 
	 
	 
	 *** While da yanlissa hic run etmez.. 
	 *** Do while da en az bir kere execute eder, yanlissa durur, dogruysa devam eder
	 *   semi colon while da 
	 */
	 
	 
	 int appless = 1;
	 
	 do {
		System.out.println("Eating apples"); 
		appless++;
	 }while (appless<= 5);    //bu conditionn ici loop body deki variable i okumaz..mesela total apples olsa loop body de, burasi curly brace disinda kaldigi icin okumaz
	                          //okumasi icin yukari koyman lazim
	 
	System.out.println("No more apples again");
	 
	 /////
	 
	 ////// do while ile isim isteme , dogru bulana kadar loop et:
	
	String names="";
	//Scanner scan=new Scanner(System.in);
	do {
		
		System.out.println(names);
		System.out.println("Enter second");
		names=scan.next();
	}while(! (names.equals("Zeliha")));
	
	System.out.println("the end");
	 
	/////
	
	//print 1 to 10 using do while loop		
	int i = 1;

	do{
		System.out.println(i);
		i++;
	}while(i <= 10);
	System.out.println();
	
	//////////
	
	/// 20 den asagi sayolari yazdirma:
	
	 System.out.println();
	    int l = 20;
	    do {
	    	System.out.print(l + " ");
	    	l--;
	    	
	    }while(l>=0);
	    
	    System.out.println();
	 
	  //in this example, do while loop body code will run once,
		// then test the condition. then exit the loop, 
		//as condition is false
		int countr = 10;
		do {
			System.out.println("Count: " + countr);
			countr++;
		} while(countr <= 5);

	 /////
		

		//Scanner scan = new Scanner(System.in);
		String password = "abc123";
		String input;

		do {
			System.out.println("Enter first password");
			input = scan.next();
		}while(!input.equals(password));
		//if input is not same as password, keep asking to enter

	/////    // how to check whether string start with a-z:
		 
		//Scanner scan = new Scanner(System.in);

	    String str = scan.next();
	    // how to check whether string start with a-z
	    char firstCharr = str.charAt(0);

		   if (firstCharr >= 'a' && firstCharr <= 'z') {
		         //str.charAt(0)        //str.charAt(0)
			      System.out.println(" lower case letter");

			    } else {

			      System.out.println("NOT a-z");
			    }
		   
		   
		   
		   System.out.println();
		   //////////
		   
		   String name1= "Zeliha Kemal Cemal Melih";
			
			int i1=0;
			do {
				char y =name1.charAt(i1);
				System.out.print(y);
				i1++;
				
			}while(i1<name1.length());
			
			///////
			
			String str1= "Zeliha";
			
			int x1=0;
			do {
				char c = str1.charAt(x1);
				System.out.print(c);
				x1++;
				
			}while(x1<str1.length());
			
			/////// string print ettirme, isim print ettirme, cumle print ettirme:
			String sss= "Sevgi seli";
			int ss= 0;
			do {
				char c = sss.charAt(ss);
				System.out.println(c); //buraya int ss degeri yani ss yazilirsa asccii sayi verir.
				ss++;                               //int degil char yazilmali print yere ki letters yazsin  
			}while(ss<sss.length());
			
			///
			
			
////////////////////////////////////////////////////////////////////////		
	 
		   
		   
/////////////////       FOR LOOP 
	 
	/*
	 
	 for (initialization; condition; update){   ///ortadaki condition true old. surece statements keeps looping again and again.
	 
	     Sout(statements);
	 }        //"Hello World!"
	 
	 once bir degeri initialize etmek zorundaki , sonra bir condition true olmak zorundaki hello world yazsin, ve artarak veya azalarak gidecegi belirleniyor.
	 it will run one at the beginning and check in every iteration
	 
	 */
	 
	 for (int n = 1; n<=5; n++) { // n 1 ile basla, ve 1 er artarak, condition false olana kadar repeat et ..
		                   //n+=2 --> 2 ser artar
		                   // n+=5 --> 5 er artar
	                       //n -=2 ---> 2 ser azalir..a. gibi gibi..
	System.out.println("Hello Cybertek");    // 5 kere yazar n<= 5 old icin
	System.out.println(n);                   // 1 den 5 e sayi print eder
	 }
	 
	 //////// print 5 start for loop ile:
	 
	 for ( int st = 1; st<= 5; st++) {  //int icerde veya disarda declare edebilirsin.
		 
		 System.out.println("*"); /// 5 yildiz print eder yanyana
		 System.out.println(st);  /// bunda da 1 den 5 e sayi print eder
		
	 }
	 
	 
     /////   10 dan 0 a print etme: ... i =10, i>=0.. i--
	 
	 
	 for (int i11 = 10; i11>= 0; i11--) {
		 System.out.println(i11+ ",");  /// 10 dan 0 a print eder yanyana
		 	 
	 }
	 
	 ////   0 dan 50 ye odd numbers print etme:
	 
	 for (int i21 = 0; i21 < 50; i21++ ) {   //burda curly brace olmazsa, sout u body ye dahil gibi okur, ayni sonuc olur ama curly braces leri kullan
		 if(i21%2 != 0) {            // tek sayi, 2 ile tam bolunemeyenler
			 System.out.println(i1);
		 }
	 }
	 
	 
	////   array li for loop :
	 
	 String [] fruits = new String [3];
	 fruits [0] = "apples";
	 fruits [1] = "pears";
	 fruits [2] = "oranges";     
	                   // bu containerlardaki fruits leri tek tek yazdirabiliriz for loop ile:
	 
	 for (int f = 0; f< 3; f++) {
		 System.out.println(fruits [i1]); /// appleas, pears, oranges print etti
	 
	                                   // fruits [i] -->> tum array container larin icinde ne var onu print etti.
	 
	 
	 
	 //////
		 
	//yani for loop string print eder, hac tane istersen hello world gibi
	// veya int number print eder, hangi sayilar arasi ve ne update ile ve condition ile istersen
	// veya char lari pprint eder string icindeki, onu da int ile okutarak, charAt(i) ye baglayarak yazdirirsin
	// veya array container larin icindeki elementleri okur, sayilari adedince okuyabilir, kategori okuyabilir, hepsini print ettirebilir.	 
	 
	/////    happy birthday print ettirme	 
		
		 for (int i11 =0; i11<5; i11++) {
				System.out.println("Okan Happy birthday");
			}
			
			
			//count from 1 to 10;
		 
			for (int a111 = 1; a111<=10; a111 ++) {
				System.out.print(a111 + " ");
				
			}
			
			System.out.println();
			
			//count form 10 to 1
			
			for (int b1 = 10; b1>=0; b1 --) {
				System.out.print(b1 + " ");
			}
			
			// while loop ile ayni sey
			int x11 = 5;
			while(x11>0) {
				System.out.println(x11 + " ");
				x11--;
			}	 
	 
	 /////
	
			//using for loop: 1-100 ...
			//1.print all even numbers in same line  ..if statement
			for(int n = 1; n <= 100; n++) {
				if(n % 2 == 0) { //check if it is even
					System.out.print(n+" ");
			
	/////
		System.out.println();
			//2.print all odd numbers in same line
					for(int j = 1; j <= 100; j++) {
						if(j % 2 != 0) {
							System.out.print(j +" ");
						}
						
						
					}
	 ///////
				
						//3.sumOfOdds, sumOfEvens -  calculate them
						// and print out after the loop
						//sum of 1 - 10
						//1+2+3+4+5+6+7+8+9+10

						System.out.println();

						int sumOfOdds = 0;
						int sumOfEvens = 0;

						for(int num = 1; num <= 100; num++) {
							if(num % 2 == 0) {
								sumOfEvens += num;
							}else {
								sumOfOdds += num;
							}
						}
						System.out.println("Sum of evens:" + sumOfEvens);
						System.out.println("Sum of odds:" + sumOfOdds);
	
	/////////////
						

						//for loop to print multiplication table:
						for(int i = 1; i <= 10; ++i) {
							int result = num * i;
							System.out.println(num +" x "+i+" = "+result);
						}
						
	/////////////    //if character and next one are same print beep:
						
						//Scanner scan = new Scanner(System.in);
						System.out.println("Enter word");
						String word1 = scan.next();
						//aabcdd 
						//if character and next one are same print
						//Beeep - a
						//Beeep - d
									//aabcdd -i < 5
						for(int i = 0; i < word1.length()-1; i++) {
							if(word1.charAt(i) == word1.charAt(i + 1)) {
								System.out.println("Beeep - " + word1.charAt(i));
							}
						} 
		//////////
						String word = "CybertekSchool";
						
		        	//using for loop, print each char one by one
						
						for(int i = 0; i < word.length(); i++) {
							System.out.println(word.charAt(i));
						}


			     	//using for loop, print only vowel (a,e,o,i,u)
						
						for(int i = 0; i < word.length(); i++) {
							char letter = word.toLowerCase().charAt(i);
							if(letter == 'a' || letter == 'e' || letter == 'o' ||
							   letter == 'i' || letter == 'u'	) {
								System.out.print(letter + ", ");
							}
						}
						System.out.println();
						
					//using for loop, print only consonants
						
						for(int i = 0; i < word.length(); i++) {
							char letter = word.toLowerCase().charAt(i);
							if( !(letter == 'a' || letter == 'e' || letter == 'o' ||
							   letter == 'i' || letter == 'u') ) {
							   System.out.print(letter + ", ");
							}
						}
						
//////////////   Numbers days   capital lowercase SEPERATOR:
						
						// java day 20 is awesome
						
						// java20awesome---->> javaawesome    20  
					    
					    String mix = "Aonline132x";
					    
					    char c = mix.charAt(0); 
					    
					    // check whether c is between 0 - 9 
					    //if( c>= 32 && c<= 41 ) {
					      
					    if( c>= '0' && c<= '9' ) {
					      System.out.println("NUMBER!!");
					    }else {
					      System.out.println("NOT NUMBER!!");
					    }
					    
					    if( c>= 'A' && c<= 'Z' ) {
					      System.out.println("UPPERCASE!!");
					    }else {
					      System.out.println("NOT UPPERCASE!!");
					    }
					    
					    
  ///     SEPERATOR using WHILE  LOOP:
					 // java20awesome---->> javaawesome    20  
					    
					    String mix = "Aonline132x";
					    String numberStr = "";  
					    
					    int i = 0 ; 
					    
					    while(i< mix.length()) {
					      
					      char c = mix.charAt(i); 
					      
					      if( c>= '0' && c<= '9' ) {
					        //System.out.println(c);
					        numberStr = numberStr + c ; 
					      }
					      
					      i++ ; 
					    }
						
///      SPERATOR Using DO WHILE LOOP:
					    
					    int y = 0 ; 
					    do {
					      
					      char c = mix.charAt(y);
					      
					      
					      if(c  >= 'a' && c  <= 'z') {
					        System.out.println(c);
					        
					      }
					      y++; 
					      
					    } while (y< mix.length());
					    
					    
					    System.out.println(  numberStr );
					    
					    
					
///// LOOP control Statement:							
									
							
							System.out.println("GOT THE MILK?" + 1);
							continue;//continue burda olsa ne yapar??
				//at the end old icin bisey olmaz..zaten skip yapip basa donecegi
				//icin. for da check edip line i, next iteration a gidiyor zaten.
				//aslinda continue useless ..cunku zaten next iteration a gidiyr.
							
				  //  ------->>>>>   System.out.println("END");//bunu buraya koysak nolur?
							               //unreachable code, burda no if statement or nothing
							              //o yuzdenline 15 hic execute olmaz.
							             //dead code da denir. It will be caught by compiler!	
						}	
						for (int i = 1; i<=10;i++) {
							if(i==5) {
								continue;		
							}
							break;//line 28 de dead code, unreachable code, 
							//cunku break te biter execution.zaten error verir ..
				//  ---->>>		System.out.println("Got the milk?"+i);	 //ayni unreachable code
							                                            //diye uyari verir.				    
					    
//////////	
							
							// TASK 2.1 
						    /*
						     * USING FOR LOOP
						     * from 1 to 50
						     * 1, print out all the odd numbers
						     * TASK 2.2
						     * 2, count all the number divisible by 4.
						     * TASK 2.3
						     * OPTIONALLY : 
						     * 3, skip all numbers divisible by 3 and 5
						     *    at the same time 
						     * 4, get the sum of above numbers 
						     */
						    // TASK 2.3 ve 2.4
						    int sum = 0 ; 
						    for (int i = 1; i < 50; i++) {
						      
						      if(i%5==0 && i%3==0) {
						        continue; // skip to next iteration if true
						      }
						      // if this line is reached 
						      // it means these are the numbers we wanted
						      System.out.print(i + " ");
						      sum = sum + i ; // accumulating the sum in each iteration
						    }
						    System.out.println();
						    System.out.println(sum);	
						    
			////////
						    
						    
						    
						    
			//////////
						    
						    
						    /* WARM UP..with Do While Loop.common interview quest.
							ASK USER TWO NUMBER
							KEEP ASKING UNTIL THE SUM OF
							TWO NUMBERS ARE MORE THAN 100
							PRINT THE END AFTER THE LOOP
							*/
							//OPTIONAL : 3 ATTEMPS ONLY
							//bu ozellikle do while loopla yapilir!! cunku u need to try 
							//once..u let user try at least once, then check the condition, 
							//and do more times if needed.
							
							
							
						   
							
						    	
						    int num1=0;
						    int num2 = 0;
						    int attempts=0;
						    do {
						    	
							Scanner scanet= new Scanner(System.in) ;
							System.out.println("enter two numbers");
							num1=scanet.nextInt();
							num2=scanet.nextInt();
							  attempts++; //kac attempt yaptigini basa koy ki hesaplayabilsin, sonra if condition
							   if (attempts==3) {
								   System.out.println("you lost your chance");
								   break;
							   }
							 
						    }while( num1+num2<=100);
						    System.out.println("the end");
						    
						    
						    
						    
			/////////
						 //ismini duz yazdirma
						/// sonra   ters yazdirma char by char
						    String name = "Dilnur";
						    String myname="zeliha";
						     for (int z=0; z<myname.length();z++) {
						    	System.out.print(myname.charAt(z)); 
						     }
						     System.out.println(); 
						    for (int z= myname.length()-1; z>=0; z--)	
						    	System.out.print(myname.charAt(z));
						    System.out.println();
						     
			////////////
						    
						  //iki numaranin toplami more than 100 olana kadar num gir
							public static void main(String[] args) {
								//**Sum almayi iyi ogren, hep var
								Scanner scan = new Scanner(System.in);	
								int sum = 0;
								//int sumOfSums=o;	
								do {
									System.out.println("Enter 2 numbers");	
								int num1 = scan.nextInt();
								int num2 = scan.nextInt();
								sum= num1+num2;
								//sumsOfSums+=sum;
									
								}while(sum<=100);
								
								System.out.println("Good Numbers");	
							}
	 ///////////   get  Unique Char:
							
							 String unique="";
								
						        for (int i=0; i<word.length(); i++) {
						        	//read the letter and assign
						        	char letter=word.charAt(i); //cursor gibi harfi takip ettirecek bu
						        	//System.out.print(letter);
						        	if (unique.contains(""+ letter)){
						        		unique += letter; //add to unique
						        	}
						        	
						        	
						        	
////////////      Convert Char to String:
						        	
						        	//interw q:
						        	//following ways can be used to convert char to String:	

						        		char ch = 'a';
						        		String str1= ""+ch; // char a donusturmek icin cift tirnak isareti koyariz
						        		System.out.println(str1); //a printed
						        			
						        		
						        		char ch2='v';
						        		//String str2= new String(ch2);
						        		String str2=new String(""+ch2);
						        		String str3=Character.toString(ch2);
						        		
						        		System.out.println(str2);//v printed
						        		System.out.println(str3);//v printed
//////////////
						        		
						        		
			///  Count	how many cats in string:
						        		
						        		String str = "mycatyourcat";
						        		//count how many "cat" s
						        		int cats = 0;
						        		for(int i = 0; i <= str.length()-3; i++) {
						        			System.out.println(str.substring(i, i+3));
						        			if(str.substring(i, i+3).equals("cat") ) {
						        				cats++;
						        			}
						        		}

						        		System.out.println("Cats: " + cats);	
						        		
	/////////////       Find How many using replace:
						        		
						        		String word = "ineceluding webpages, images";
						        		//find how many e characters in the word.
						        		//get the length of word
						        		//replace all e with empty
						        		//get the length of word without e
						        		//do a minus

						        		int length1 = word.length();
						        		word = word.replace("e", "");
						        		int length2 = word.length();

						        		System.out.println("Length1: " + length1);
						        		System.out.println("Length2: " + length2);

						        		int count = length1 - length2;
						        		System.out.println("Count of e: " + count);
						        	
						        		
						        		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						        		
						        		
/////////////                  FOR EACH LOOP         /   ENHANCED FOR LOOP						        		
						        		
		///   BUNUN DIGER LOOP LARDAN FARKI: there is no infinite loop condition.
						        		
			
			/*
						        		
			
			For each person in contact {
			
			Send happy new year message   /// just do some action in collection
			
			}                               // no increment, decrement, no initialization
							
			
							
			Syntax:
			
							for (dataType item; collection){
							
							Sout(do some action)
							
							}
******* For each loop (enhanced for loop) specifically designed for iterating over arrays 	and collection objects			
 ****		in order to have for each loop, you need to have collection of some type!!!					
***       it simply prints out the items in arrays mostly   ***
*
*			
			
			
			
			*/                             //Unlike for loop:
						        		   //There is no initialization
						        		   // No termination condition
						        		//No increment/decrement
						        		// Right hand side is array or collection
						        		//Left hand side is matching type
				
		int [] intArray = {1,2,4,5,7};          
		for ( int item : intArray) {
		 //matchingType  // ArrayOrCollection
		}
			System.out.println("Numbers in each array is: " + item); //numaralari direk print eder 
		System.out.print(item + ", "); // yanyana virgulle ayrilmis print eder sayilari
						        }
		
	///only loop construct with no 	infinite loop situation ---> for each loop
						        
		
		String [] arr = { "Zelis" , "Canim" , " Gulum", "Kizim"};
		for (String item : arr) {
			System.out.print(item+ ","); // Zelis, Canim, Gulum, Kizim print eder
		}
//////////////  break;    statement koymazsan it will go through alllll the items.
		
		
	int [] ints = { 1,33, 44,2,1,5,7,8};
	
	for ( int item : ints) {
		
		System.out.println("items: " + item);  // it will print out all the items in my array collection 
	}

//////////   for each loop ile array collection daki even nbs print etme:
	
	int [] nums = { 1,2,4,3,5,67,456,8,9,10};
	
	for ( int item: nums) {
		if (item %2 ==0)     // even numbers condition , tek satir old icin curly brace gerekmez
			System.out.println( " even numbers:  "+ item);  /// sdace even numberlari print etti
		
	}
		
///////  String example for each loop, array li tabi:
	
	String [] arr2 = {"cat", "dog", "birds","chivava"};
	
	for ( String animal : arr2) {   /// condition koyalim: if I see a "ll break out from the loop:
		
		if (animal.contains("a")) {
			System.out.println("Found a, getting out form the loop");
			break;
		}
	
		          
	}
	
////////////////   Loops Summary // break, continue statement:
	
	/*
	 
	 if (a condition met) {
	 Sout(do some acton)
	 }
	 
	 
	 if (There is a friend in contact){  //checks once , sends once
	 Sout(send "happy new year")          //if you need to send many massages, use loops
	 }
	 
	 --> while loop:
	 while  (a condition met){
	      do some action
	      keep doing it
	 }
	      while (there is next friend in the list){
	      send ("happy new year")
	      }
	 
	 ---> do while loop:
	 
	 do{
	 do some action       //does at least once
	 keep doing it
	 }while (a condition is met)
	 
	       do {
	       send ("happy new year")
	       }while (not all friends got message)
	 
	 
	 -----> for loop:
	 repeat 5 times{
	 
	 send happy new year massage
	 }
	 
initialization/termination/increment
	 for (int = 0; i<5; i++){        //prints 5 times happy new year
	 Sout("happy new year");          //her iteration da check eder
	                                   //false olunca loop tan cikar
	 }
	 
	 /////
	  
**	 for (int i=0; i<10; i+=2){ //even numbers print olur
*                                //2 ser artacak
	 Sout("Even numbers" +i);    
	 }  yada even numbers;
	 
**	 for (int i=0; i<10;i++){
	 if (i%2==0)                   2 yle bolunebilir condition
	 Sout("Even numbers" + i);
	 
	 }
	 
	////////////  loop control statement, break & continue
	 * we control the lo0p flow with break and continue
	 * 
	 *  break ; break out of the loop (with some condition)
	 *  
	 *  continue; skip current iteration
	 
	 ex:
	 
	0-10 arasi print, 5 e gelince cikmak istiyorum:
	
	for (int i=0; i<10;i++){   
	if(i==5){                 5 te duracak, loop bitecek, cikacak bu looptan
	break;                      (1 den 4 e print edecek)
	                             5 e gelince bitecek
	}
	Sout(Numbers"+1);        (1 2 3 4 print olur sadece)
	}
	 
	 
	 
	 ---> continue whenever ...I wanna skip this iteration and go to next:
	 
	 for (int i=0; i<10; i++){
	 
	 if(i%2!=0){   //if its not even number, I wanna go to next iteration
	                //I skip the odd numbers
	 continue;
	 }
	 Sout("Even numbers" + i);
	 }
	 
	 
	 
	 */ 
	

	
	
	//////////////////    Nested Loop  ;
	
	/*  excel sheet dusun hemen 
	      columns  0    1    2          iterate all the row{
	 rows                               and in each row iteration, iterate over each column
	                                                  read the value of cell.
	    
	 0            12    5    4
	 
	 1            23    13   32
	 
	
	 
	 *****    a nested for loop:
	 
	 for (int r = 0; r< 2; r++){
	     for (int k =0; k<3; k++0){
	     
	     Sout("Row" + r + "column" + k +"|");
	     }
	     Sout();
	     }
	     
	 //print kullan ,, println degil:
	   
|Row0-column0||Row0-column1||Row0-column2|
|Row1-column0||Row1-column1||Row1-column2|


//Bunlar bos cell ler...
   Zaten for each loop daha cok arrayleri collect etmek icin desgin edilmis 
   for loop bos cell ler
   for each loop ta array leri print ediyorsun, gercek sayilari:
   
   ***    NESTED FOR EACH LOOP:  (array gerekli):
   
   int [] rows = {1,2,3,4};
   int[] cols = {1,2,3};
   
   for (int row : rows){
   
     for (int col: cols){
     
     Sou(" |Row" = row + "=Col" +col);
     }
     Sout();
     }
   
   Console printed:
   |Row1-Col1
   |Row1-Col2
   |Row1-Col3

   |Row2-Col1
   |Row2-Col2
   |Row2-Col3

   |Row3-Col1
   |Row3-Col2
   |Row3-Col3

   |Row4-Col1
   |Row4-Col2
   |Row4-Col3
   
   
   
   
   //// NESTED WHILE LOOP:
    
   int i = 0;
   while (i<5){
   i++;
      int j=0;
      while (j<3);
      j++;
     Sout(" |Row" + i + "-Column" + j);
     }
     Sout();
     }
    
	 
	 
	 //// NESTED DO WHILE LOOP:
	  
	  int i1=0;
	  
	  do {
	  i1++;
	    int j=0;
	    do{
	    j++;
	    Sout("Row" + i1+ "column" +j);
	    } while (j,3);
	   Sout();
	  }while(i1<5); 
	  
	  
	  ///Nested for loop and While loop:
	
	for (int j = 0; j<4; j++) {
		
		int k = 0;
		while(k<3){
		Sout("rown" + j+"col"+k);  print kullan yanyana cikar
		k++;
		}
		Sout();
	}
	  
	 */
	
	
	
	
	
	
				}}}}}	 
	 

