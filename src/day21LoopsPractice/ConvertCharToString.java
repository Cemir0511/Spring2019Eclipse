package day21LoopsPractice;

public class ConvertCharToString {

	public static void main(String[] args) {
	
		//interw q:
//following ways can be used to convert char to String:	

	char ch = 'a';
	String str1= ""+ch; // char a donusturmek icin cift tirnak isareti koyariz
	System.out.println(str1); //a printed
		
	
	char ch2='v';
	//String str2= new String(ch2);
	String str2=new String(""+ch2);
	String str3=Character.toString(ch2);
	
	System.out.println(str2);//v printed
	System.out.println(str3);//v printed
	
	
	
	
	}

}
