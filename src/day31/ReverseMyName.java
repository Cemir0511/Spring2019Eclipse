package day31;

import java.util.Arrays;

public class ReverseMyName {

	public static void main(String[] args) {
		
		
		//reverse my name:
		
		String str = "Zeliha Kocak";
		
		for (int i = str.length()-1; i>=0; i --) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		//reverse son's name:
		
		String name = "Cemal";
		for (int a = name.length()-1 ; a>=0; a--){
			
			System.out.print(name.charAt(a));
		}
	
		System.out.println();

		
		////////////////
		
		//reverse names:
		
		String names= "Zeliha, Kemal, Melih, Cemal";
		
		for (int y = 0 ; y < names.length(); y++)
			System.out.print(names.charAt(y));
		
		System.out.println();
		
		for (int z = names.length()-1; z>=0; z--) {
			System.out.print(names.charAt(z));
		}
		
		
		
		//declare a char value:
		
		char c = 'z';
		
		
		
		
		///////////////////
		System.out.println();
		
		
		//How to print sort method?

		String [] arr= {"Emir", "Ahmet" , "Cemal" ,"Melih"};
		
		Arrays.sort(arr);
		System.out.println (Arrays.toString(arr));
	

		String [] arr2= { "Annecim", "Babacim", "azati", "ablacim"};
		
		//Arrays.parallelSort(arr2);
		System.out.println(Arrays.toString(arr2));
		
	}

}
