package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.utility.URevNum;

public class RevNum {
	
	public static final Logger logger=Logger.getLogger("RevNum");
	
	public static int getUserInput;
	public static int getReverseNumber;
	public static void main(String[] args) {
	
	//getting user input	
	logger.log(Level.INFO,"enter number -");
	getUserInput=URevNum.getInput();	
	
	//reversing number
	getReverseNumber=URevNum.reverseNumber(getUserInput);
	logger.log(Level.INFO,"Reverse number -"+getReverseNumber);
	
	
		
	}
}
