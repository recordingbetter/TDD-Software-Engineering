import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestCurrency {
    @Test
    public void testMultiplication1() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertTrue(new Dollar(10).equals(product));
        // five.times(2);
        // assertEquals(10, five.amount);
    }

    @Test
    public void testMultiplication2() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(3);
        assertTrue(new Dollar(15).equals(product));
        // five.times(3);
        // assertEquals(15, five.amount);
    }

    @Test
    public void testMultiplication3() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertTrue(new Dollar(10).equals(product));
        product = five.times(3);
        assertTrue(new Dollar(15).equals(product));
        // five.times(2);
        // assertEquals(10, five.amount);
        // five.times(3);
        // assertEquals(15, five.amount);
    }

    @Test
    public void testMultiplication4() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(4)));
    }
}
