package overloading;

/**
 * Demonstrasi METHOD OVERLOADING:
 * Beberapa method bernama sama (add) dengan parameter berbeda.
 * Kompiler akan memilih overload berdasarkan signature parameter.
 */
public class Calculator {

    /** Menjumlahkan dua bilangan bulat. */
    public int add(int a, int b) {
        return a + b;
    }

    /** Menjumlahkan dua bilangan pecahan (double). */
    public double add(double a, double b) {
        return a + b;
    }

    /** Menjumlahkan tiga bilangan bulat. (dibutuhkan oleh testAddIntIntInt) */
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Opsional (tidak diperlukan oleh test, tapi berguna)
    /** Menjumlahkan banyak bilangan bulat. */
    public int add(int... nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    /** Menjumlahkan banyak bilangan double. */
    public double add(double... nums) {
        double sum = 0.0;
        for (double n : nums) sum += n;
        return sum;
    }
}


