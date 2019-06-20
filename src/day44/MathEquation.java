package day44;

public class MathEquation {

	/*
	MathEquation e1 = new MathEquation(12.1,33.2, '-'); 

Create a class called MathEquation 
	add 4 private fields 
		oprand1 , oprand2 , result as double 
		operator as char 

	Encapsulate first 3 fiels 
		with getters and setters
	provide only setter for operator field

	Create no arg constructor 
		just print out message from no Arg 

	create 1 arg constructor 
		set the operator value 

	create 3 args constructor 
		set all 3 fields value 
				: oprand1, oprand2, operator 

	create a void instance method calculate
			with no parameter
		set the result value 
			according to oprand1 oprand2 operator
			if operator is + - * / 
				calculate result 

	Create toString method to return all fields value 


	In main method in another class
	create 4 MathEquation objects 
	and call calculate method 
	and print out the result field value 



    
    
    
*/
/*	Shah's
	
	 * private double oprand1, oprand2, result;
	private char operator; 
	

	public double getOprand1() {
		return oprand1;
	}



	public void setOprand1(double oprand1) {
		this.oprand1 = oprand1;
	}



	public double getOprand2() {
		return oprand2;
	}



	public void setOprand2(double oprand2) {
		this.oprand2 = oprand2;
	}



	public double getResult() {
		return result;
	}



	public void setResult(double result) {
		this.result = result;
	}



	public void setOperator(char operator) {
		this.operator = operator;
	}



	public MathCalculation() {
		
	}
	public MathCalculation(char operator) {
		super();
		this.operator = operator;
	}



	public MathCalculation(double oprand1, double oprand2, char operator) {
		super();
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
		this.operator = operator;
	}


	public void Calculate () {
		
		switch (operator) {
		case '+':
			result = oprand1 + oprand2;
			break;
		case '-':
			result = oprand1 - oprand2;
			break;
		case '*':
			result = oprand1 * oprand2;
			break;
		case '/':
			result = oprand1 / oprand2;
			break;
		default:
			System.out.println("Please choose from :  +-*/");
			break;
     }
	}

	public String toString() {
		return "MathCalculation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}
	
	
	 */
	
	
	
	/*  Akbar's:
	 *  private double operand1;
  private double operand2;
  private double result;
  private char operator;
  
  public MathEquasion() {
    System.out.println("no arg");
  }

  public MathEquasion(double operand1, double operand2, char operator) {
    this.operand1 = operand1;
    this.operand2 = operand2;
    this.operator = operator;
  }

  public void calculate() {
    
    switch (operator) {

      case '+':
        result = operand1 + operand2;
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
    return "MathEquasion [operand1=" + operand1 + ", operand2=" + operand2 + ", result=" + result + ", operator="
        + operator + "]";
  } 
  
  
  
	 * 
	 * 
	 * 
	 */
	
	 
	 
	 
	 
	 
	 
	 
	 
	
	/*  someone's :
	 * public class MathEquation {
	private double oprand1;
	private double oprand2;
	private double result;
	private char operator;

	public MathEquation() {
		
	}
	

	public MathEquation(char operator) {
		super();
		this.operator = operator;
	}


	public MathEquation(double oprand1, double oprand2, double result, char operator) {
		super();
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
		this.result = result;
		this.operator = operator;
	}
	
	public void result() {
		switch (operator) {
		case '+':
			result =oprand1-oprand2;
		    System.out.println(oprand1+"+"+oprand2+"="+result);
		    break;
		
	case '-':
		result =oprand1-oprand2;
		System.out.println(oprand1+"-"+oprand2+"="+result);
	    break;
	case '*':
		result =oprand1*oprand2;
		System.out.println(oprand1+"*"+oprand2+"="+result);
	    break;
	case '/':
		result =oprand1/oprand2;
		System.out.println(oprand1+"/"+oprand2+"="+result);
	    break;
	}
	}
	
		
	

	public String toString() {
		return "MathEquation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}

	public double getOprand1() {
		return oprand1;
	}

	public void setOprand1(double oprand1) {
		this.oprand1 = oprand1;
	}

	public double getOprand2() {
		return oprand2;
	}

	public void setOprand2(double oprand2) {
		this.oprand2 = oprand2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public char getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}
	 * 
	 */
	
	 /*	
		Create a class called MathEquation 
		add 4 private fields 
			oprand1 , oprand2 , result as double 
			operator as char 

		Encapsulate first 3 fiels 
			with getters and setters
			provide only setter for operator field

		Create no arg constructor 
			just print out message from no Arg 

		create 1 arg constructor 
			set the operator value 

		create 3 args constructor 
			set all 3 fields value 

		create a void instance method with no parameter
			set the result value 
				according to oprand1 oprand2 operator
				if operator is + - * / 
					calculate result 

		Create toString method to return all fields value 

	*/
		
}
