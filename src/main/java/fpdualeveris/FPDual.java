package fpdualeveris;

import variables.Developer;

public class FPDual {

	public static void main(String[] args) {
		
		variablesChallenge();
		
	}
	
	@SuppressWarnings("static-access")
	private static void variablesChallenge() {
		
		System.out.println("Num Max Developers: " + Developer.getNummaxemployees());
		System.out.println("Num Max Holydays: " + Developer.getNummaxholydays());
		
		Developer d1 = new Developer("fernando");
		System.out.println("ID: " + d1.getIdEmployees() + " Name: " + d1.getName());
		
		
		Developer d2 = new Developer("papo");
		System.out.println("ID: " + d2.getIdEmployees() + " Name: " + d2.getName() + " From: " + d2.getBusinessref());

		
		Developer d3 = new Developer("saulo");
		d3.discountHolidays(20);
		System.out.println("ID: " + d3.getIdEmployees() + " Name: " + d3.getName() + "  Num Holydays: " + d3.getNumHolidays());
		
		
		Developer d4 = new Developer("samuel");
		d4.discountHolidays(19);
		d4.discountHolidays(3);
		System.out.println("ID: " + d4.getIdEmployees() + " Name: " + d4.getName() + "  Num Holydays: " + d4.getNumHolidays());
		
		
		
	}
}
