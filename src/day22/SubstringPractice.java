package day22;

public class SubstringPractice {

	public static void main(String[] args) {
		
		
		String song = "Name : Ba Ba Black Sheep Ba";
        String target = "Ba";
        
        int indexOf1Ba= song.indexOf("Ba");
        System.out.println(indexOf1Ba);
                
        int indexof2Ba = song.indexOf("Ba", indexOf1Ba+2);
        System.out.println(indexof2Ba);
        
        int indexOf3Ba = song.indexOf("Ba",indexof2Ba+2);
        System.out.println(indexOf3Ba);
		
		
	}

}
