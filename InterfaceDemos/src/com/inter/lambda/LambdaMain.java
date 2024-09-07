package com.inter.lambda;

public class LambdaMain {

	public static void main(String[] args) {
		ILambda ref=()->System.out.println("Indoor games");
		ref.showGames();
		
		ICheck check=name->System.out.println(name);
		check.validateName("John");
		
		ICheck check1 = username->System.out.println("Welcome "+username);
		check1.validateName("Sri");
		
		IPrinter printer = ()-> {
			return  "Good day";
		};
		System.out.println(printer.showMessage());
		
	    printer = ()->"Great day";
		System.out.println(printer.showMessage());
		
		
		IProduct prod = (x,y)-> x*y;
		System.out.println(prod.multiply(12, 12));
	}

}
