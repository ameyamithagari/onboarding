package com.amdocs;
import java.util.Scanner;

public class Main {
	
	public static int getChoice() {
		System.out.println("enter your choice");
		Scanner scanner=new Scanner(System.in);
		return scanner.nextInt();
	}
	public static void displayMenu() {
		System.out.println("-------------------------------");
		System.out.println("<--------MAIN MENU------------>");
		System.out.println("*******************************");
		System.out.println("HeapSort--------------------->1");
		System.out.println("InsertionSort---------------->2");
		System.out.println("QuickSort-------------------->3");
		System.out.println("Exit------------------------->4");
	}
	
	public static void doWork(int choice) {
		IAlgorithm algorithm= AlgorithmFactory.getAlgorithm(choice);
		algorithm.sort();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		while (choice!=4) {
			displayMenu();
			choice= getChoice();
			if (choice!= 4) doWork(choice);
		}
		System.out.println("Thankyou apllication exited successfully");
	}

}
