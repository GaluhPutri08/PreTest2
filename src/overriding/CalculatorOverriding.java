package overriding;

/**
 * Demonstrasi OVERRIDING:
 * - Kelas dasar (CalculatorOverriding) punya perilaku default.
 * - Kelas turunan (ScientificCalculator) meng-override perilaku tertentu.
 *
 * Tujuan sesuai unit test:
 * 1) getType():
 *    - Base  -> "Generic Calculator"
 *    - Child -> "Scientific Calculator"
 * 2) divide(a, b) saat b == 0:
 *    - Base  -> kembalikan Double.NaN
 *    - Child -> kembalikan Double.POSITIVE_INFINITY (ikut IEEE 754 untuk 10/0)
 */
public class CalculatorOverriding {

    /**
     * Mengembalikan tipe kalkulator.
     * Di kelas dasar: "Generic Calculator"
     */
    public String getType() {
        return "Generic Calculator";
    }

    /**
     * Operasi pembagian sederhana.
     * Perilaku default: jika pembagi = 0, kembalikan NaN (bukan Infinity).
     *
     * @param a pembilang
     * @param b penyebut
     * @return hasil pembagian, atau NaN jika b == 0
     */
    public double divide(double a, double b) {
        if (b == 0.0) {
            return Double.NaN; // perilaku yang diuji untuk kalkulator generic
        }
        return a / b;
    }

    /**
     * Kelas turunan sebagai INNER CLASS statik.
     * Meng-override getType() dan divide() dengan perilaku "scientific".
     */
    public static class ScientificCalculator extends CalculatorOverriding {

        /**
         * Mengembalikan tipe kalkulator sains.
         */
        @Override
        public String getType() {
            return "Scientific Calculator";
        }

        /**
         * Pembagian versi scientific:
         * - Jika b == 0, biarkan aturan floating-point Java berlaku (a / 0.0):
         *   10 / 0.0 -> +Infinity, -10 / 0.0 -> -Infinity, 0 / 0.0 -> NaN.
         *   (Unit test memeriksa kasus 10 / 0 -> POSITIVE_INFINITY)
         */
        @Override
        public double divide(double a, double b) {
            return a / b; // gunakan perilaku IEEE 754 bawaan Java
        }
    }
}

