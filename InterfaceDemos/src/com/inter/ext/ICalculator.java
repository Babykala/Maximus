package com.inter.ext;

public interface ICalculator {
	void add(int x, int y);

	void multiply(int x, int y);
	
	default void Diff(int x,int y) {
		System.out.println("Difference "+(x-y));
		check();
	}
	static void process() {
		System.out.println("Calculation");
	}
	
	private void check() {
		System.out.println("checking....");
	}
	

}
