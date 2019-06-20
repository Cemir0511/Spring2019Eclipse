package yedek;

public class BookLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book ();
		b1.name = "john";
		b1.author = "Leyla";
		b1.pages = 100;
		b1.title = "love";
		
		
		Book b2 = new Book ();
        b2.name = "pec";
        b2.author = "leya";
        b2.pages = 100;
        b2.title = "lila";
        
        
        Book b3 = new Book();
        b3.author = "Haci";
        b3.name = "abi";
        b3.pages = 100;
        b3.title = "lolo";
        
        System.out.println(b3.author+ b2.author+b1.author);
		
	}

}
