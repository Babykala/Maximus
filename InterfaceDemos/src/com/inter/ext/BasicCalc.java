package com.inter.ext;

public class BasicCalc implements ICalculator {

	@Override
	public void add(int x, int y) {
		System.out.println("Addition: "+(x+y));
	}

	@Override
	public void multiply(int x, int y) {
		System.out.println("Multiply: "+(x*y));
	}

}
