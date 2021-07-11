package utilityJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.utility.UTempConversion;

class UtilityTestCaseForTempConversion {

	@Test
	void passTest() {
		double result=UTempConversion.convert(1.0, 19);
		assertEquals(51, result);
	}
	
	@Test
	void failTest() {
		double result=UTempConversion.convert(1.0, 19);
		assertEquals(51, result);
	}

	

}
