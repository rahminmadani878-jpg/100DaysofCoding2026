		import java.util.Scanner;

public class Doraemon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minta ketik data
        System.out.print("Masukkan tahun lahir Doraemon: ");
        String teksTahun = input.next();

        System.out.print("Masukkan kecepatan lari Doraemon: ");
        String teksKecepatan = input.next();

        // Ubah dari teks ke angka
        int tahunLahir = Integer.parseInt(teksTahun);
        int kecepatan = Integer.parseInt(teksKecepatan);

        // Tampilkan hasil
        System.out.println("Doraemon lahir tahun: " + tahunLahir);
        System.out.println("Kecepatan lari: " + kecepatan + " km/jam");

        input.close();
	}
}
