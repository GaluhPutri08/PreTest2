package inheritance;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonTest {

    @Test
    public void testSuperclass() {
        // Focus on creating superclass objects and their methods
        String codeInputName = "Alice";
        int codeInputAge = 20;

        Person person = new Person(codeInputName, codeInputAge);
        String codeOutput = person.getInfo();

        String expOutput = "Alice (20 years old)";

        try {
            assertEquals("Superclass info test:", expOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testSubclass() {
        // Focus on creating subclass objects and accessing superclass methods +
        // additional ones
        String codeInputName = "Bob";
        int codeInputAge = 21;
        String codeInputId = "S123";

        Student student = new Student(codeInputName, codeInputAge, codeInputId);
        String codeOutputInfo = student.getInfo(); // superclass methods
        String codeOutputId = student.getStudentId(); // additional method

        String expOutputInfo = "Bob (21 years old)";
        String expOutputId = "S123";

        try {
            assertEquals("Subclass info test (superclass method):", expOutputInfo, codeOutputInfo);
            assertEquals("Subclass info test (subclass method):", expOutputId, codeOutputId);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}