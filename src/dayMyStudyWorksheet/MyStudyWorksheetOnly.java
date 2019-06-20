package dayMyStudyWorksheet;

public class MyStudyWorksheetOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "Hurmamm";
		int count=name.length();
		
		for(int i=0;i<count;i++) {
			System.out.print(name.charAt(i)+ " ");
			
		}
		System.out.println();
		
		
			for(int i=count-1; i>=0; i--) {
				System.out.print(name.charAt(i)+ " ");
			}
		
			System.out.println();
			
			String reverse= "Ahmet";
			 for (int a =reverse.length()-1; a>=0; a--) {
				System.out.print(reverse.charAt(a));
				 
			 }
	}

}
