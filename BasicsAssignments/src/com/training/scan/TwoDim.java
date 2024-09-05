package com.training.scan;

public class TwoDim {
	public static void main(String[] args) {
		String[][] names = new String[][] { { "Priya", "Sneha" }, { "Suba", "Rish", "Sash" }, { "kala", "vino" } };
		String[] newArray = new String[10];
		int i = 0;
		for (String[] oneDim : names) {
			for (String name : oneDim) {
				if (name.startsWith("S")) {
					newArray[i] = name;
					i++;
				}
			}
		}
		for (String string : newArray) {
			System.out.println("Name: " + string);
		}
	}
}
