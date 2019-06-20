package day39;

public class RunnerClass {

	public static void main(String[] args) {
		
		
		//local variable
		String s = "abc";

		
		// creating new Person Object
		Person p1 = new Person();// we created new object from Person class.
		
	
		
		// setting attributes value of object
		p1.name = "Talmurat";
		p1.age = 1;
		p1.gender = 'M'; //we created a person object and defined properties of person object
		
		
	
		
		String name = "Jon Snow";
		int age = 33;
		char gender = 'M';
		
		//main method has nothing to do with blueprint itself, onu gormek icin Person class
		// ve runner class aryi yaptik, ama ayni class da da olabilirler.
		
		// creating new Person object
		Person p2 = new Person(); //as long as u have the teplate , cookie cutter, u can make milion of object as u want
		//setting attribute value of object
		p2.name = "Diane";
		p2.age = 32;
		p2.gender = 'f';
		
		
		
		//we have 2 object, p1, p2.
		
        // does this affect something? It doesn't cause it is the blueprint..and any object u create will have these properties.
		
		
		
		System.out.println( p1.name );
		System.out.println( p2.name );
		System.out.println(p1.name +","+ p1.age+","+p1.gender);
		
		// p1 is the address/container storing the address, reference variable yani instance variable
		// actual object 
		
		
		// ** Ayni pakcage icinde farkli yerde main methodda, Horse class tan object create edebilirsin:
		
		Horse spartan = new Horse();
		
		spartan.breed="Mustang";
		spartan.age = 10;
		spartan.color = "Black";
		spartan.height=10.2;
		
		/*
		 *  class ta initialize ediliyor instance variable lar, main method da new object yazilip, assign ediliyor
		
		package day39;
		public class Person{
		 
		String name ;
        int age ;
		char gender ;
		
		
		public static void main (String [] args)
		 
		
		Person p1 = new Person();
		p1.name = "Zeliha";  object create edip new Person ile, sonra sinsifta initialize edilen  properties lerini burda assign ediyoruz.
		p1.age = 38;
		p1.gender= 'f';
		
		Person p2 = new Person ();
		p2.name = "Murat";
		p2.age = 12;
		p2.gender ='m';
		
		Perso p3 = new Person();
		p3.name = "Murvet";
		p3.age= 42;
		p3.gender = 'f';
		
		
		Person p4 = new Person ();
		p4.name = "Mutti";
		p4age = 40;
		p4.gender = 'm';
		
		
		package day39;
		public class Person{
		
		String name ;
		int age;
		char gender; 
		
		public static void main(String [] args){
		
		Person p1 = new Person();
		p1.name = "Emir";
		p1.age = 8;
		p1.gender = 'm';
		Sout(p1.name +","+p1.age+"'"+p1.gender+".");
		
		
		
		public class Horse{
		
		String breed;
		int age;
		String color;
		double height; 
		}
		
		public static void main(String [] args){
		
		Horse h1 = new Horse();
		h1.breed= "whatever";
		h1.age = 3;
		h1.color;"brown";
		h1.height, 3.4;
		
		}
		
		*/
		
		
	}

}
