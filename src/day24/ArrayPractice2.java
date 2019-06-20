package day24;

public class ArrayPractice2 {

	public static void main(String[] args) {
		
		// create an int array of 5 items and assign values ; 

		// double the value of 3rd item  : for example 9 --> 18 
		// update the value of 4th item to sum of 1st and 2nd items

		// print them out using the loop 

		// OPTIONALLY SWAP the value of first and last items 

		
		Akbar:
			// create an int array of 5 items and assign values ; 
		    //{1,4,6,8,9}
		    int nums []= {1,4,6,8,9};
		    for (int i = 0; i < nums.length; i++) {
		      System.out.print( nums[i] + " ");
		    }
		    System.out.println();
		    // double the value of 3rd item  : for example 6 --> 12 
		    nums[2] = nums[2] * 2 ; 
		    // update the value of 4th item to sum of 1st and 2nd items  8 --> 1+4
		    nums[3] = nums[0] + nums[1] ; 
		    
		    for (int i = 0; i < nums.length; i++) {
		      System.out.print( nums[i] + " ");
		    }
		    

		int [] arr = new int [] {1,2,3,4,5,6};
		
		int [] arr4 =  arr4; 
		
		int[] numbers = {3,6,9,12,15};
		int a = numbers[2] *2;
		numbers[2] = a;
		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			
			//baskasi;
			int[] num = new int[] {1,4,6,8,9};
			System.out.println(num[2] * 2);
			System.out.println(num[3] = num[0]+num[1]);	
			
				
			for(int i=4 ; i>=0 ; i--) {
			       System.out.print( num[i] + " "   );
		
			       int [] testArray=new int [5];
			   	testArray[0] =2;
			   	testArray[1] =1;
			   	testArray[2] =3;
			   	testArray[3] =1;
			   	testArray[4] =8;
			   	
			   	testArray[2]*=2;
			   	testArray[3]=testArray[0]+testArray[1];
			   	for (int i=0;i<5;i++) {
			   	System.out.println(testArray[i]);	
			   	}       //baskasi;
			   	
			   	int [] nums = {1, 4, 6, 8, 9};
				
				nums [2] *= 2; 
				for (int i = 0 ; i < nums.length ; i++) {
					System.out.print (nums[i] + " ");
				}
				
				System.out.println ();
				nums [3] = nums [0] + nums [1];
				
				for (int i = 0 ; i < nums.length ; i++) {
					System.out.print (nums[i] + " ");
				}
				
				System.out.println ();
				
			
				int temp = nums [nums.length -1];
				nums [nums.length -1] = nums [0];
				nums [0] = temp;
				
				
				for (int i = 0 ; i < nums.length ; i++) {
					System.out.print (nums[i] + " ");
					
					//baskasi
					
					int[] five = new int[5];	
					five[0] =3;
					five[1]=4;
					five[2]=6;
					five[3]=7;
					five[4]=9;
					
					System.out.println(five[2]*2);
					
					five[4]=five[0]+five[1];
					System.out.println(five[4]);
					
					five[0]=five[4];
					five[4]= five[0];
					System.out.println(five[4]+" "+five[0]);
				for(int i=0; i<5; i++) {
					
					System.out.print(five[i]+"");
					
				}System.out.println();
				
				//bus:
				int [] num =  {1,2,3,4,5};
				
				System.out.println(num[2] * 2);
				System.out.println(num[3] = num[0]+num[1]);	
				
			for (int i = 4; i>=0; i--) {
				System.out.println(num[i]+ " ");
				}
			
			//hepsi:
			int[] arr=new int[] {1,4,6,8,9};
			arr[2]=2*arr[2];
			arr[4]=arr[0]+arr[1];

			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
				System.out.println();
				for(int j=arr.length-1;j>=0;j--) {
					System.out.print("reversed: "+arr[j]+" ");	
			}
				System.out.println();
				int sum=0;
				for(int x=0;x<arr.length;x++) {
				sum+=arr[x];	
			}
				System.out.println("sum of :"+sum);
			       
	}

}
