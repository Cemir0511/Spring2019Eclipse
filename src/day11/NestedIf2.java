package day11;

public class NestedIf2 {

	public static void main(String[] args) {
		
		String username = "user";
		String password = "pass";

		if (username.equals("user")) {

			if (password.equals("pass")) {
				System.out.println("YES LOG IN SUCCESS");
			}

		}

		if (username.equals("user"))

			if (password.equals("pass"))
				System.out.println("YES LOG IN SUCCESS");

	

	}

}
