package utilityJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.utility.URevNum;

class UReverseNumber {

	@Test
	void passTest() {
		int check=URevNum.reverseNumber(123);
		assertEquals(321, check);
	}
	
	@Test
	void failTest() {
		int check=URevNum.reverseNumber(123);
		assertEquals(123, check);
		
	}

}
