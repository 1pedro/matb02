package matb02;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class LeapYearTest {
	
	@Test
	public void checkLeapYear() {
		assertTrue(LeapYear.isLeapYear(2024));
	}


    @Test
	public void checkNotLeapYear() {
		assertFalse(LeapYear.isLeapYear(2023));
	}

    @Test 
    public void checkDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(400));
        assertTrue(LeapYear.isLeapYear(800));
        assertTrue(LeapYear.isLeapYear(1200));
        assertTrue(LeapYear.isLeapYear(1600));
    }

    @Test 
    public void checkDivisibleBy100() {
        assertFalse(LeapYear.isLeapYear(100));
        assertFalse(LeapYear.isLeapYear(1000));
    }
	

    @Test 
    public void checkDivisibleBy4() {
        assertTrue(LeapYear.isLeapYear(4));
        assertTrue(LeapYear.isLeapYear(8));
    }
		
}
