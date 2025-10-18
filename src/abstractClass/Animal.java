package abstractClass;

/**
 * KELAS ABSTRAK: Animal
 * ----------------------
 * - Menjadi "kontrak" untuk semua hewan.
 * - Tidak bisa di-instansiasi langsung (new Animal() tidak boleh).
 * - Memaksa subclass (Dog, Cat) mengimplementasikan method makeSound(String).
 *
 * Konsep: ABSTRAKSI
 * Menyembunyikan detail implementasi suara tiap hewan; yang penting hanya
 * "semua hewan bisa makeSound(name)".
 */
public abstract class Animal {
    // Metode abstrak yang harus diimplementasikan subclass
    public abstract String makeSound(String name);
}