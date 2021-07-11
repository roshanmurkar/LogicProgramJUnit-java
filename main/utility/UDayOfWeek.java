package main.utility;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UDayOfWeek {
	
	public final static Logger logger=Logger.getLogger("UDayOfWeek");
	
	public static void getday(int d,int m,int y) {
		int x=0;
		y=(y-(14-m))/12;
		x=y+(y/4)-(y/100)+(y/400);
		m=m+(12*((14-m)/12))-2;
		d=(int) ((d+x+((31*m)/12))%7);
		
		switch (d) {
		case 0: {
			logger.log(Level.INFO,"sunday");
			break;
		}
		case 1: {
			logger.log(Level.INFO,"MONDAY");
			break;
		}
		case 2: {
			logger.log(Level.INFO,"TUESDAY");
			break;
		}
		case 3: {
			logger.log(Level.INFO,"WEDNESDAY");
			break;
		}
		case 4: {
			logger.log(Level.INFO,"THURSDAY");
			break;
		}
		case 5: {
			logger.log(Level.INFO,"FRIDAY");
			break;
		}
		case 6: {
			logger.log(Level.INFO,"SATURDAY");
			break;
		}
		
		default:
			logger.log(Level.INFO,"Wrong Input");
		}
	}
}
