package sourceCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class FinancialCalTest {

	@Test
	public void testMonthlyRate() {
		FinancialCal fc = new FinancialCal();
		assertEquals(0.0,fc.calculateMonthlyRate(0, 0, 0));
		assertEquals(0.0,fc.calculateMonthlyRate(-2000, -5, -24));
		assertEquals(87.5,fc.calculateMonthlyRate(1000, 5, 12));	
	}
	
	@Test
	public void testOverallDebt() {
		FinancialCal fc = new FinancialCal();
		assertEquals(0.0, fc.calculateOverallDebt(0, 0, 0));
		assertEquals(0.0, fc.calculateOverallDebt(-2000, -5, -24));
		assertEquals(1050.0, fc.calculateOverallDebt(1000, 5, 12));
	}

}
