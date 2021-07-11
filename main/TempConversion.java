package main;

import java.util.logging.Level;
import java.util.logging.Logger;

import main.utility.UTempConversion;

public class TempConversion {
	public final static Logger logger=Logger.getLogger("temperaturConversionCF");
	public static void main(String[] args) {
		
		logger.log(Level.INFO,"Enter degree to convert - ");
		double getInput=UTempConversion.getInput();

		logger.log(Level.INFO," 1-For convert c to f");
		logger.log(Level.INFO," 2-For convert f to c");
		double option=UTempConversion.getInput();

	 	double result=UTempConversion.convert(option,getInput);
	 	logger.log(Level.INFO,"convert value is - "+result);
	}
}
