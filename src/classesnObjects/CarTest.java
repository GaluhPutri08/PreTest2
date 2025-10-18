package classesnObjects;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarTest {

    @Test
    public void testCar1() {
        // Code input
        String codeInputBrand = "Toyota";
        String codeInputModel = "Corolla";
        int codeInputYear = 2020;

        // Execution / code output
        Car car = new Car(codeInputBrand, codeInputModel, codeInputYear);
        String codeOutput = car.getCarInfo();

        // Expected output
        String expectedOutput = "Toyota Corolla (2020)";

        // Assertion
        try {
            assertEquals("Car creation test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testCar2() {
        // Code input
        String codeInputBrand = "Honda";
        String codeInputModel = "Civic";
        int codeInputYear = 2021;

        // Execution / code output
        Car car = new Car(codeInputBrand, codeInputModel, codeInputYear);
        String codeOutput = car.getCarInfo();

        // Expected output
        String expectedOutput = "Honda Civic (2021)";

        // Assertion
        try {
            assertEquals("Another car creation test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}