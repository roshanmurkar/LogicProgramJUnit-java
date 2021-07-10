package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.utility.UtilityForFibo;


public class Fibonacci {
	private final static Logger logger = Logger.getLogger("FabonacciSeries");
	public static void main(String[] args) {
		logger.log(Level.INFO,"Hello ");
		int firstNumber=0,secondNumber=1,nextNumber=0,i;
		
		
		 int getUserInput = UtilityForFibo.getInput(); 
		 System.out.print(firstNumber+" "+secondNumber); 
		 UtilityForFibo.printFabonic(getUserInput,firstNumber,secondNumber,nextNumber);  
	}
}
