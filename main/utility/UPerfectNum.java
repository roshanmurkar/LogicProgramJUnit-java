package main.utility;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UPerfectNum {

	public static final Logger logger=Logger.getLogger("UPerfectNum");
	public static int getInput() {
		
		Scanner scan = new Scanner(System.in);
		int getUserInput = scan.nextInt();
		return getUserInput;
	}
	
	public static int displayPerfectOrNot(int checkNumber) {
			int add=0;
				for(int i=1;i<checkNumber;i++) {
					if(checkNumber%i==0) 
					{
						logger.log(Level.INFO,"divisor number are -"+i);
						add=add+i;
					}
				}
				if(add==checkNumber) {
					logger.log(Level.INFO,checkNumber+"-is a perfect number ");
				}else {
					logger.log(Level.INFO,checkNumber+"-is not a perfect number ");
				}
				return add;
		
	}
}
