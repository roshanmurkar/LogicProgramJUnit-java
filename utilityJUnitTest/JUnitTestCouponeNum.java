package utilityJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.utility.UCouponeNum;

class UtilityTestCaseForCoupon {

	@Test
	void passtest() {
		int check=UCouponeNum.checkForCards(6);
		assertEquals(10, check);
	}
	
	@Test
	void failtest() {
		int check=UCouponeNum.checkForCards(6);
		assertEquals(10, check);
	}

}
