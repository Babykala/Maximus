package com.inter.basics;

public class InterMain {

	public static void main(String[] args) {
		Insurance insurance=new Car();
		insurance.insurType();
		insurance.insurProviders();
		
		IAccessories accessories=(IAccessories)insurance;
		String[] arr=accessories.showAccessories();
		for (String acc : arr) {
			System.out.println(acc);
		}
		Car car=(Car)accessories;
		car.showType();
		
		insurance=new Customer();
		insurance.insurType();
		insurance.insurProviders();
		
		
		
	}

}
