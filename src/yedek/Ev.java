package yedek;

public class Ev {

	String name ;
	String address ;
	String color ;
	int year;
	double sqfeet;
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ev e1 = new Ev();
		
		e1.address = "8627 limpkin";
		e1.color="white";
		e1.name="satih";
		e1.sqfeet = 200.78;
		e1.year=2010;
		
		
		
		Ev e2 = new Ev();
		e2.address= "ooo";
		e2.color="mavi";
		e2.name= "lili";
		e2.sqfeet=23.90;
		e2.year=2011;
		
		System.out.println(e2.address + "\n" + e1.address);
		
	}

}
