package dataStructure;

/**
 * Selection Sort dengan kontrol jumlah pass.
 * - iterations <= 0  : kembalikan salinan array apa adanya (tidak diubah)
 * - iterations > 0   : lakukan hingga min(iterations, n-1) pass
 *   (tiap pass menaruh elemen minimum ke posisi kiri yang tepat).
 * Catatan: input tidak dimutasi; kita kerja pada salinan.
 */
public class SelectionSort {

    public int[] selectionSort(int[] arr, int iterations) {
        if (arr == null || arr.length < 2) return copyOf(arr);
        if (iterations <= 0) return copyOf(arr);

        int[] a = copyOf(arr);
        int n = a.length;
        int maxPass = Math.min(iterations, n - 1);

        for (int i = 0; i < maxPass; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) minIdx = j;
            }
            if (minIdx != i) {
                int tmp = a[i];
                a[i] = a[minIdx];
                a[minIdx] = tmp;
            }
        }
        return a;
    }

    private int[] copyOf(int[] arr) {
        if (arr == null) return null;
        int[] c = new int[arr.length];
        System.arraycopy(arr, 0, c, 0, arr.length);
        return c;
    }
}