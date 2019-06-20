package day23;

public class ArrayMyPractice {

	public static void main(String[] args) {
		//Creating arrays:
		
		int [] numbers = new int [ 5];
		
		int  []numberss= new int [] { 2, 5, 6};
		
		int [] numbersss = {2,4,6};
		
System.out.println(numbersss[2]);

System.out.println();
//for each loop;
int []cols= {1,2,3};
int []rows= {1,2,3,4};

for (int row:rows) {
	System.out.println("row"+row);

for (int column : cols) {
	System.out.println("colums"+ column);
}
}

	}

}
