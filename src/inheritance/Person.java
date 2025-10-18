package inheritance;

/**
 * Superclass: menyimpan name dan age, serta menyediakan getInfo().
 */
public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** Mengembalikan format "Name (X years old)". */
    public String getInfo() {
        return name + " (" + age + " years old)";
    }

    // (opsional) getter
    public String getName() { return name; }
    public int getAge() { return age; }
}
