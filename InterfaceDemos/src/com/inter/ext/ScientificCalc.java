package com.inter.ext;

public class ScientificCalc extends BasicCalc implements IScientificCalc {

	@Override
	public void sqrt(int x) {
		System.out.println("Square root: "+Math.sqrt(x));
	}

	@Override
	public void cube(int x) {
		System.out.println("Cube: "+Math.pow(x,3));
	}

}
