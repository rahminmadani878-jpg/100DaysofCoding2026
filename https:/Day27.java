	// Mengimpor alat untuk menerima masukan
import java.util.Scanner;

// Membuat program utama
public class Main {
    // Tempat program dimulai
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Menyiapkan alat masukan

        System.out.print("Masukkan angka: "); // Meminta pengguna mengetik angka
        int angka = input.nextInt(); // Menyimpan angka yang dimasukkan

        System.out.println("Nilai awal: " + angka); // Menampilkan angka asli

        angka++; // Menambah 1
        System.out.println("Setelah ++: " + angka); // Menampilkan hasil tambah

        angka--; // Mengurangi 1
        System.out.println("Setelah --: " + angka); // Menampilkan hasil kurang
    }
}
