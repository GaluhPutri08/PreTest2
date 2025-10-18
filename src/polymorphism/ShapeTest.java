package polymorphism;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ShapeTest {

    @Test
    public void testCircleArea() {
        // Code input
        double codeInputRadius = 1.0;

        // Execution / code output
        Shape shape = new Circle(codeInputRadius); // create Circle object
        double codeOutput = shape.getArea(); // call getArea() method

        // Expected output
        double expectedOutput = Math.PI * codeInputRadius * codeInputRadius;

        // Assertion
        try {
            assertEquals("Circle area test:", expectedOutput, codeOutput, 0.0001);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testRectangleArea() {
        // Code input
        double codeInputWidth = 2.0;
        double codeInputHeight = 3.0;

        // Execution / code output
        Shape shape = new Rectangle(codeInputWidth, codeInputHeight); // create Rectangle object
        double codeOutput = shape.getArea(); // call getArea() method

        // Expected output
        double expectedOutput = codeInputWidth * codeInputHeight;

        // Assertion
        try {
            assertEquals("Rectangle area test:", expectedOutput, codeOutput, 0.0001);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}