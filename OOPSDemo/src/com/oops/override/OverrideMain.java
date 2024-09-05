package com.oops.override;

public class OverrideMain {
public static void main(String[] args) {
	Vehicle vehicle=new Bike();
	vehicle.getMileage();
	
	Bike bike=(Bike)vehicle;
	bike.showAcc();
	vehicle=new Car();
	vehicle.getMileage();
	
	vehicle=new Lorry();
	vehicle.getMileage();
}
}
