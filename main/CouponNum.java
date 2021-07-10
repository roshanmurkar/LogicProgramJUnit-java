package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.utility.UtilityForCouponeNum;


public class CouponNum {
	public static Logger logger=Logger.getLogger("CouponNumber");
	public static int getUserInput;
	public static int getRandomNumber;
	
	public static void main(String[] args) {
		
		logger.log(Level.INFO,"Enter no - ");
		getUserInput=UtilityForCouponeNum.getInput();
		
		getRandomNumber=UtilityForCouponeNum.checkForCards(getUserInput);
		logger.log(Level.INFO,"coupon no - "+getRandomNumber);
		
		
	}	
}