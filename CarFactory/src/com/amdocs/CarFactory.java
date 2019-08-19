package com.amdocs;

public class CarFactory {
	public static Icar getCar (String typeOfCar) {
		Icar car= null;
		if( typeOfCar.equals("Maruti800")){
			car= new Maruti800();
		}
		else if( typeOfCar.equals("AudiQ7")){
			car= new AudiQ7();
		}
		else
			car= new NullCar();
		return car;
		}
}
