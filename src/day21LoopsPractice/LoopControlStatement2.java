package day21LoopsPractice;
public final class LoopControlStatement2 {
	public static void main(String[] args) {
		
		
		for (int i = 1; i<=10;i++) {
			
			System.out.println("GOT THE MILK?" + 1);
			continue;//continue burda olsa ne yapar??
//at the end old icin bisey olmaz..zaten skip yapip basa donecegi
//icin. for da check edip line i, next iteration a gidiyor zaten.
//aslinda continue useless ..cunku zaten next iteration a gidiyr.
			
  //  ------->>>>>   System.out.println("END");//bunu buraya koysak nolur?
			               //unreachable code, burda no if statement or nothing
			              //o yuzdenline 15 hic execute olmaz.
			             //dead code da denir. It will be caught by compiler!	
		}	
		for (int i = 1; i<=10;i++) {
			if(i==5) {
				continue;		
			}
			break;//line 28 de dead code, unreachable code, 
			//cunku break te biter execution.zaten error verir ..
//  ---->>>		System.out.println("Got the milk?"+i);	 //ayni unreachable code
			                                            //diye uyari verir.
		}
	}
}
