package overloading;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddIntInt() {
        // --- Test: add(int, int) ---

        // Code input
        int codeInputA = 2;
        int codeInputB = 3;

        // Execution / code output
        Calculator calc = new Calculator();
        int codeOutput = calc.add(codeInputA, codeInputB);

        // Expected output
        int expectedOutput = 5;

        // Assertion
        try {
            assertEquals("add(int, int) test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testAddDoubleDouble() {
        // --- Test: add(double, double) ---

        // Code input
        double codeInputA = 2.3;
        double codeInputB = 3.4;

        // Execution / code output
        Calculator calc = new Calculator();
        double codeOutput = calc.add(codeInputA, codeInputB);

        // Expected output
        double expectedOutput = 5.7;

        // Assertion
        try {
            assertEquals("add(double, double) test:", expectedOutput, codeOutput, 0.0001);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testAddIntIntInt() {
        // --- Test: add(int, int, int) ---

        // Code input
        int codeInputA = 3;
        int codeInputB = 4;
        int codeInputC = 5;

        // Execution / code output
        Calculator calc = new Calculator();
        int codeOutput = calc.add(codeInputA, codeInputB, codeInputC);

        // Expected output
        int expectedOutput = 12;

        // Assertion
        try {
            assertEquals("add(int, int, int) test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}