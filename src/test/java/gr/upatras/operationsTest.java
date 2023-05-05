package gr.upatras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class operationsTest {
    @Test
    public void testSubtraction() {
        assertEquals("positive", operations.subtraction(5, 3));
        assertEquals("negative", operations.subtraction(3, 5));
        assertEquals("zero", operations.subtraction(5, 5));
    }
}

