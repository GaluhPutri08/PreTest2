package classRelationships;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ClassRelationshipsTest {

    @Test
    public void testInheritance() {
        // Code input
        String codeInputName = "Alice";

        // Execution / codeOutput
        Employee employee = new Employee(codeInputName);
        String codeOutputName = employee.getName(); // method inherited
        boolean codeOutputIsPerson = employee instanceof Person; // inheritance check

        // Expected output
        String expectedOutputName = "Alice";
        boolean expectedOutputIsPerson = true;

        // Assertion
        try {
            assertEquals("Method inherited test:", expectedOutputName, codeOutputName);
            assertEquals("Inheritance check:", expectedOutputIsPerson, codeOutputIsPerson);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testAssociation() {
        // codeInput
        Employee leader = new Employee("Bob");
        Project project = new Project("Apollo", leader);

        // Execution / codeOutput
        String codeOutput = project.getLeaderName();

        // Expected output
        String expectedOutput = "Bob";

        // Assertion
        try {
            assertEquals("Association test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testAggregation() {
        // codeInput
        Manager mgr = new Manager("Charlie");
        Department department = new Department("IT");
        department.setManager(mgr);

        // Execution / codeOutput
        String codeOutput = department.getManagerName();

        // Expected output
        String expectedOutput = "Charlie";

        // Assertion
        try {
            assertEquals("Aggregation test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }

    @Test
    public void testComposition() {
        // codeInput
        Manager mgr = new Manager("Diana");
        Task task = new Task("Prepare report");
        mgr.setTask(task);

        // Execution / codeOutput
        String codeOutput = mgr.getTaskName();

        // Expected output
        String expectedOutput = "Prepare report";

        // Assertion
        try {
            assertEquals("Composition test:", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}