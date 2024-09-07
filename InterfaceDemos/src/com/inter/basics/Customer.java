package com.inter.basics;

public class Customer implements Insurance {

	@Override
	public void insurType() {
		System.out.println("Healthcare");
	}

	@Override
	public void insurProviders() {
		System.out.println("Star,Acko");
	}

}
