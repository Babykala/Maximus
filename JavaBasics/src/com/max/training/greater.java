package com.max.training;

public class greater {
	public static void main(String[] args) {
		int x=100;
		int y=200;
		int z=300;
		boolean a=x>y && x>z;
		boolean b=x<y || y==z;
		String res=(x>y)?"x is greater":"y is greater";
		System.out.println(a);
		System.out.println(b);
		System.out.println(res);
	}

}
