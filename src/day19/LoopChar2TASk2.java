package day19;

public class LoopChar2TASk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
char firstChar = str.charAt(0);
		//TASK 2
	    //create a program like above
	    //to check whether user input first character
	    //1, started with number
	    //2. end with uppercase

char first = str.charAt(0);
char last = str.charAt(str.length()-1);
if (first >=0 && first <=9 ) {
	System.out.println("number");
}else {
	System.out.println("not number");
}





		
		if (firstChar >= '0' && firstChar <= '9') {

		      System.out.println(" number ");

		    } else {

		      System.out.println("NOT number ");
		    }

		//2. end with uppercase
		
		//char lastChar=str.charAt(str.length()-1);
	}

}
