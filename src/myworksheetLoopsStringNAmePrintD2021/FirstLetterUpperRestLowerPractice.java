package myworksheetLoopsStringNAmePrintD2021;
import java.util.Scanner;
public class FirstLetterUpperRestLowerPractice {
	public static void main(String[] args) {
		
		/*
		
		//ilk harf upper , rest lower nasil yapariz?
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name: ");
				String name= "betul"; //scan.next();
		
		char c =name.charAt(0); //bundan direk uppercase yapamayiz cunku char primitive dir 
		                        //ve action yapmaz. char doesn't have action!!
		
		//c.Uppercase desek olmaz cunku char action almaz!!!Napariz o zaman:
		//String almak zorundayiz:
		
		String firstUp=name.substring(0,1).toUpperCase();//yani sadec 0. harf-ilk harf
		String expected=firstUp+name.substring(1);//kac harfli oldugunu bilmedigin zaman 2.
		                 //yani index 1 dan alip rest of it print olur!!
		                // substring ..(1) shot and rest alir, first letter haric, o up oldu
		
		System.out.println(expected);
	
	*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a name ");
		String name=scan.next();
		
		String fUp=name.substring(0,1).toUpperCase();
		String expected=fUp+name.substring(1);
		//yada hepsi bir shot da:
		String son=name.substring(0,1).toUpperCase()+name.substring(1);
		System.out.println(son);
		//System.out.println(expected);
		
		
		
	}

}
