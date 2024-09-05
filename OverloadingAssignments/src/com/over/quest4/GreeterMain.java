package com.over.quest4;

public class GreeterMain {
public static void main(String[] args) {
	Greeter obj=new Greeter("Priya");
	obj.greetUser("Welcome","Great day");
	obj.greetUser("Welcome","Great day","Enjoy learning");
	
	Greeter obj1=new Greeter();
	obj1.sayHello("Priya","Divya");
	obj1.sayHello("Priya","Divya","Rish","Sash");
}
}

