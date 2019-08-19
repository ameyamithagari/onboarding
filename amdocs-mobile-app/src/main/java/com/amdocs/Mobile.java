package com.amdocs;

public class Mobile {
	
	private Camera camera;
	
	public Mobile() {
		camera= new Camera();
	}
	
	public Mobile(Camera camera) {
		this.camera= camera;
	}

	public boolean startphotoApp() {
		// TODO Auto-generated method stub
		System.out.println("inside start photo app method");
		
		if (camera.on()) {
			System.out.println("positive code path");
			System.out.println("Assume some hardware interaction happens here");
			return true;
		}
		System.out.println("negativ ecode path");
		System.out.println("Assume some exceptio handling");
		return false;
	}

}
