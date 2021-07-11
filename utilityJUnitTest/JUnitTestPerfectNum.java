package utilityJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.utility.UPerfectNum;


class UPerfectNumber {

	@Test
	void PassTest() {
		int check=UPerfectNum.displayPerfectOrNot(28);
		assertEquals(28, check);
	}
	
	@Test
	void FailTest() {
		int check=UPerfectNum.displayPerfectOrNot(28);
		assertEquals(14, check);
	}


}
