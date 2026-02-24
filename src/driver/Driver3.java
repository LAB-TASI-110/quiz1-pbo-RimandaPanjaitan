import java.util.Scanner;

public class Driver3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Operasional Laundry Del ===");
        System.out.print("Masukkan Nama Asrama: ");
        String namaAsrama = input.nextLine();

        tampilkanJadwal(namaAsrama);

        input.close();
    }

    public static void tampilkanJadwal(String asrama) {
        // Membersihkan input agar tidak case-sensitive
        String inputBersih = asrama.trim().toLowerCase();
        
        String hariPenjemputan = "";
        String hariPengantaran = "";

        // Logika penentuan hari penjemputan dan pengantaran
        if (inputBersih.equals("louis pasteur") || 
            inputBersih.equals("archimedes") || 
            inputBersih.equals("simon laplace") || 
            inputBersih.equals("ada lovelace") || 
            inputBersih.equals("nicola tesla")) {
            
            hariPenjemputan = "Selasa";
            hariPengantaran = "Rabu";
            
        } else if (inputBersih.equals("max planc") || 
                   inputBersih.equals("marie curie")) {
            
            hariPenjemputan = "Rabu";
            hariPengantaran = "Kamis";
            
        } else {
            System.out.println("\n[Error] Nama asrama tidak terdaftar.");
            return;
        }

        // Output sesuai format yang diminta
        System.out.println("\n--- Hasil Pencarian Jadwal ---");
        System.out.println("Nama Asrama      : " + asrama.toUpperCase());
        System.out.println("Hari Penjemputan : " + hariPenjemputan);
        System.out.println("Hari Pengantaran : " + hariPengantaran);
        System.out.println("------------------------------");
    }
}
