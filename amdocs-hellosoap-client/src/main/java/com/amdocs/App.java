package com.amdocs;

public class App {
	public static void main(String[] args) {
		HelloService hello =new HelloService();
		
		Hello service = hello.getHello(); 
		
		System.out.println(service.sayHello());
	}
}
