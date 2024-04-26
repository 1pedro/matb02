package matb02;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class LeapYearTest {
    
	
	@Test
	public void checkLeapYear() {
		assertTrue(new LeapYear().isLeapYear(2024));
	}


    @Test
	public void checkNotLeapYear() {
		assertFalse(new LeapYear().isLeapYear(2023));
	}

    @Test 
    public void checkDivisibleBy400() {
        assertTrue(new LeapYear().isLeapYear(400));

    }

    @Test 
    public void checkDivisibleBy100() {
        assertFalse(new LeapYear().isLeapYear(100));
    }
	

    @Test 
    public void checkDivisibleBy4() {
        assertTrue(new LeapYear().isLeapYear(4));
    }
		
}
