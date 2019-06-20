package day48;

public class  Student extends Person{  //ve student classi extends to person yapiyoruz 
                                        //boylece herseyi icindekini yani kopyaliyor
//	public String name;
//	public int age;
//	public float  height;
//	public char gender;
    public int studentId;   // sadce bu farkli Person class ta olandan,  
                           //    buraya kadar iki sinif icerigi ayni, ve bu noktada inhritance dusunuyoruz 
	
}


/*   JAVA IS A SINGLE INHERITANCE LANGUAGE
 * A CLASS CAN ONLY EXTNDS TO ANOTHER CLASS (ONLY to one, not many)
 * Multi inheritance yok yani
 * 
 * 
 * EXTENDS YAZINCA GOZUKMESE DE ICERIK SPER CLASS TAN KOPYALANIR VE MEVCUTTUR
 * 
 * But you DONT INHERIT THE CONSTRUCTOR
 */



/*
 * public class Teacher extends Person {
 * Teacher happen sub class after extends 
 * sub class more specific type
 * person is a super class
 * super class always more general one
 */