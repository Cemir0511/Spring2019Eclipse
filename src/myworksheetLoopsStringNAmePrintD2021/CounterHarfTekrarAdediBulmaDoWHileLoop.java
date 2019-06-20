package myworksheetLoopsStringNAmePrintD2021;
public class CounterHarfTekrarAdediBulmaDoWHileLoop {
	public static void main(String[] args) {
		//how many letter showed up in this String:
		String str="jaaaava";
		//go though each and every character
		//if I see a, I will increment my counter by 1:
		
		int count=0;
		int x=0;
		
		do {
			char c=str.charAt(x);//store this character first, but how do i check if its a or not
			if(c=='a') {
			count++;//count=count+1;
			System.out.println("bingo at" + x);
			}
			   //System.out.print(str.charAt(x)+ " ");//this is how u get each character
	      x++;     //bu kisim jaaaava yi yazdirir ama bana kac tane a var o lazim
			   //o yuzden yukardaki gibi once letter cursor(x) char a store edilir 
			   //char c =CharAt(x) olarak, ve sonra  if == ile a var mi ona bakilir
	           //ve count increment yapilir adedi lazim cunku.
		}while(x<str.length());
		
		System.out.print(count);
		
		//prints out 5, 5 a var string de
	

	}

}
