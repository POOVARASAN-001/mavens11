package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
.

public class AppTest {
    @Test
    public void testStandardArraySum() {
        App app = new App();
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, app.findArraySum(numbers));
    }

    @Test
    public void testEmptyAndNullArray() {
        App app = new App();
        assertEquals(0, app.findArraySum(new int[]{}));
        assertEquals(0, app.findArraySum(null));
    }

    @Test
    public void testNegativeNumbersSum() {
        App app = new App();
        int[] numbers = {-1, -2, 5, 3};
        assertEquals(5, app.findArraySum(numbers));
    }
}
