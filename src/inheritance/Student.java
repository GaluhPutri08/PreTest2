package inheritance;

/**
 * Subclass: Student mewarisi Person dan menambah studentId.
 */
public class Student extends Person {
    private final String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    /** Method tambahan di subclass. */
    public String getStudentId() {
        return studentId;
    }
}
