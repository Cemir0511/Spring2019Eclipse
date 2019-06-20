package day8;

public class LogicalOperatorPractice {

	public static void main(String[] args) {
		
		
		int score = 10 ; 
		boolean result1 = score > 4 ; 
		boolean result2 = score > 4 && score <11; 
		
		boolean result3 = score > 14 && score <11;  //10>14 FALSE AND STOP
		boolean result4 = score > 14 || score <11;  //10>14 FALSE OR 10<11 TRUE 
		
		//boolean result5 = score > 9 || score <1;  // 10>9 True  
		
		
		//boolean result5 = score++ >10  && score <12;  //10>10 FALSE
		//boolean result5 = ++score >10  && score <12;  // 11>10 TRUE AND 11<12 TRUE  ---  TRUE
		//boolean result5 = score++ >10 || score <12;  // 10>10 FALSE OR 11<12 TRUE   ---- TRUE 
		
		//boolean result5 = score++ >10 && ++score <13;  // 10>10 false so it will not evaluate next one
		
		
		
		//boolean result5 = score++ >10 & ++score <13;  // 10>10 & 12<13 
		
		//boolean result5 = score >10 | ++score <13;  //10>10 false OR 11<13 true 
		
		boolean result6 = !true && true;
		
		boolean result7 = (score > 5) && (6 > 5) ;  // TRUE TRUE --- TRUE  
		boolean result8 = (score > 5) && !(6 > 5) ;  // TRUE FALSE --- FALSE 
		
		boolean result9 = (score > 5) && (score > 11) && (score/2 == 5) ;  // TRUE FALSE
		boolean result10 = (score > 5) && (score <= 11) && (score/2 == 5) ;  // TRUE TRUE TRUE

		
		/// TRUE && TRUE && FALSE -----> FALSE 
		/// FALSE || FALSE || TRUE ----> TRUE
		
		System.out.println(  true && false || true   ); 
		System.out.println(   true || false && true   ); 
		
		// precedence 
							  //FALSE  OR ( TRUE AND  TRUE ) 
		System.out.println(   score>10 || (score==10 && score >5)     );
		
		
		//System.out.println("result is " + result10    );
		
		//System.out.println( "the value of score right now : " + score );
		
		
//		System.out.println("result is " + result1    );
//		System.out.println("result is " + result2    );
//		System.out.println("result is " + result3    );
//		System.out.println("result is " + result4    );
//		System.out.println("result is " + result5    );

	}

}
