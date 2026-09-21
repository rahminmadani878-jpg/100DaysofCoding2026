import java.util.Scanner;

public class UpinIpin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Masukkan data
        System.out.print("Masukkan umur Ipin: ");
        int umurIpin = input.nextInt();

        System.out.print("Masukkan tinggi Upin: ");
        double tinggiUpin = input.nextDouble();

        // Ubah jadi String
        String teksUmur = String.valueOf(umurIpin);
        String teksTinggi = String.valueOf(tinggiUpin);

        // Tampilkan hasil
        System.out.println("\n--- Hasil ---");
        System.out.println("Umur Ipin: " + teksUmur + " tahun");
        System.out.println("Tinggi Upin: " + teksTinggi + " cm");

        input.close();
    }
}
