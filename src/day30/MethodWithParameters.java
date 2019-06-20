package day30;

public class MethodWithParameters {

	public static void main(String[] args) {
		//method that takes more than one paramaters 
		//yani parantez ici external parameter 2 adet
		//printTheSum(int a, int b){ //yada double or other primitives 
		
	//	String s= "abc";
	//	System.out.println(s.substring(1,3)); //taking more than 1 parameter
		
	//will create a method takes more than 1 parameter	
		
	//printTheSum(10.5,20.9);
		
	printTheSum(10.5, 20.9); // 31.4
	printTheSum(10.5, 200.4); //201.9
	printTheSum(105.1, 20.3); //125.39999999
	printTheSum(10, 20); //result 30.0, yani double olur sonuc
	                    //error vermez cunku double int i alir
	                    //automatically upcasting yapti yani
		
	printTheToplam(13.4, 45.89, 7000.23, 7894.893843);
	
	allTotal(2,98, 10087, 45);
	
	}
	
	public static void printTheSum(double a, double b) {
		double sum = a+b;
		System.out.println("the sum of numbers "+ sum);
		
		
		
		// printTheSum(int a, double b){ yazabilirdin ama call the method da 
		//birinci int ikinci double value girmen lazim
		//yada birincinin basina (int) eklersin		
		
		
	}
	public static void printTheToplam(double a ,double b, double c,double d) {
		double toplam = a+b+c+d;
		System.out.println("toplam: "+ toplam);
	}
	
	public static void allTotal(int a, int b, int c, int d) {
		int sum = a +b+c+d;
		System.out.println(sum);
		
	}

}
