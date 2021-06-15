import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @Before
    public void setUp() {
        calculator = new StringCalculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAddEmptyString() {
        int expected = 0;
        int actual = calculator.Add("");

        assertEquals(expected, actual);
    }

    @Test
    public void testAddOneNumber() {
        int expected = 1;
        int actual = calculator.Add("1");

        assertEquals(expected, actual);
    }

    @Test
    public void testAddTwoNumber() {
        int expected = 3;
        int actual = calculator.Add("1,2");

        assertEquals(expected, actual);
    }
}