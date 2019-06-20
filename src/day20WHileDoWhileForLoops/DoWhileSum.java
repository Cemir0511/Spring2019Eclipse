package day20WHileDoWhileForLoops;

public class DoWhileSum {
	//common interview question:

	public static void main(String[] args) {
	
		
		
		int sum=0;
		int x=1;
		
		do {
			sum=sum+x;  //sum+=x;//sum i specifically calculation dan once gormek istedigimiz 
			             //icin one koyduk
			System.out.println("x:"+x+ " sum is; " +sum);
			
			x++;
			
			if (sum>40) //curly braces optional as its one statement
			    break; //45 den sonrasi run etmiyor, daha iteration yok
			             //break oldugu icin
			
			
		
		}while(x<=10);
		
		/*
		
		int summ=0;
		int c=1;
		do {
			sum=sum+c;
			System.out.println("c is: " +c+ "sum is " + sum);
			c+=2;
			if (sum<=50)
				break;
		}while(c<+20);
		*/
}

	

}
