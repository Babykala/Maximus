package com.training.quest2;

public class JarExtractor implements IExtractor {

	@Override
	public void extractFiles(String... fileNames) {
		System.out.println("Extracting jar");
		for (String name : fileNames) {
			System.out.println(name);
		}
	}

}
