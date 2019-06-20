package day45;

public class MathEquation {

	private double operand1;
	  private double operand2;
	  private double result;
	  private char operator;
	  
	  // how can I make my field read only?
	  // take out the setters, use only getters
	  // if u take out setters there is no way to change anything in there
	  
	  
	  public MathEquation() {
	    System.out.println("no arg");
	  }

	  public MathEquation(double operand1, double operand2, char operator) {
	    this.operand1 = operand1;
	    this.operand2 = operand2;
	    this.operator = operator;
	  }

	  
	  //create another version of calculateX method
	  //accept two parameter to set new operand1 operand2
	  //calculate new result
	  //return nothing
	  
	  public void calculateX(double num1, double num2) {  // burda a method is calling another method
		  
		  //setting new value for operand1 and operand2
		  this.operand1 = num1;  //inside template point ettigin, refer etting sekli this.
		  this.operand2= num2;    // diger main method da mesela job1.calculate dersin
		                          // ama template class ta this.operand1 falan dersin 
		                          // this. bu yani
		  
		  
		  // do calculation according to new number 
		  //and whatever operator value we currently have
		  //AND WE ALREADY HAVE CALCULATE METHOD TO DO THAT!!
		  // WE just call them, calculate
		  
		  this.calculate();     //
		  
	  }
	  
	  
	  public void calculate() {
	    
	    switch (this.operator) {

	      case '+':
	        this.result = this.operand1 + this.operand2;
	        break;
	      case '-':
	        result = operand1 - operand2;
	        
	        break;
	      case '*':
	        result = operand1 * operand2;
	        
	        break;
	      case '/':
	        result = operand1 / operand2;      
	        break;
	      
	      default: 
	        System.out.println("INVALID @@@!!!");
	      
	    }

	    
	  }
	  


	  public double getOperand1() {
	    return operand1;
	  }
	  public void setOperand1(int operand1) {
	    this.operand1 = operand1;
	  }
	  public double getOperand2() {
	    return operand2;
	  }
	  public void setOperand2(int operand2) {
	    this.operand2 = operand2;
	  }
	  public char getOperator() {
	    return operator;
	  }
	  public void setOperator(char operator) {
	    this.operator = operator;
	  }
	  public double getResult() {
	    return result;
	  }
	  
	  public String toString() {
	    return "MathEquasion [operand1=" + operand1 + ", operand2=" + operand2 
	        + ", operator= <" + operator + "> | result=" + result +  "]";
	  } 
	  
	  
	  
	  	
	
}
