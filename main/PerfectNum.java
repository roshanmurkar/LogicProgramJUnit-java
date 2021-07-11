package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.utility.UPerfectNum;

public class PerfectNum {
	
	public static int getUserInput;
	
	public static final Logger logger=Logger.getLogger("PerfectNumber");

	public static void main(String[] args) {
		
		logger.log(Level.INFO,"Enter number-");
		
		getUserInput=UPerfectNum.getInput();
		
		logger.log(Level.INFO,"user input is -"+getUserInput);
		
		UPerfectNum.displayPerfectOrNot(getUserInput);
		
		
		
	}
}
