package day39;

public class SonRunnerFactory {

	public static void main(String[] args) {
		
		Son s1 = new Son();
		
		s1.lastname = "Melih";
		s1.name = "Emir";
		s1.height = 12.3;
		s1.weight = 70.1;
		s1.tan = "sarisin";
		s1.success = "iyi";
		s1.age = 13;
		
		
		System.out.println(s1.height);
System.out.println(s1.lastname);
System.out.println(s1.tan);
	}

}
