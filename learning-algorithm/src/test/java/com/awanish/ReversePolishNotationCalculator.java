package com.awanish;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class ReversePolishNotationCalculator {
	 
	
	public static double evaluate(String expr) {
		if(expr==null || expr==""){
			   return 0 ;
		 }
	   String [] inputArray = expr.split(" ");
	   Stack<Double> st = new Stack<Double>();
	 
	   double result = 0 ;
	   for (String ch:inputArray){
		   
		    if(!isOprend(ch)){
               st.push(Double.parseDouble(ch));
		    }else if(isOprend(ch)){
		    	
		    	Double secondOperand = st.pop();
		    	Double firstOperend= st.pop() ;	
		    	st.push(calculate(firstOperend,secondOperand, ch.charAt(0)));
		    	
		    }
		   
	   }
		
		
	    return st.pop();
	  }
	
	 private static Double calculate( Double firstOperend,Double secondOperand, char ch) {
		 
		 switch(ch){
		 case '+': 
			   return  secondOperand+firstOperend ;
		 case '-': 
			   return firstOperend-secondOperand ;
		 case '*': 
			   return secondOperand*firstOperend ;
		 case '/': 
			   return firstOperend/secondOperand ;
		 
		 }
		// TODO Auto-generated method stub
		return 0d;
	}

	private static boolean isOprend(String ch){
		 
		return ch.equals("*") || ch.equals("+") || ch.equals("-")||ch.equals("/");
	 }
	
	
	 @Test
	  public void shouldWorkWithEmptyString() {
	      assertEquals("Should work with empty string", 0, evaluate(""), 0);
	  }
	  
	  @Test
	  public void shouldParseNumbers() {
	      assertEquals("Should parse numbers", 3, evaluate("3"), 0);
	      
	  }

	  @Test
	  public void shouldParseFloatNumbers() {
	      assertEquals("Should parse float numbers", 3.5, evaluate("3.5"), 0);
	  }

	  @Test
	  public void shouldSupportAddition() {
	      assertEquals("Should support addition", 4, evaluate("1 3 +"), 0);
	  }

	  @Test
	  public void shouldSupportMultiplication() {
	      assertEquals("Should support multiplication", 3, evaluate("1 3 *"), 0);
	  }

	  @Test
	  public void shouldSupportSubstraction() {
	      assertEquals("Should support substraction", -2, evaluate("1 3 -"), 0);
	  }

	  @Test
	  public void shouldSupportDivision() {
	      assertEquals("Should support division", 2, evaluate("4 2 /"), 0);
	  }

}
