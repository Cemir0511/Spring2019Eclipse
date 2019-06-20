package day19;

public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Facebook";
        //012345
        //123456
//print each character one by one in separate lines
int idx = 0;
while(idx < word.length()) {
System.out.println(word.charAt(idx));
idx++;
}

//print each character in reverse order
int idx2  = word.length() - 1; //5

while(idx2 >= 0) {
System.out.println(word.charAt(idx2));
idx2--;
		
	}

 int index = 0;
 while (index <= word.length()-1) {
	 System.out.print (word.charAt(index));
	 index++;
	 
 }
 System.out.println();
 
     String name = "Zeliha Hanim";
	int ind = 0;
	while ( ind<=name.length()-1) {
		System.out.print(name.charAt(ind));
		ind++;
	}


	}
}
