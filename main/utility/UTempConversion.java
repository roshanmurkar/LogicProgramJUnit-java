package main.utility;

import java.util.Scanner;

public class UTempConversion {
	
	public static double getInput() {
		Scanner scan = new Scanner(System.in);
		double getUserInput = scan.nextDouble();
		return getUserInput;
	}
	
	public static double convert(double getOption,double getInput) {
		
		double result=0;
		switch ((int)getOption) {
		case 1: {
				result=((getInput*(9/5))+32);
			break;
		}
		case 2: {
				result=((getInput-32)*(5/9));
			break;
		}
		default:
			System.out.println("invalid option");
		}
		return result;
	}
}
