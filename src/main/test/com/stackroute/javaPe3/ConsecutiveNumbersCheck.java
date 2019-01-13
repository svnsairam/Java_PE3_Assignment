package com.stackroute.javaPe3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersCheck {
    ConsecutiveNumbers consecutiveNumbers;

    @Before
    public void setUp() throws Exception {
        consecutiveNumbers = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
        consecutiveNumbers = null;
    }

    @Test
    public void consecutiveNumbersSuccess() {
        String expectedValue = "1 2 3 4 5 ";
        String actualValue = consecutiveNumbers.checkConsecutive("1 2 3 4 5");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void consecutiveNumbersNegativeNumbersSuccess() {
        String expectedValue = "-1 -2 -3 -4 -5 ";
        String actualValue = consecutiveNumbers.checkConsecutive("-1 -2 -3 -4 -5");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void consecutiveBothPosiiveAndNegativsSuccess() {
        String expectedValue = "-2 -1 0 1 2 ";
        String actualValue = consecutiveNumbers.checkConsecutive("-2 -1 0 1 2");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void consecutiveNumbersFaliure() {
        String expectedValue = "not consecutive numbers";
        String actualValue = consecutiveNumbers.checkConsecutive("-2 -1 2 4 5");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void consecutiveNumbersInvalidInput() {
        String expectedValue = "Invalid Numbers";
        String actualValue = consecutiveNumbers.checkConsecutive("1 2 3 4 5 3a_abxyz");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void consecutiveNumbersEmptyInput() {
        String expectedValue = "Invalid Numbers";
        String actualValue = consecutiveNumbers.checkConsecutive("");
        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void consecutiveNumberNullInput() {
        String expectedValue = "Null input not expected";
        String actualValue = consecutiveNumbers.checkConsecutive(null);
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertNotNull(actualValue);
    }

    @Test
    public void consecutiveNumberInvalidInput() {
        String expectedValue = "Invalid Numbers";
        String actualValue = consecutiveNumbers.checkConsecutive("$ 1 2 4");
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertNotNull(actualValue);
    }

    @Test
    public void consecutiveNumberInvalidCharecter() {
        String expectedValue = "Invalid Numbers";
        String actualValue = consecutiveNumbers.checkConsecutive("a b c d");
        Assert.assertEquals(expectedValue, actualValue);
        Assert.assertNotNull(actualValue);
    }
}