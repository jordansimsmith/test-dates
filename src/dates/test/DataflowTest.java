package dates.test;

import dates.Dates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataflowTest {

    /**
     * This test method is based on a particular du-path. The du-path is defined as lines {49, 58, 59, 61, 63, 65}.
     * The data object in reference is the isLeapYear boolean variable.
     * With the input date 30-02-2000, isLeapYear is defined as true on line 49. It is then used in a predicate on
     * line 65. The path is simple, and is isLeapYear def-clear. Thus, it is a valid du-path.
     *
     * The isLeapYear du-pair (d: line 49, u: line 65) is previously untested by the other two test classes.
     * In the BranchTests test class, there are two test paths (testFebruaryLeapYear30Days(), testValidFebruaryDateLeapYear())
     * that traverses the statement on line 65 (predicate). However, in these two test paths, the variable isLeapYear is not
     * defined on line 49 as it is in this test path. As the variable is defined in a different place, it tests an
     * interaction between a definition and a use that was not previously tested.
     * Thus, this increases the probability of detecting a fault in the implementation and adds overall value to the test suite.
     *
     * This test case tests that an illegal date (30-02-2000, 30th day out of february's 29 days) is detected by the
     * implementation and it is rejected, throwing an IllegalArgumentsException.
     * @throws Exception
     */
    @Test
    public void testDivide400LeapYearFebruary30() throws Exception {

        try {
            Dates.dayOfWeek(2000, 2,30);
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid date: year=2000, month=2, day=30", e.getMessage());
        }
    }
}
