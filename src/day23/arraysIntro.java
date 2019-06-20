package day23;

public class arraysIntro {

	public static void main(String[] args) {
		
		//eskinden, array den once tek tek int value assign ederdik:
		
		int i1= 10;
		int i2=20;
		int i3=30;
		int i4=40;
		int i5=50;
// we declared int array variable 
// and we assigned an int array object 
// that has capacity of 5 
		int[] numbers = new int[5]; 
		//System.out.println(numbers);

		// ASSIGNING VALUE to array
		numbers[0] = 10 ; 
		numbers[1] = 15 ;
		numbers[2] = 28 ;
		numbers[3] = 20 ;
		numbers[4] = 3 ;

		System.out.println( numbers[0] );
		
		double [] newNumbers= new double[4];
		
		newNumbers [0]=10.0;
		newNumbers[1]= 20.0;
		newNumbers[2]= 30.0;
		newNumbers[3]= 40.0;
		System.out.println(newNumbers [2]);
		

		
		
	}

}
