package com.inter.ext;

public class CalcMain {

	public static void main(String[] args) {
		ICalculator calculator=new BasicCalc();
		calculator.add(24, 12);
		calculator.multiply(12, 10);
		
		IScientificCalc scientificCalculator=new ScientificCalc();
		scientificCalculator.add(25, 12);
		scientificCalculator.multiply(10, 10);
		scientificCalculator.sqrt(3);
		scientificCalculator.cube(3);
		
		calculator.Diff(30, 10);
		ICalculator.process();
	}

}
