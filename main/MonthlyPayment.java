package main;

import main.utility.UtilityForMonthlyPayment;

public class MonthlyPayment {
	public static void main(String[] args) {
		double P = Integer. parseInt(args[0]);
		double Y = Integer. parseInt(args[1]);		
		double R = Integer. parseInt(args[2]);
		
		System.out.println(UtilityForMonthlyPayment.calculatePayment(P, Y, R));
		
	}
}
