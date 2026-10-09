import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("PEMBELIAN TIKET BIOSKOP");
        System.out.println("1. Regular - Rp40000");
        System.out.println("2. Sweetbox - Rp60000");
        System.out.println("3. VIP - Rp90000");
        System.out.print("Pilih kategori (1-3): ");
        int pilihan = input.nextInt();
        
        System.out.print("Jumlah tiket: ");
        int jumlah = input.nextInt();
        
        String kategori = "";
        int harga = 0;
        
        // Menentukan kategori dan harga
        if (pilihan == 1) {
            kategori = "Regular";
            harga = 40000;
        } else if (pilihan == 2) {
            kategori = "Sweetbox";
            harga = 60000;
        } else if (pilihan == 3) {
            kategori = "VIP";
            harga = 90000;
        } else {
            System.out.println("Kategori tidak tersedia");
            input.close();
            return; // Berhenti program jika salah pilih
        }
        
        // Menghitung total sebelum diskon
        int totalSebelumDiskon = harga * jumlah;
        double diskon = 0;
        
        // Menghitung diskon
        if (totalSebelumDiskon >= 150000) {
            diskon = 0.15 * totalSebelumDiskon;
        }
        
        double totalBayar = totalSebelumDiskon - diskon;
        
        // Menampilkan hasil
        System.out.println("\nOUTPUT:");
        System.out.println("Kategori  : " + kategori);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("Jumlah    : " + jumlah);
        System.out.println("Total     : Rp" + totalSebelumDiskon);
        System.out.println("Diskon    : Rp" + (int)diskon);
        System.out.println("Total Bayar: Rp" + (int)totalBayar);
        
        input.close();
    }
}
