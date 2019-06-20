package day1;

import java.util.Scanner;

public class StringManupulations {

	public static void main(String[] args) {
		
		/*
		 String (immutable) : Substring, charAt, indexof, lastindexof, 
		 caoncat, replace, replaceFirst, uppercase & lowercase.
		 trim
		 
		 */
		
		// 1. substring:  it returns  the sub value of the String 
		
		// substring (beginning index, ending index) it excludes the ending index.
		String str="Cybertek School";
				String str2=str.substring(0, 7+1);
				System.out.println(str2);
				
				str =str.substring(0, 7+1);
				System.out.println(str); 
				
				// substring(beginng index);
				String str3="Today is great day";
						str3=str3.substring(6);
						System.out.println(str3);
						
		// charAt(index): returns a char value
				String A ="ABCDABCD";
					char ch1=A.charAt(2);   // returns char value
		
		
		// indexof(char value(or String value)): it returns integer number.
					
					String A1="Batch 11 is a great batch";
						int num1=A1.indexOf(" a ")+1; //returns the first occurred valus of a
							int num2=A1.indexOf("great")+3;
							System.out.println(num1);
							int num3=A1.indexOf("batch")+3; // this will return the last C' index num
							System.out.println(num3);
							
							
							
							
		// lastindexOf(): returns the last occured value index number.
						//	Scanner scan=new Scanner(System.in);
						//	String A4=scan.next();
							
						//	int num5=A4.indexOf("M");
							
							String u="ABCDeABCDe";
							int num5=u.lastIndexOf("D");
							System.out.println(num5);
							
		// concat();
					String i ="Cybertek".concat(" School");
					System.out.println(i);
				
		// Replace(strOld (or char), Strnew(char) ):  replace all occured values with the new value
					String word = "Java";
					 word=word.replace('a', 'e');
					System.out.println(word);
		
	// replaceFirst(strOld,strNew):  it replaces	first occured value.	
				String word2="Java";	
					word2=word2.replaceFirst("a", "e");
					System.out.println(word2);
					
					word2=word2.replace("va", "vz");
					System.out.println(word2);
		
					Scanner scan=new Scanner(System.in);
						String strscan=scan.next();  
						// muhtar  ==> Muhtar;
						strscan=strscan.substring(0,1).toUpperCase()+ strscan.substring(1).toLowerCase();
						System.out.println(strscan);
						
						String reversedName="";
						
						// for(initilization ; condition ; iterator)
						for( int z=strscan.length()-1 ; z >= 0 ; z--) {
							reversedName += strscan.charAt(z);
								reversedName = reversedName + strscan.substring(z,z+1);
						}
						System.out.println(reversedName);
						
						// for(initilization ; condition ; iterator)
						
						
						
						

	}

}
