import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;

        // Memproses perhitungan
        if (op == '+') {
            hasil = angka1 + angka2;
        }
        if (op == '-') {
            hasil = angka1 - angka2;
        }
        if (op == '*') {
            hasil = angka1 * angka2;
        }
        if (op == '/') {
            if (angka2 != 0) { // Cek agar tidak dibagi nol
                hasil = angka1 / angka2;
            } else {
                System.out.println("Error: Tidak bisa dibagi nol!");
                return; // Hentikan program
            }
        }

        // Menampilkan hasil
        System.out.println("Hasil: " + angka1 + " " + op + " " + angka2 + " = " + hasil);
    }
}
