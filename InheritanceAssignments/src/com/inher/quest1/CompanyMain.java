package com.inher.quest1;

public class CompanyMain {
public static void main(String[] args) {
	Project project=new TeamOne();
	project.doTask();
	
	TeamOne teamOne=(TeamOne)project;
	teamOne.softwaresUsed("ecillpse","maven","jenkins");
	
	project=new TeamTwo();
	project.doTask();
	
	TeamTwo teamTwo=(TeamTwo)project;
	String[] technologies=teamTwo.getTechStack();
	for (String tech : technologies) {
		System.out.println("Technology used: "+tech);
	}
}
}
