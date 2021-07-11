package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.utility.UPrimeNum;

public class PrimeNum {
	public final static Logger logger=Logger.getLogger("PrimeNumber");
	public static int getUserInput; 
	public static int primeOrNot;
	
	public static void main(String[] args) {

		logger.log(Level.INFO,"Enter no-");
		getUserInput=UPrimeNum.getInput();
		
		logger.log(Level.INFO,"user no is-"+getUserInput);
		primeOrNot=UPrimeNum.checkPrimeNum(getUserInput);
		
		if(primeOrNot==1) {
			logger.log(Level.INFO,getUserInput+"- is a prime number");
		}else {
			logger.log(Level.INFO,getUserInput+" -is not a prime number");
		}

	}
}
