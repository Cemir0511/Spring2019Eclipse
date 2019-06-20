package day39;

public class CustomClassNotesCont {

	public static void main(String[] args) {
		/*
		Custom Classes

		Class is a blueprint

		===^_^===>>> new keyword creates objects such as;

		--->> String str = new String("abc");
		--->> Scanner input = new Scanner(System.in);
		--->> Random run = new Random();

		===^_^===>>>horse has;

		---> property: color, age, height, breed
		---> behavior: action that is; jump, eat, run, kick

		===^_^===>>> a person object

		--->> properties: name, age, gender
		--->> behaviors: east, study, laugh, sleep, cry

		===^_^===>>> How can we define the propery of object being created?

		--->> Add a class and name it Person ;===>> public class Person{

		--->> Properties of objects defined by instance variable.
		--->> String name;
			  int age;
			  char gender;
			  
			  Note: in the Person class, there is no main method to be safe. 
			  delete public static void main(String[] args) { along with braces };
			  
		after adding these in public class Person;
		add another class and put them side by side 
		so you can assign some values to them for each object
		let's name it RunnerClass;

		===^_^===>>> In the RunnerClass, let's make an object and name it person1;

		--->> there is a Person type that we can create objects now;
		--->> Person person1 = new Person(); --> person1 object created here.
		--->> Person person2 = new Person(); --> person1 object created here.

		===^_^===>>>now assign values to person1
		// instance variables/ fields
		---> person1.name = "Sam";
		---> person1.age = 15;
		---> person1.gender = 'M';

		===^_^===>>>now assign values to person2

		---> person2.name = "July";
		---> person2.age = 24;
		---> person2.gender = 'F';
			
			Print person1's name : System.out.println(person1.name);
			Print person2's name : System.out.println(person2.name);

		===^_^===>>> Reassign different values to persons

		--->>person1.age =16;
		--->>person2.age=25;

		Add ==> System.out.println(person1.age)
		Add ==> System.out.println(person2.age)

		===^_^===>>> When you type the object name;

		person1. ===> after the dot, eclipse should show the available attributes
		found in the other class you have made. if not go back and try again.

		person2. ===> after the dot, eclipse should show the available attributes
		found in the other class you have made. if not go back and try again.




		===^_^===>>> Let's do another example. Add a new class, name it Car;
		---> if you name different, then you must make changes across the example, 
														pay attention to that ok.

		--->> Think of adding instance variables such as make, model, year, price and more!
		public class Car {

			String make;
			String model;
			int year;
			double price;
			short horsePower;
			boolean isConvertible;

		class comes first then the objects.

		===^_^===>>> Add another class in the same package and name it like CarSale;

		public class CarSale {
			public static void main(String[] args) {
				
				
		--->> add new car object===>		Car car1 = new Car();
		--->> add new car object===>		Car car2 = new Car();
		--->> add new car object===>		Car car3 = new Car();
			==> you can assign instance variables a value like car1.year=1995;
			==> in this example I did not have instance variables 
			==> because we look at default values here	
			==> you can always add some variables to make car sale filled with new cars :)
				System.out.println(car1.model);
				System.out.println(car1.make);
				System.out.println(car1.price);
			}

		}


		--->>


		===^_^===>>> // default values for fields
		---> Any referece type(String) field ---> null
		---> Any whole numbers ---------> 0
		---> Any fractional numbers-----> 0.0
		---> char-----------------------> empty space 0
		---> boolean -------------------> false
		---> 
	*/
	}

}
