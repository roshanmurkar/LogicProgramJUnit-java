package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import main.utility.UStopWatch;

public class StopWatch {
	public final static Logger logger=Logger.getLogger("StopWatch");
	
	public static void main(String[] args) {
		
		long startTime=(long) (UStopWatch.getTime()/1000.0);
		logger.log(Level.INFO,"Program start time - "+startTime/1000.0);
		
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
		long endTime=(long)(UStopWatch.getTime()/1000.0);
		logger.log(Level.INFO,"end time is -"+endTime/1000.0);
		logger.log(Level.INFO,"program execution time is - "+(endTime-startTime)/1000.0);
		
	}
}
