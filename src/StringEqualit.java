import java.util.Scanner;
public class StringEqualit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "Lachyn";
		
		//boolean b= (name=="Lachyn"); bu == seklin String de side effecti var
		//we use a method from String class called equals
		
		//boolean b = name.equals("Lachyn");
		
		
		
		//System.out.println(b);
		
		
		//TAsk 2
		//create a nem variable to store ur name and creat a scanner to ask for a name 
		//compare the name with what u entered
		//print out thtas my name it its equal
		//print out thats not my name if its not
	
		
		
		/*My asnwer:
			String nameMy ="Zeliha";
		Scanner scan=new Scanner (System.in);
			boolean z = nameMy.equals("Zeliha");	
		if (nameMy.equals) {
			System.out.println(" thtas my name it its equal");
		}else {
			System.out.println("thats not my name if its not");
			*/
		
		
		
			/* Esras
			 * Scanner keyboard = new Scanner(System.in);
    String myName= "Esra";
    System.out.println("Enter a name:");
    String name=keyboard.next();
    if(myName.equals(name)) System.out.println("yes thats my name");
    else System.out.println("not my name");*/

			 /*/Akbar
			  Scanner scan = new Scanner(System.in);
				System.out.println("enter ur name");
				String myName =scan.next();
				boolean nameEqualToExpected =name.contentEquals("Zeliha");
				System.out.println(nameEqualToExpected);
				
				//if name equaltoecxpected
				if(name.equals("Zeliha"){		
				System.out.println("that'me");
	}else {
		System.out.println("not him");*/
		
		 Scanner scan = new Scanner(System.in); 
		    System.out.println("Enter your name please : ");
		    
		    String newname = scan.next(); 
		    String expectednewname = "Tahir" ; 
		    
		    //boolean b =  (name == "Lachyn"); 
		    // we use method from String class called equals 
		    
		    //boolean nameEqualToExpected = name.equals("Tahir"); 
		    boolean newnameEqualToExpected = newname.equals( expectednewname ); 
		    
		    
		    
		    if(newnameEqualToExpected){
		    //if( name.equals("Tahir") ){
		      System.out.println("That's Tahir");
		    }else{
		      System.out.println("NOT HIM !!");
		    }
		    
		    // TASK 2 
		    // Create a name variable to store your name 
		    // CREATE A SCANNER TO ASK FOR A NAME 
		    // compare the name with what you entered 
		    // print out thats my name if it's equal 
		    // print out thats not my name if its not 
		    
				

			
			
			
		}
	}


