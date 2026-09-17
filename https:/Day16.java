import java.util.Scanner;

public class RobloxModulus {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Memasukkan angka
        System.out.print("Total Robux yang dimiliki : ");
        int totalRobux = input.nextInt();
        
        System.out.print("Harga 1 Barang di Toko    : ");
        int hargaItem = input.nextInt();
        
        // Melakukan Perhitungan
        int jumlahBeli = totalRobux / hargaItem;
        int sisaRobux = totalRobux % hargaItem;
        
        // Menampilkan Hasil
        System.out.println("Bisa Dibeli : " + jumlahBeli + " buah item");
        System.out.println("Sisa Robux  : " + sisaRobux);
        
        input.close();
    }
}
