package day30;

import java.util.Arrays;

public class CountriesArray {

	public static void main(String[] args) {
		
		// 0 , 1
				String[][] countriesArray = { { "USA", "Washington DC" }, // 0
						{ "Canada", "Ottawa" }, // 1
						{ "Mexico", "Mexico city" }, // 2
						{ "Brasil", "Brasilia" }, // 3
						{ "Peru", "Lima" }, // 4
						{ "Argentina", "Boanes Aeros" }, // 5
						{ "Bolivia", "La Paz" }, // 6
						{ "Macedonia", "Scopia" }, // 7
						{ "Kazakhstan", "Nursultan" }// 8
				};
				// String[][] c = new String[9][2];
				// c[0][0] = "USA"; c[0][1] = "Washington DC";
				// print USA with Capital city
				System.out.println(countriesArray[0][0] + "|" + countriesArray[0][1]);
				System.out.println(countriesArray[8][0] + "|" + countriesArray[8][1]);
				System.out.println(Arrays.deepToString(countriesArray));
				System.out.println("My trials;   " + (Arrays.deepToString(countriesArray))+ "+" + "My trial");

				// print all the countries in same line separated by |
				// 1) for loop
				for (int i = 0; i < countriesArray.length; i++) {
					System.out.print(countriesArray[i][0] + "|");
					for (int z = 0 ; z < countriesArray.length; z++) {
						//System.out.print(countriesArray [z][0]+ " ??????");
					}
				}
				System.out.println();
				// 2) for each loop
				for (String[] country : countriesArray) {
					System.out.print(country[0] + "||||||||");
				}
				System.out.println();
				
				
				// get all the Cities and add to cities[] array
				// declare cities array and size needs to match countries Array size
				// String[] cities = new String[9];
				String[] cities = new String[countriesArray.length];
				
				//sehirler null cunku declare ettik ama match yapmadik for loop la 
				//for loop laz yazdirabiliyoruz yoksa null..
				String [] sehirler = new String [countriesArray.length];
				System.out.println("Sehirler: "+ Arrays.toString(sehirler));
				for (int sh=0; sh<countriesArray.length; sh++) {
					sehirler[sh]= countriesArray[sh][1];
					System.out.println("Sh ... "+Arrays.deepToString(sehirler));
				}
				
				
				// null means no object. it is not same as empty string
				System.out.println("cities:  "+ Arrays.toString(cities));

				for (int i = 0; i < countriesArray.length; i++) {
					cities[i] = countriesArray[i][1];
				}

				System.out.println("asil simdi cities:  "+ Arrays.toString(cities));

				/////////////////////
				// Look for Bolivia in the countriesArr and test if
				// capital city is "La Paz"
				for (int row = 0; row < countriesArray.length; row++) {
					
					if(countriesArray[row][0].equals("Bolivia")) {
						//System.out.println(countriesArray[row][1]);
						if(countriesArray[row][1].equals("La Paz")) {
							System.out.println("Bolivia test passed");
						}else {
							System.out.println("Bolivia test failed");
						}
						break; // exit the loop.
					}
					
				}
				
				for (int line=0; line < countriesArray.length; line++) {
					if (countriesArray[line][0].equals("Nursultan") ||  countriesArray[line][1].equals("Nursultan")) {
						System.out.println("Nursultan present");
					}else {
						System.out.println("Not present");
					}
					break;
				}
				
				///second version with &&
				//this version will show fail for each mismatch
		        for (int row = 0; row < countriesArray.length; row++) {
					
					if(countriesArray[row][0].equals("Bolivia") && countriesArray[row][1].equals("La Paz")) {		
							System.out.println("Bolivia test passed");
					}else {
							System.out.println("Bolivia test failed");

					}
					break;
					
				}
	}

}
