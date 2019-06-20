package day27;

public class ForEachLoopAfternoonWarmUpTAsk {

	public static void main(String[] args) {
		/*
		Afternoon warmup 

		create an array of int 
		ask user for 5 numbers 

		get the sum 
		get the max 
		get the min 

		specifically using for each loop
		*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 5 numbers");
		int [] num = {scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(),};
		
		int sum=0;
		for(int each:num) {
			sum+=each;
		}
		System.out.println("sum is "+sum);
//////////////////////////////////////////////////////////////		
		int max = num[0];
		for(int each:num) {
			if(each>max) {
				max=each;
			}
		}
		System.out.println("maximum number is "+max);
//////////////////////////////////////////////
		
		int min = num[0];
		for(int each:num) {
			if(each<min) {
				min=each;
			}
		}
		System.out.println("minimum number is "+min);
	
		
		
		
		

	}

}
