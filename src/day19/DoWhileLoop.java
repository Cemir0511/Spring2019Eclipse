package day19;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int x =1; 
		
		//print 1 to 10 using do while loop		
				int i = 1;

				do{
					System.out.println(i);
					i++;
				}while(i <= 10);
				System.out.println();
				
			//benim practice:	
				int a= 1;
				do {
					System.out.println("a is; "+a);
					a++;
				}while(a<=10);
				
				System.out.println();
				int z=0;
				
				do {
					System.out.println("z iz "+z);
					z++;
					
				}while(z<=10);
		System.out.println();		
				
	int d = 0;
	
	do {
		System.out.println("d is "+d);
		d++;
	}while(d<=25);

	
	System.out.println();
	int g = 5;
	do {
		System.out.println("g is "+g);
		g++;
		
	}while(g<+11);
	System.out.println();
	//numbers fro 9 to 0
	int t = 9;
	do {
		System.out.println("t is "+t);
		t--;
		
	}while(t>=0);
	
	System.out.println();
	
	int v = 13;
	do {
		System.out.println("v is: "+ v);
		v--;
		
	}while(v>=0);
	System.out.println();
	
    //numbers from 2019 to 1980
	int p = 2019;
	int sums = 0;
	do {
		System.out.println("p years between is: " + p);
		p--;
		
	}while(p >=1980);
	System.out.println("sum years is; " +sums);
   
				//write a do while loop to calculate sum of numbers
				//between 1 to 5
				//1+2+3+4+5 ==> 15
	
	int s = 1;
	int sumss=0;

	do {
		System.out.println("Summss is: " + sumss+ " S is : " + s);
		s++;
		sumss = sumss + s;
	}while (s <=5);
	System.out.println("Sumss is: "+ s);
	
	
	

				int sum = 0;
				int j = 1;
				{
				do {
					sum = sum + j; //sum+=j;
					j++;
					
				}while(j <= 5); //check the condition on the bottom

				System.out.println("Sum from 1 to 5 is " + sum);
				}
				System.out.println();
				
				int sumk=0;
				int k = 1;
				{
				do {
					sumk=sumk+k;
					k++;
					
				}while(k<=7);
				System.out.println("sum of k s is : "+ sumk);
				
			
					
				}
				System.out.println();
				int sumh=0;
				int h = 1;
				
				do {
					sumh= sumh+h;
					h++;
				}while(h<=9);
				System.out.println("sum h is :"+ sumh);
				
				System.out.println();

				
				int sumn = 0;
				int n = 0;
				do {
					sumn=sumn+n;
					n++;	
				}while(n<=10);
				System.out.println("Sum of n is: "+sumn);
				System.out.println();
				
		//sum practice:
				int o = 9;
				int sumo = 0;
				do {
					sumo=sumo+o;
					
					o--;
					
					
				}while(o>=0);
				System.out.println("sum o is "+ sum);
			System.out.println();
			
			
				
				
				
	}

}
