package day16;

public class isEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isEmpty method:
		
		// str.length()>0   ====>>> isEmpty()  //0 dan buyukse ve esitse bos string degildir
		                      // - 1 den buykse de bos string degildir.
		
			String str = "";

			System.out.println(str.isEmpty()); // true cunku empty string ""

			
			
			String str2 = "xx";

			System.out.println(str2.isEmpty()); //false xx var
			
			

			String str3 = " "; 

			System.out.println(str3.isEmpty()); // false..space karakterdir
			String actualResult = "Amazon.com " + "" ; 
		

	

	}

}
