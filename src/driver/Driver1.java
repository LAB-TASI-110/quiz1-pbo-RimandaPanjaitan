import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {

        // Scanner untuk input
        Scanner sc = new Scanner(System.in);

        // Tampilkan menu
        System.out.println("=== MENU WARUNG MAK ROBY ===");
        System.out.println("NGS - Nasi Goreng Spesial (15k)");
        System.out.println("AP  - Ayam Penyet (20k)");
        System.out.println("SA  - Sate Ayam (25k)");
        System.out.println("BU  - Bakso Urat (18k)");

        // Input kode menu
        System.out.print("Masukkan kode menu: ");
        String kode = sc.next();

        // Input jumlah porsi
        System.out.print("Masukkan jumlah porsi: ");
        int porsi = sc.nextInt();

        int harga = 0;

        if (kode.equals("NGS")) {
            harga = 15;
        } else if (kode.equals("AP")) {
            harga = 20;
        } else if (kode.equals("SA")) {
            harga = 25;
        } else if (kode.equals("BU")) {
            harga = 18;
        } else {
            System.out.println("Kode menu tidak ditemukan!");
            sc.close();
            return;
        }

        int total = harga * porsi;

        System.out.println("Total bayar: " + total + "k");

        sc.close();
    }
}
