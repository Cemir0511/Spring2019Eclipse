package day32;

public class MethodThatTakeParameterAndReturnValue {

	public static void main(String[] args) {
		
		
		boolean result = isAdultOrNot(19);
		System.out.println(result);
		System.out.println(isAdultOrNot(16));
		System.out.println(isAdultOrNot(20));
		System.out.println(isAdultOrNot(15));
		System.out.println(isAdultOrNot(38));
		

	}
	
	

	public static boolean isAdultOrNot(int age) {
		if(age >18) {
			return true;
		}else {
		    return false;
	}
		
	//	return age > 18 && age < 28; boyle de yazabiliriz
}
}