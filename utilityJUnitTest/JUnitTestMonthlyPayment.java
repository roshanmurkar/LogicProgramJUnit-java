package utilityJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.utility.UMonthlyPayment;

class UtilityMonthlyPayment {

	@Test
	void passTest() {
		double check=UMonthlyPayment.calculatePayment(1236, 15, 30);
		assertEquals(31.267106370146553, check);
	}
	
	@Test
	void failTest() {
		double check=UMonthlyPayment.calculatePayment(1236, 15, 30);
		assertEquals(31.2671, check);
	}

}