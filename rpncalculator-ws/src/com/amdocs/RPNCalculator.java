package com.amdocs;

import java.util.Stack;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public class RPNCalculator {
	
	private Stack<Double> numberStack;
	private double firstNumber, secondNumber ,result;
	
	public RPNCalculator() {
		numberStack =new Stack<Double>();
		firstNumber = secondNumber =result =0.0;
		// TODO Auto-generated constructor stub
	}
		
	@WebMethod
	public double evaluate(String rpmMathexpression) {
		// TODO Auto-generated method stub
		String[] rpnTokens =rpmMathexpression.split(" ");
		
		IMathOperation mathOperation =null;
		for (String token :rpnTokens) {
			if (isMathOperator(token)) {
				exctractInputs();
				mathOperation = MathFactory.getObject(token);
				result = mathOperation.evaluate( firstNumber, secondNumber);
				numberStack.push(result);
			}
			else
				 numberStack.push(Double.parseDouble(token));
		}
		//System.out.println(rpmMathexpression.split(""));
		return numberStack.pop();
	}


	private boolean isMathOperator(String token) {
		// TODO Auto-generated method stub
		String mathoperators ="+-*/";
		return mathoperators.contains(token);
	}
	private void exctractInputs() {
		
		secondNumber =numberStack.pop();
		firstNumber =numberStack.pop();
	}

/*
	private void divide() {
		exctractInputs();
		result= firstNumber / secondNumber ;
		numberStack.push(result);
	}


	private void multiply() {
		exctractInputs();
		result= firstNumber * secondNumber ;
		numberStack.push(result);
	}


	private void subtract() {
		exctractInputs();
		
		result= firstNumber - secondNumber ;
		numberStack.push(result);
	}


	private void add() {
		exctractInputs();
		result= firstNumber + secondNumber ;
		numberStack.push(result);
	}


	
	
*/
}
