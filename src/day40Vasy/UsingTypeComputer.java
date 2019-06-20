package day40Vasy;

import java.util.ArrayList;

public class UsingTypeComputer {

	
		
			public static void main(String[] args) {
				ArrayList<String> words = new ArrayList<>();
				//this collection of objects of our own custom class
				ArrayList<Computer> computers = new ArrayList<>();
				Computer mac = new Computer();
				computers.add(mac);
				//we are adding object of computer class without reference type
				computers.add(new Computer());
				Computer imac = getComputer();
				System.out.println(imac.OS);
				computers.add(imac);
				System.out.println(computers.size());
			}
			//this method will return object of computer class
			public static Computer getComputer() {
				Computer imac = new Computer();
				imac.OS = "MacOS";
				return imac;

	}

}
