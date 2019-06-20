package day47;

//import is used to import the type that not under the package 

//static import 
//-->> is used to import the visible static members of another class 
// we use keyword import static yourClasname.staticMember; 
// just like importing the class, we can use .* to import all static members

import static day47.StudentUtility.displayAllStudent ; 
import static day47.StudentUtility.* ; 



public class StudentActivity {

public static void main(String[] args) {
 
 //StudentsUtility.displayAllStudent();
 displayAllStudent();
 System.out.println("---------------");
 addOneStudent("Tugba");
 addOneStudent("Sheroz");
 displayAllStudent();
 
 System.out.println("---------------");
 updateStudent(11, "Sheroz Zoidov");
 displayAllStudent();
 
 System.out.println("---------------");
 removeStudent(6);
 displayAllStudent();
 
 System.out.println("---------------");
 resetTheList();
 displayAllStudent();

 
}
}




// importlari neden yaptik, cunku staticlere access edebilmek icin directly, otherwise we have to call
//the class name all the time