package abstractClass;
/**
 * SUBCLASS KONKRET: Dog
 * ---------------------
 * - "extends Animal" artinya mewarisi kontrak dari Animal.
 * - WAJIB meng-override makeSound(String).
 *
 * Konsep: INHERITANCE + POLYMORPHISM
 * Objek Dog bisa dirujuk sebagai tipe Animal (Animal animal = new Dog()).
 * Saat makeSound dipanggil lewat referensi Animal, method Dog yang dijalankan
 * (dynamic dispatch).
 */
public class Dog extends Animal {

    @Override
    public String makeSound(String name) {
        return name + " says Woof!";
    }
}