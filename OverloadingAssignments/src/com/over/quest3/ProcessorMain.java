package com.over.quest3;

public class ProcessorMain {
	public static void main(String[] args) {
		Processor processor=new Processor();
		processor.calculate(2);
		processor.calculate(64.0);
		processor.calculate(12.5, 0.5);
		processor.calculate(3.0, 2);
		processor.calculate(35, 10);
	}

}
