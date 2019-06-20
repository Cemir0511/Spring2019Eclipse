package day39;

public class ExplorePersonBehavior {

	public static void main(String[] args) {
		
		  Person p = new Person(); //we create a new object
		  
		    p.age = 19; 
		    p.gender = 'M'; 
		    p.name = "Abdul Khan"; 
		    
		  Person g = new Person(); 
		  
		    g.age = 19; 
		    g.gender = 'F'; 
		    g.name = "Alina"; 
		    
		  Person t = new Person();
		  
		    t.name="Zelina";
		    t.age=28;
		    t.gender='f';
		    
		    p.eat(); // so eat behaviour u nun object e ihtiyaci var, new p object create edip,p.eat diyoruz
		    p.tellMeYourName();
		    p.printPersonInfo();
		    
		    g.eat();
		    g.tellMeYourName();
		    g.printPersonInfo();
		    
		    t.eat();
		    t.walk();
		    t.tellMeYourName();
		    t.printPersonInfo();
		    

	}

}
