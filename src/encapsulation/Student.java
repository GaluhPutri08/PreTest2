package encapsulation;

/**
 * Contoh enkapsulasi:
 * - Field dibuat private
 * - Akses lewat getter/setter terkontrol
 */
public class Student {
    private String name; // disembunyikan (private)
    private int age;     // disembunyikan (private)

    // Konstruktor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter (uji hanya butuh setAge)
    public void setAge(int age) {
        this.age = age;
    }

    // (Opsional) setter name jika diperlukan
    public void setName(String name) {
        this.name = name;
    }
}
