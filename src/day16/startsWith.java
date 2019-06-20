package day16;

public class startsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//str.indexOf("bc")==0   ====>>> str.startWith("bc") 
		
		
String str = "Busra";
		
		System.out.println(  str.startsWith("B")     );
		System.out.println(  str.startsWith("ABC")     );
		
		boolean b = str.startsWith("Bu"); 
		
		if(b) {
			System.out.println("Successful");
		}else {
			System.out.println("NOT A Bu");
		}
		
		
	}

}
