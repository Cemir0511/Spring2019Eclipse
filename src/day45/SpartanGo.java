package day45;

public class SpartanGo {

	public static void main(String[] args) {
		
		
		Spartan s1 = new Spartan();
		System.out.println(s1);      //when we print it gives nice output, 
		                             //cunku class da toString define ettik..o da burda default olarak calisti

		
		String[] certs= {"OCA", "PSM", "AWS", "OCP"};
		Spartan s2 = new Spartan("Coder", 8, 600, false, certs);
		Spartan s3 = new Spartan("Coder1", 18, 700, false, new String [] {"OCA"});
		Spartan s4 = new Spartan("Coder2", 28, 200, false, new String [] {});
		Spartan s5 = new Spartan("Coder3", 8, 100, true, null); // no certs compile etmez, cuncku array degil string , array olmaliydi, yada string array
		
		                                                         // o yuzden null koyduk, null is pointing to nothing
		
		
		// we are printing object directly
		System.out.println(s2);
		
		// compiler automatically do this 
		System.out.println(s2.toString());
		
		
		
	}

}
