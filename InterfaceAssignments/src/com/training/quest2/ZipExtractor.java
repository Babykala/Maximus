package com.training.quest2;

public class ZipExtractor implements IExtractor {

	@Override
	public void extractFiles(String... fileNames) {
		System.out.println("Extracting zip");
		for (String name : fileNames) {
			System.out.println(name);
		}
	}

}
