package day50;

public class MethodChaining {

	public static void main(String[] args) {
		
		//Step 1
		methodA();
		//Step 7 --->> end of execution.. u r done, u just get out of execution
		

	}
	
	public static void methodA() {
		//Step 2
		methodB();
		//Step 6:
		System.out.println("method A called  ");
	}
	
    public static void methodB() {
    	// Step 3
    	System.out.println("B called  ");
    	// Step 4
    	methodC();
    }
    
    public static void methodC() {
    	
    	//step 5
    	System.out.println("C called   ");
    }
}
