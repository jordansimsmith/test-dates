package dates.test;

import dates.Dates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EquivalenceTest {

    /**
     * Input Domain Modelling into Equivalence classes is difficult due to nature of the inputs.
     * We can partition each individual input into classes, and then extrapolate these classes across
     * the classes from the other inputs to receive all input partition combinations. These combinations will be the
     * Equivalence classes for our input space.
     *
     * Year: A year is invalid if it is less than 1753 and valid otherwise. We can form two partitions from this
     * specification: y1: year < 1753  no leap year, y2: year >= 1753 no leap year, y3: year < 1753 leap year, y4: year >= 1753 leap year.
     *
     * Month: The valid range for a month is between 1 and 12 (1 <= month <= 12). From this, we can form three partitions:
     * m1: month < 1, m2: 1 <= month <= 12, m3: month > 12.
     *
     * Day: The valid range for a day depends on the particular month. However, we can still form three partitions:
     * d1: day < 0, d2: 1 <= day <= MAX_DAY_FOR_MONTH, d3: day > MAX_DAY_FOR_MONTH.
     *
     * Each combination of (y,m,d) from the described partitions forms an equivalence class.
     *
     * The equivalence class that this test is based on is (y1, m1, d1). (all less than their legal range).
     * This equivalence class has not been covered before by tests in the other two classes.
     *
     * Other test cases are from the classes {(y3,m2,d2), (y2,m1,d2), (y4,m3,d2), (y2,m2,d3), (y4,m2,d3), (y4,m2,d2), (y2,m2,d2), (y4,m2,d3)}
     * Thus this class is not already tested by other the other test cases.
     *
     * This test case should throw an IllegalArgumentException as more than one of the inputs (all 3) are invalid.
     * @throws Exception
     */
    @Test
    public void testAllLessThanLegalRange() throws Exception {
        try{
            Dates.dayOfWeek(1, -1, -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid date: year=1, month=-1, day=-1", e.getMessage());
        }
    }
}
