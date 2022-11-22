package com.lemon.controlflow;
import java.util.Scanner;	


public class Control_Flow_Practice {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		lessThanTen();
		lessThanTenElse();
		inRange();
		rangeFinder();
		inputGrades();
		daysOfTheWeek();
		taxCalculator();
	}
	
	public static void lessThanTen() {
		int x = 7;
		
		if ( x <= 10) {
			System.out.println("Less than 10"); 
		}
	}
	
	public static void lessThanTenElse() {
		int x = 15;
		if (x <= 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("Greater than 10");
		}
		
	 }
	
	public static void inRange() {
		int x = 15;
		if (x <= 10) {
			System.out.println("Less than 10");
		} else if (x >= 10 && x <= 20) {
			System.out.println("In Range");
			} else {
			System.out.println("Less than 10");
			}
	}
	
	public static void rangeFinder() {
		int x = 5;
		 if (x <= 10 || x >= 20) {
			 System.out.println("Out of Range"); 
		 } else {
			 System.out.println("In Range");
		 }
	}
	
	public static void inputGrades() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your grade here: ");
		String rawStudentGrade = (input.nextLine()); 
		int studentGrade = Integer.parseInt(rawStudentGrade);
		if (studentGrade >= 90) {
			 System.out.println("You got an 'A'!"); 
		} else if (studentGrade >= 80 && studentGrade <=89) {
			System.out.println("You got an 'B'!");
		} else if (studentGrade >= 70 && studentGrade <=79) {
			System.out.println("You got an 'C'!");
		} else if (studentGrade >= 60 && studentGrade <=69) {
			System.out.println("You got an 'D'!");
		} else {
			System.out.println("You got an 'F'!");
		}
		
	}
	
	public static void daysOfTheWeek() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter which day of the week here: ");
		String nameOfDay; 
		String dayOfWeek =(input.nextLine()); 
		int date = Integer.parseInt(dayOfWeek);
		switch (date) {
		case 1: nameOfDay = "Sunday"; 
		break; 
		case 2: nameOfDay = "Monday"; 
		break; 
		case 3: nameOfDay = "Tuesday"; 
		break;
		case 4: nameOfDay = "Wednesday"; 
		break;
		case 5: nameOfDay = "Thursday"; 
		break;
		case 6: nameOfDay = "Friday"; 
		break;
		case 7: nameOfDay = "Saturday"; 
		break; 
		default: nameOfDay = "Out of Range"; 
		break; 
		}
		System.out.println("Today is: " + nameOfDay);
	}
	
	public static void taxCalculator() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your personal income here: ");
		String personalIncome =(input.nextLine());
		int income = Integer.parseInt(personalIncome);	
		
		System.out.println("Please enter your filing status: ");
		String filingStatus = (input.nextLine());
		String single = "Single";
		String jointMarried = "Married";
		String seperateMarried = "Married Filing Seperately";
		String headOfHousehold = "Head of Household";
		String taxRate; 
		
		if (filingStatus.equals(single)) {
			if (income >= 8350) {
				System.out.println("Your tax rate is 10%");
			} else if (income >=8351 && income <=33950) {
				System.out.println("Your tax rate is 15%"); 
			}else if (income >=33951 && income <=171550) {
				System.out.println("Your tax rate is 25%");
			}else if (income >=82251 && income <=82250) {
				System.out.println("Your tax rate is 28%");
			}else if (income >=171551 && income <=372950) {
				System.out.println("Your tax rate is 33%");
			}else if (income >=372951) {
				System.out.println("Your tax rate is 35%");
			}
		}else if (filingStatus.equals(jointMarried)) {
			if (income >= 16700) {
				System.out.println("Your tax rate is 10%");
			} else if (income >=16701 && income <=67900) {
				System.out.println("Your tax rate is 15%"); 
			}else if (income >=67901 && income <=137050) {
				System.out.println("Your tax rate is 25%");
			}else if (income >=137051 && income <=208850) {
				System.out.println("Your tax rate is 28%");
			}else if (income >=208851 && income <=372950) {
				System.out.println("Your tax rate is 33%");
			}else if (income >=372951) {
				System.out.println("Your tax rate is 35%");
			}
		}else if (filingStatus.equals(seperateMarried)) {
			if (income >= 8350) {
				System.out.println("Your tax rate is 10%");
			} else if (income >=8351 && income <=33950) {
				System.out.println("Your tax rate is 15%"); 
			}else if (income >=33951 && income <=68525) {
				System.out.println("Your tax rate is 25%");
			}else if (income >=68526 && income <=104425) {
				System.out.println("Your tax rate is 28%");
			}else if (income >=104426 && income <=186475) {
				System.out.println("Your tax rate is 33%");
			}else if (income >=186476) {
				System.out.println("Your tax rate is 35%");
			}	
	}else if (filingStatus.equals(headOfHousehold)) {
		if (income >= 11950) {
			System.out.println("Your tax rate is 10%");
		} else if (income >=11951 && income <=45500) {
			System.out.println("Your tax rate is 15%"); 
		}else if (income >=45501 && income <=117450) {
			System.out.println("Your tax rate is 25%");
		}else if (income >=117451 && income <=190200) {
			System.out.println("Your tax rate is 28%");
		}else if (income >=190201 && income <=372950) {
			System.out.println("Your tax rate is 33%");
		}else if (income >=372951) {
			System.out.println("Your tax rate is 35%");
		}
	}
	}
}
	

