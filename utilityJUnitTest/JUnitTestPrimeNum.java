package utilityJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.utility.UPrimeNum;

class UPrimeNumber {

	@Test
	void passTest() {
		int check=UPrimeNum.checkPrimeNum(7);
		assertEquals(1, check);
	}
	
	@Test
	void failTest() {
		int check=UPrimeNum.checkPrimeNum(14);
		assertEquals(1, check);
	}

}
