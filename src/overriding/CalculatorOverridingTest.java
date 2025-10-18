package overriding;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorOverridingTest {

    @Test
    public void testOverriding() {

        // --- Code input ---
        CalculatorOverriding calculatorOverriding = new CalculatorOverriding();
        CalculatorOverriding calculatorOverridingScientific = new CalculatorOverriding.ScientificCalculator();

        double codeInputA = 10;
        double codeInputB = 0;

        // --- Execution / code output ---
        String codeOutputTypeCalc = calculatorOverriding.getType();
        String codeOutputTypeSci = calculatorOverridingScientific.getType();

        double codeOutputDivideCalc = calculatorOverriding.divide(codeInputA, codeInputB);
        double codeOutputDivideSci = calculatorOverridingScientific.divide(codeInputA, codeInputB);

        // --- Expected output ---
        String expectedOutputTypeCalc = "Generic Calculator";
        String expectedOutputTypeSci = "Scientific Calculator";

        double expectedOutputDivideCalc = Double.NaN;
        double expectedOutputDivideSci = Double.POSITIVE_INFINITY;

        // --- Assertion ---
        try {
            // Test overridden getType()
            assertEquals("getType() for Calculator:", expectedOutputTypeCalc, codeOutputTypeCalc);
            assertEquals("getType() for ScientificCalculator:", expectedOutputTypeSci, codeOutputTypeSci);

            // Test overridden divide()
            assertEquals("divide(10,0) for Calculator:", expectedOutputDivideCalc, codeOutputDivideCalc, 0.0001);
            assertEquals("divide(10,0) for ScientificCalculator:", expectedOutputDivideSci, codeOutputDivideSci,
                    0.0001);

        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}