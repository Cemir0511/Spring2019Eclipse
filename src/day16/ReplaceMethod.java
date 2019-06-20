package day16;

public class ReplaceMethod {

	public static void main(String[] args) {
		
String str = "Date is 03_25_2019" ;
        
        str = str.replace('_','-') ; //birinci degisip ikinci olacak
        
        System.out.println(  str   ); 
        
        //Date is 03-25-2019  --> Date will be 03-25-2019
        
        str = str.replace("is","will be" ) ; //is gidecek will be olacak
        System.out.println(  str );
        
        // Date will be 03-25-2019  --->>>03-25-2019
        System.out.println(  str.replace("Date will be ", "")    );
        
        
        
        String str2 = "AAAAABBBBBBCCCCCCC" ; 
        System.out.println(     str2.replace('A', 'Z')      );
        
        //AKBARS NOTES:
String strs = "Date is 03_25_2019" ;
		
		strs = strs.replace('_','-') ; 
		
		System.out.println(  strs   ); 
		
		//Date is 03-25-2019  --> Date will be 03-25-2019
		
		str = str.replace("is","will be" ) ; 
		System.out.println(  str );
		
		// Date will be 03-25-2019  --->>>03-25-2019
		System.out.println(  str.replace("Date will be ", "")    );
		
		
		
		String str3 = "AAAAABBBBBBCCCCCCC" ; 
		System.out.println(     str3.replace('A', 'Z')      );
		
        
        
        
        
   	
		
		
		
	}

}
