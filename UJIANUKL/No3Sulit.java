package UJIANUKL;

public class No3Sulit {
    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 3, 3, 4, 2, 3};
        int n = array.length;

        boolean[] sudahDihitung = new boolean[n];

        for (int i = 0; i < n; i++) {
            sudahDihitung[i] = false;
        }

        for (int i = 0; i < n; i++) {

            if (sudahDihitung[i]) {
                continue;
            }

            int hitung = 1; // hitungan awal untuk elemen array[i]
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    hitung++;
                    sudahDihitung[j] = true;
                }
            }

            System.out.println(array[i] + " muncul " + hitung + " kali");
        }
    }
}
