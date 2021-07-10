package main;

import main.utility.UtilityForDayOfWeek;

public class DayOfWeek {
	public static void main(String[] args) {
		
		int y=0,m=0,d=0;
		
		d = Integer. parseInt(args[0]);
		m = Integer. parseInt(args[1]);		
		y = Integer. parseInt(args[2]);
		UtilityForDayOfWeek.getday(d,m,y);
		UtilityForDayOfWeek.getday(d,m,y);
		
		
	}
}