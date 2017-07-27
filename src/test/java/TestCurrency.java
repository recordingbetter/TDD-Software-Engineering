import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCurrency {
    @Test
    public void testMultiplication1() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

    @Test
    public void testMultiplication2() {
        Dollar five = new Dollar(5);
        five.times(3);
        assertEquals(15, five.amount);
    }

    @Test
    public void testMultiplication3() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
        five.times(3);
        assertEquals(15, five.amount);
    }
}
