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

    @Test
    public void testAddMoreThanTwoNumbers(){
        int expected = 55;
        int actual = calculator.Add("1,2,3,4,5,6,7,8,9,10");

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithNewLineSep(){
        int expected = 6;
        int actual = calculator.Add("1\n2,3");

        assertEquals(expected, actual);
    }

    @Test
    public void testAddWithDifferentDelimiters(){
        int expected = 3;
        int actual = calculator.Add("//;\n1;2");

        assertEquals(expected, actual);
    }
}
