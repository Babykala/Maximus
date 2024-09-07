package com.training.quest2;

public class FileDemo {

	public static void main(String[] args) {
		IExtractor extractor=new ZipExtractor();
		extractor.extractFiles("a.txt","b.txt");
		
		extractor=new JarExtractor();
		extractor.extractFiles("a.txt","b.txt");
		
		extractor=new RarExtractor();
		extractor.extractFiles("a.txt","b.txt");
		
	}

}
