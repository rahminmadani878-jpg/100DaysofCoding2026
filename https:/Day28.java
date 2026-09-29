		import java.util.Scanner;

public class day28 {
    public static void main(String[] args) {
        // Menyiapkan alat untuk menerima masukan
        Scanner input = new Scanner(System.in);

        // memasukkan jumlah barang
        System.out.print("Masukkan jumlah barang pertama: ");
        int barang1 = input.nextInt();

        System.out.print("Masukkan jumlah barang kedua: ");
        int barang2 = input.nextInt();

        // Mengecek apakah jumlahnya sama (==)
        boolean sama = (barang1 == barang2);
        System.out.println("\nApakah jumlahnya sama? " + sama);

        // Mengecek apakah jumlahnya berbeda (!=)
        boolean berbeda = (barang1 != barang2);
        System.out.println("Apakah jumlahnya berbeda? " + berbeda);

        // Menutup
        input.close();
    }
