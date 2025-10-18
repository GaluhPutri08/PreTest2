package abstractClass;
/**
 * SUBCLASS KONKRET: Cat
 * ---------------------
 * - Sama seperti Dog, tetapi implementasi suaranya berbeda.
 *
 * Konsep: POLYMORPHISM
 * Dua kelas berbeda (Dog, Cat) mengimplementasikan method yang sama
 * (makeSound) dengan perilaku berbeda.
 */
public class Cat extends Animal {

    @Override
    public String makeSound(String name) {
        return name + " says Meow!";
    }
}