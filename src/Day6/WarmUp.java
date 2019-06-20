package Day6;

public class WarmUp {

	public static void main(String[] args) {
		
		// declare a variable offerCount and give initial value of 1 ; 
				int offerCount = 1 ; 
				System.out.println(offerCount );
				// lets imagine you got five offer today --> shorthand assignment to increment the value
				offerCount += 5 ; 
				System.out.println(offerCount );
				// you have rejected two of them 
				offerCount -= 2 ; 
				System.out.println(offerCount );
				// then after a week , your offers multiplied by 4
				offerCount *= 4 ; 
				System.out.println(offerCount );
				// then you decided cut the offer count to half of what you have 
				offerCount /= 2 ; 
				System.out.println(offerCount );
				// eventually you want to get remainder by 5 ; 
				offerCount %= 5 ;  
				System.out.println(offerCount );
				
		
	}

}
