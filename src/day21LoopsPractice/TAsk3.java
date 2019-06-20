package day21LoopsPractice;

public class TAsk3 {

	public static void main(String[] args) {
		
		
		//Tas3. skip all numbers divisible by 3 and 5
	     //   at the same time 	
		
		//Task2.3
		int sum=0;
		for (int i = 1;i<50;i++) {
			
			if(i%5==0 && i%3==0) { //if this is true, i want to continue
				
			continue; //bu bolunenleri print etmedi 
			}           
			          // eger i 5 e ve 3 e bolunebiliyorsa, dogruysa, devam et 
			          //ama onlari print etmiyor atliyor.
			          //yani continue skip yaptiriyor !!! onlar haric devami yazdiriyor
			
			System.out.print(i+ " ");
			sum=sum+i;
			
		}
		
		System.out.println(sum);
		
		
		
	}

}
