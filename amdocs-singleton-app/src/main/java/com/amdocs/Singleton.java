package com.amdocs;

import java.lang.ref.WeakReference;

public class Singleton {
	private static WeakReference<Singleton> instance;

	private Singleton() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public synchronized static Singleton getInstance() {
		if(instance==null)
			instance =new WeakReference<Singleton>(new Singleton());
		return instance.get()  ;
		
	}
	public static void main(String args[]) {
		Singleton instance1= Singleton.getInstance();
		Singleton instance2= Singleton.getInstance();
		
		if (instance1==instance2)
			System.out.println("both object ar same");
		else
			System.out.println("both object are different");
	}
}
