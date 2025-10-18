package classRelationships;

/**
 * Superclass dasar yang menyimpan nama.
 * Employee mewarisi (inherit) getName() dari sini.
 */
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    /** Method yang akan diwarisi oleh subclass. */
    public String getName() {
        return name;
    }
}