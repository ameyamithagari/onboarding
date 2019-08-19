package com.amdocs;

public class App {
	public static void main(String[] args) {
		RPNCalculatorService rpnWebService = new RPNCalculatorService();
	    RPNCalculator rpnCalculator =rpnWebService.getRPNCalculator();
	    System.out.println("**************");
	    double result = rpnCalculator.evaluate("10 15 +");
	    System.out.println("###################");
	    System.out.println(result);
	}

}
