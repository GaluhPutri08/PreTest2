package dataStructure;

/**
 * Sequential/Linear Search yang mengembalikan:
 * - index hasil pencarian (atau -1 jika tidak ditemukan)
 * - jumlah iterasi (elemen yang diperiksa)
 * Format return: int[]{ index, iterations }
 */
public class SequentialSearch {

    public int[] sequentialSearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) return new int[]{ -1, 0 };

        int iterations = 0;
        for (int i = 0; i < arr.length; i++) {
            iterations++;
            if (arr[i] == target) {
                return new int[]{ i, iterations };
            }
        }
        // tidak ditemukan
        return new int[]{ -1, iterations };
    }
}