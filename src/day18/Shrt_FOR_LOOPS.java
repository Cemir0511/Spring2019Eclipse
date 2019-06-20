package day18;

public class Shrt_FOR_LOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//for(int n=1;n<=5;n++) {
		//System.out.println("Hello Cybertek");
	//}
	
	//for  (int n=1;n<=5; n+=2) {
		//System.out.println(n);
	//}
	//int star;//loop disinda n declare edersen altta sout ta printte cikar
	//for (star=1; star<10;star++) {
		//System.out.println("+");
	
	//System.out.println();//print etmez, cunku out of scope, block disinda
	//System.out.println(star);
	
	
	for (int v = 10; v>=0;v--) {
	System.out.println(v+",");	
		
	}
		for(int i=0;i<50;i++) { //0 ile 50 arasi tek sayilari cikarma , 
			                    //while altina if ile
			if(i %2!=0) {
				System.out.println(i);
			}
			
			
			String []fruits = new String[3];
			fruits[0]="apples";
			fruits[1]="pears";
			fruits[2]="oranges";
			
			for(int z =0; i<3;z++) {
				System.out.println(fruits[z]);
			}
		}
	
	}

}
