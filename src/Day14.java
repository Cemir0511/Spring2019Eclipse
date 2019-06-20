import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {
		
		  
		    double price = 0;
				String storageType, screenType, cpu;
				int ram = 0 ;
				Scanner scan = new Scanner(System.in);
		    //WRITE YOUR CODE HERE
		    System.out.println("Select screen size:");
		    double size = scan.nextDouble();
		    if (size == 13.3){
		         price +=200;
		     } else if ( size == 15.0){
		       price+=300;
		     }else if (size == 17.3){
		        price +=400;
		     }
		     
		     System.out.println("Select CPU type:");
		     cpu = scan.next();
		     if (cpu== "i3"){
		       price+=150;
		     }else if(cpu=="i5"){
		      price=+250;
		     }else if( cpu=="i7"){
		       price += 350;
		     }
		    
		     System.out.println("Select RAM size:");
		     ram =scan.nextInt();
		     price= price+((ram/4)*50);
		      scan.nextLine();
		     
		
		     System.out.println("Select storage type:");
		     storageType=scan.next();
		     int countOfGigaByte = 0;
		     if(storageType== "HDD"){
		         price+=50 * countOfGigaByte;
		       }else if(storageType=="SSD"){
		         price+=100 * countOfGigaByte;
		       }
		        System.out.println("Enter memory size:");
		        System.out.println(ram* countOfGigaByte );
		    
		      
		       System.out.println("Enter screen resolution:");
		       String resolution=scan.nextLine();
		       
		       switch (resolution) {
		        case "FULLHD" :
		            price=price+100;
		            break;
		        case "4K" :
		            price=price+200;
		            break;
		        default:
		        }
		        
		        System.out.println("Laptop price is:"+"$"+ price);
		        
		        
		       }
		     }
		     
		     
		     
		     
		     
		     
		     
		    
		     
		    
		   
		     
		     
		     
		    
		
		
		
	


