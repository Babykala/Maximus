package com.training.quest2;

public class RarExtractor implements IExtractor {

	@Override
	public void extractFiles(String... fileNames) {
		System.out.println("Extracting Rar");
		for (String name : fileNames) {
			System.out.println(name);
		}
	}

}
