import java.util.Scanner;  // wajib impor alat Scanner di baris paling atas

public class Main {
    public static void main(String[] args) {
        // Buat objek Scanner atau siapkan alat input
        Scanner input = new Scanner(System.in);

        // baca input dari keyboard
        System.out.print("Nama: ");
        String nama = input.nextLine();

        // Tampilkan
        System.out.println("Nama: " + nama);

        // Tutup Scanner
        input.close();
    }
}
