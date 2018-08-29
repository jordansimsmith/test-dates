package dates.test;

import dates.Dates;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * SOFTENG 254 2018 Assignment 2 submission
 *
 * Author: (jordan sim-smith, jsim862)
 **/
public class BranchTests {

    /**
     * This test method satisfies the first leap year branch, that the year is divisible by 400.
     * The method also tests that a year earlier than 1753 is deemed invalid, and an IllegalArgumentException is thrown.
     * This test case checks that an IllegalArgumentException is thrown when a date earlier than 1753 is parsed.
     * @throws Exception
     */
    @Test
    public void testDivide400() throws Exception {
        try {
            Dates.dayOfWeek(1600,1,1);
            fail();
        } catch (IllegalArgumentException e) {
            // do nothing
        }
    }

    /**
     * This test method satisfies the second leap year branch, that the year is divisible by 100 but not by 400.
     * The method also tests that a negative month renders the date invalid, and an IllegalArgumentException is thrown.
     * This test case checks that an IllegalArgumentException is thrown when a date with a negative month is parsed.
     * @throws Exception
     */
    @Test
    public void testDivide100() throws Exception {
        try {
            Dates.dayOfWeek(1800, -12,1);
            fail();
        } catch (IllegalArgumentException e) {
            // do nothing
        }
    }

    /**
     * This test method satisfies the third leap year branch, that the year is divisible by 40 but not by 100.
     * The method also tests that a month greater than 12 renders the date invalid, and an IllegalArgumentException is thrown.
     * This test case checks that an IllegalArgumentException is thrown when a date with a month greater than 12 is parsed.
     * @throws Exception
     */
    @Test
    public void testDivide4() throws Exception {
        try {
            Dates.dayOfWeek(2040, 13, 1);
            fail();
        } catch (IllegalArgumentException e) {
            // do nothing
        }
    }

    /**
     * THis test method satisfies the fourth leap year branch, that the year is not divisible by 40, 100 or 400.
     * The method also tests that a date with the day exceeding the month's length is deemed invalid.
     * This test case checks that an IllegalArgumentException is thrown when a day exceeding the month length is parsed.
     * @throws Exception
     */
    @Test
    public void testDivideNot4() throws Exception {
        try {
            Dates.dayOfWeek(1853, 11,31);
            fail();
        } catch (IllegalArgumentException e) {
            // do nothing
        }
    }
}
