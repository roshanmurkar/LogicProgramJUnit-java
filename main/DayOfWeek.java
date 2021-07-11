package main;

import main.utility.UDayOfWeek;

public class DayOfWeek {
	public static void main(String[] args) {
		
		int y=0,m=0,d=0;
		
		d = Integer. parseInt(args[0]);
		m = Integer. parseInt(args[1]);		
		y = Integer. parseInt(args[2]);
		UDayOfWeek.getday(d,m,y);
		UDayOfWeek.getday(d,m,y);
		
		
	}
}