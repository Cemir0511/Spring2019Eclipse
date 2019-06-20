package day11;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username = "user12321";
		String password = "pass22";
		
		if(username.contentEquals("user12321")&& password.equals("pass22")) {
		System.out.println("\"successful\"");
	}else {
		if(! username.equals("user")) {
			System.out.println("username not found");
			
		}else {
			System.out.println("password not correct");
			
		}
		
		
		
		

	}
	}

}
