package day40;

import java.util.ArrayList;

public class ComputerFactory {

	
	
public static void main(String[] args) {
		
		Computer iMac = new Computer();
		Computer macPro = new Computer();
		
		System.out.println("-----IMAC------");
		
		iMac.type= "Mac desktop";  // how we chnage the dfeault value
		iMac.OS = "MacOs";
		iMac.screenSize = 27.0;
	    iMac.color= "silver";
	    iMac.isPersonal = true;
	    iMac.ram = 128 ; 
	     
		
		
		System.out.println(iMac.type); // null cikar cunku we didn't define yet
		System.out.println(macPro.type);  //simdi ikisinde de unknown cikti
	    System.out.println(iMac.screenSize);
		System.out.println(iMac.color);
		System.out.println(iMac.isPersonal);
		
	    System.out.println("------------MACPRO");
	    
	    
	    
		
		System.out.println(macPro.type);
		System.out.println(macPro.OS);
		System.out.println(macPro.screenSize);
		System.out.println(macPro.color);
		System.out.println(macPro.isPersonal);
		
}
}
