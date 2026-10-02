		import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan data
        System.out.print("Masukkan IPK: ");
        double ipk = input.nextDouble();

        System.out.print("Mahasiswa aktif? (true/false): ");
        boolean aktif = input.nextBoolean();

        System.out.print("Menerima beasiswa lain? (true/false): ");
        boolean beasiswaLain = input.nextBoolean();

        // Rumus pengecekan
        boolean layak = (ipk >= 3.50 && aktif && !beasiswaLain) || (ipk == 4.00);

        // Menampilkan hasil
        System.out.println("Hasil: " + layak);

        input.close();
	}
}
