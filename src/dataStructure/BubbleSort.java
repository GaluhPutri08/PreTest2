package dataStructure;

/**
 * BubbleSort dengan kontrol jumlah iterasi (pass).
 *
 * Aturan sesuai unit test:
 * 1) Jika iterations <= 0  -> tidak ada perubahan (kembalikan salinan yang sama urutannya).
 * 2) Jika iterations > 0   -> lakukan bubble sort sebanyak 'iterations' pass,
 *    tetapi maksimal n-1 pass (dan berhenti lebih cepat jika tidak ada swap).
 *
 * "Satu pass" = menyapu dari indeks 0..(n-2-passKe) dan menukar pasangan yang salah urut,
 * sehingga elemen terbesar di rentang aktif "naik" ke ujung kanan.
 *
 * Contoh:
 * - [5,2,8,1,9], 2 pass -> [2,1,5,8,9] (sesuai Test 1)
 * - Iterasi besar (120) pada array 9 elemen -> array terurut penuh (sesuai Test 2)
 * - Iterasi negatif (-10) -> tak berubah (sesuai Test 3)
 */
public class BubbleSort {

    /**
     * Melakukan bubble sort terbatas jumlah pass.
     *
     * @param arr        array input (tidak diubah; kita kerjakan pada salinannya)
     * @param iterations jumlah pass bubble sort yang diminta
     * @return array hasil setelah sejumlah pass (atau tak berubah jika iterations <= 0)
     */
    public int[] bubbleSort(int[] arr, int iterations) {
        // Penanganan input null atau panjang < 2: langsung kembalikan salinan
        if (arr == null || arr.length < 2) {
            return copyOf(arr);
        }

        // Jika iterasi <= 0, kembalikan apa adanya (tanpa sorting)
        if (iterations <= 0) {
            return copyOf(arr);
        }

        int[] a = copyOf(arr);
        int n = a.length;

        // Batas maksimal pass dalam bubble sort adalah n-1
        int maxPass = Math.min(iterations, n - 1);

        for (int pass = 0; pass < maxPass; pass++) {
            boolean swapped = false;

            // Rentang aktif menyusut di tiap pass: 0..(n-2-pass)
            for (int i = 0; i < n - 1 - pass; i++) {
                if (a[i] > a[i + 1]) {
                    // Tukar jika urutannya salah
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    swapped = true;
                }
            }

            // Early stop: jika tidak ada pertukaran, berarti sudah terurut
            if (!swapped) {
                break;
            }
        }

        return a;
    }

    // Util sederhana untuk menyalin array (menghindari side-effect pada input test)
    private int[] copyOf(int[] arr) {
        if (arr == null) return null;
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
    }
}
