package day20WHileDoWhileForLoops;

public class GettingCharsOneByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //tum chararcter leri bir bir print ettirme: v
		//ve ters cevirme..tum string i ters yazdirma:
	    System.out.println();
	    
	    String name = "Muhammad Hayrulla Cisem" ; 
	    
	    int count = name.length(); 
	    
	    for (int i = 0; i <count ; i++) {
	      System.out.print( name.charAt(i) + " "  );
	    }
	    
	    System.out.println();
	    
	    for (int i = count-1 ; i>=0 ; i-- ) {
	      System.out.print(name.charAt(i) + " ");
	    }
	    
	    System.out.println();
	    
	    String str="Kemal Zeliha Cemal Melih";
	    
	    int counter=str.length();
	    for(int a=0;a<counter;a++) {
	    	System.out.print(str.charAt(a)+" ");
	    
	    	
	    }
	    System.out.println();
	    
		 for(int a=counter-1; a>=0;a--) {
			 System.out.print(str.charAt(a) +" ");
		}
		 System.out.println();
		 
		 String names= "Murvet Melda Mustafa";
		 int countt=names.length();
		 
		
		 for(int m=0; m<countt;m++) {
			 System.out.print(names.charAt(m)+" ");
			 
		 }
		 System.out.println();
		  for(int m=countt-1;m>=0;m--) {
			  System.out.print(names.charAt(m)+" ");
		  }
		  
		  System.out.println();
		  String nam="Canim Ailem";
		  int coun= nam.length();
		  for(int l = 0; l<coun;l++) {
			  System.out.print(nam.charAt(l)+ " ");
		  }
		  
		  System.out.println();
          for (int l= nam.length()-1;l>=0; l--) {
        	  System.out.print(nam.charAt(l) + " ");
          }
	}

	

}
