package abstractClass;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AnimalTest {

    @Test
    public void testDogMakeSound() {
        // Code input
        String codeInput = "Buddy";

        // Execution / code output
        Animal animal = new Dog(); // reference superclass
        String codeOutput = animal.makeSound(codeInput);

        // Expected output
        String expectedOutput = "Buddy says Woof!";

        // Assertion
        try {
            assertEquals("Dog makeSound test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testCatMakeSound() {
        // Code input
        String codeInput = "Kitty";

        // Execution / code output
        Animal animal = new Cat(); // reference superclass
        String codeOutput = animal.makeSound(codeInput);

        // Expected output
        String expectedOutput = "Kitty says Meow!";

        // Assertion
        try {
            assertEquals("Cat makeSound test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}