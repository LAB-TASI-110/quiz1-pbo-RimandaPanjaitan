import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input Jumlah Total Data (N)
        System.out.print("Masukkan jumlah total siswa: ");
        int n = input.nextInt();

        // 2. Input Deret Nilai
        int[] daftarNilai = new int[n];
        System.out.println("Masukkan nilai satu per satu:");
        for (int i = 0; i < n; i++) {
            daftarNilai[i] = input.nextInt();
        }

        // 3. Input Kode Kelompok (Contoh: 1 untuk Ganjil, 2 untuk Genap)
        System.out.print("Masukkan kode kelompok (1: Ganjil, 2: Genap): ");
        int kode = input.nextInt();

        int totalNilai = 0;

        // 4. Proses Penjumlahan Berdasarkan Kelompok
        for (int i = 0; i < n; i++) {
            // Kita gunakan (i + 1) karena urutan manusia mulai dari 1, bukan 0
            int urutanSiswa = i + 1;

            if (kode == 1) { // Kelompok Ganjil
                if (urutanSiswa % 2 != 0) {
                    totalNilai += daftarNilai[i];
                }
            } else if (kode == 2) { // Kelompok Genap
                if (urutanSiswa % 2 == 0) {
                    totalNilai += daftarNilai[i];
                }
            }
        }

        // 5. Output Hasil
        System.out.println("Total nilai untuk kelompok tersebut adalah: " + totalNilai);
        
        input.close();
    }
}
