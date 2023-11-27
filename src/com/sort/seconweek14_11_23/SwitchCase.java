package com.sort.seconweek14_11_23;

public class SwitchCase 
{
	//switch case
	public static void switchMethod() {
		int number=5;
		switch(number) {
		case 1:System.out.println("monday");
		break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("wednesday");
		break;
		case 4:System.out.println("thursday");
		break;
		case 5:System.out.println("friday");
		break;
		case 6:System.out.println("saturday");
		break;
		case 7:System.out.println("sunday");
		break;
		default:System.out.println("invalid day");
		}
	}
	//switch case inside the for loop
	public static  void switchInsideFor() {
		for(int value=1;value<=10;value++) {
			switch(value) {
			case 1:System.out.println("monday");
			case 2:System.out.println("tuesday");
			case 3:System.out.println("wednesday");
			case 4:System.out.println("thursday");
			case 5:System.out.println("friday");
			case 6:System.out.println("saturday");
			case 7:System.out.println("sunday");
			default:System.out.println("invalid day");
			}
			}
	}
	//switch case inside the for loop with break keyword
	public static  void switchInsideForWithBreak() {
		for(int value=1;value<=10;value++) {
			switch(value) {
			case 1:System.out.println("monday");
			break;
			case 2:System.out.println("tuesday");
			break;
			case 3:System.out.println("wednesday");
			break;
			case 4:System.out.println("thursday");
			break;
			case 5:System.out.println("friday");
			break;
			case 6:System.out.println("saturday");
			break;
			case 7:System.out.println("sunday");
			break;
			default:System.out.println("invalid day");
			}
			}
	}
	public static void main(String[] args) {
		SwitchCase.switchMethod();
		SwitchCase.switchInsideFor();
		SwitchCase.switchInsideForWithBreak();
	}
	

}
