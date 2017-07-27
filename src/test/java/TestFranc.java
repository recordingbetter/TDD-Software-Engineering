import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestFranc {
    @Test
    public void testMultiplication1() {
        Franc five = new Franc(5);
        // Franc product = five.times(2);
        // assertTrue(new Franc(10).equals(product));
        five.times(2);
        assertEquals(10, five.amount);
    }
}
