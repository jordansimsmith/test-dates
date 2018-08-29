package dates.test;

import dates.Dates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
     * This test method satisfies the fourth leap year branch, that the year is not divisible by 40, 100 or 400.
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

    /**
     * This test method satisfies the branch logic where there the 30th day of february in a leap year is attempted.
     * This is an invalid date as february only has 29 days in a leap year.
     * The test case checks that an IllegalArgumentException is thrown when the 30th of february is parsed in a leap year.
     * @throws Exception
     */
    @Test
    public void testFebruaryLeapYear30Days() throws Exception {
        try {
            Dates.dayOfWeek(2000, 2,30);
            fail();
        } catch (IllegalArgumentException e) {
            // do nothing
        }
    }

    /**
     * This test method executes the branch where a valid day on a february leap year is inputted.
     * The dayOfWeek() method should correctly identify that this date is a Tuesday.
     * This test case checks that this date is found to be valid (no exceptions thrown) and that the correct date is returned.
     * @throws Exception
     */
    @Test
    public void testValidFebruaryDateLeapYear() throws Exception {
        Dates.Day day = Dates.dayOfWeek(2000, 2, 1);

        assertEquals(Dates.Day.Tuesday, day);
    }

    /**
     * This test method executes the branch where valid day on a non leap year is inputted.
     * The dayOfWeek() method should correctly identify that this date is a Saturday.
     * This test case checks that the date is found to be valid (no exceptions thrown) and that the correct date is returned.
     * @throws Exception
     */
    @Test
    public void testValidNonLeapYearDay() throws Exception {
        Dates.Day day = Dates.dayOfWeek(1999, 6, 19);

        assertEquals(Dates.Day.Saturday, day);
    }

}
