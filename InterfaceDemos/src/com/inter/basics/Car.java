package com.inter.basics;

public class Car implements Insurance, IAccessories{

	@Override
	public void insurType() {
	 System.out.println("For engine and parts");
	}

	@Override
	public void insurProviders() {
		System.out.println("Voya,star");
	}

	@Override
	public String[] showAccessories() {
		return new String[] {"Music system","car cover","Mobile holder"};
	}
	
	public void showType() {
		System.out.println("Luxury car");
	}

}
