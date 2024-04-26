package matb02;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ChocolateBarsTest {


    @Test 
    public void checkNoBar() {
        ChocolateBars bar = new ChocolateBars();

        System.out.println(bar.calculate(0, 0, 0) == 0);
    }



    @Test 
    public void checkNoSmallBar() {
        ChocolateBars bar = new ChocolateBars();

        assertEquals(bar.calculate(0, 1, 5), 0);
    }


    @Test 
    public void checkNoBigBar() {
        ChocolateBars bar = new ChocolateBars();

        assertEquals(bar.calculate(1, 0, 1), 1);

    }


    @Test 
    public void checkSmallAndBigBars() {
        ChocolateBars bar = new ChocolateBars();

        assertEquals(bar.calculate(1, 2, 6), 1);

    }
    

    @Test 
    public void checkNoTotal() {
        ChocolateBars bar = new ChocolateBars();

        assertEquals(bar.calculate(1, 2, 0), 0);

    }
}
