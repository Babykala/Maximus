package com.abs.quest1;

public class AbsMain {
public static void main(String[] args) {
	Employee employee=new Manager("Priya",50000,10101,"Sports");
	employee.calcBonus(1500.0);
	employee.showProjects();
	Manager manager=(Manager)employee;
	manager.funClub();
	
	TeamLead teamLead=(TeamLead)employee;
	teamLead.corporateServices();
	
	employee=new Developer("Priya",50000,10101,"music","dance");
	employee.calcBonus(1000.0);
	employee.showProjects();
	Developer developer=(Developer)employee;
	developer.printHobbies();
	
	
	
	
	
	
}
}
