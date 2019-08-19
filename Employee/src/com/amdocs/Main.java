package com.amdocs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAddress address =new EmployeeAddress("404", "MG", "Mumbai" ,"401334");
		Employee sharma= new Employee(
											"sharma", 
											"SME", 
											"Sales" , 
											address	
		); 
		System.out.println(sharma.getDetails());
	}

}
