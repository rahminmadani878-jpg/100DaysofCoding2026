import java.util.Scanner;

public class EvaluasiMentor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input data member
        System.out.print("Masukkan nama member: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur member: ");
        int umur = input.nextInt();

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = input.nextDouble();

        // 2. Hitung BMI
        double tinggiM = tinggiCm / 100;
        double bmi = berat / (tinggiM * tinggiM);

        // 3. Tentukan kategori BMI
        String kategori;

        if (bmi < 18.5) {
            kategori = "Kekurangan Berat Badan";
        } else if (bmi < 25) {
            kategori = "Normal";
        } else if (bmi < 30) {
            kategori = "Kelebihan Berat Badan";
        } else {
            kategori = "Obesitas";
        }

        // 4. Tentukan paket berdasarkan umur dan BMI
        String paket;

        if (umur >= 17 && umur <= 30) {
            if (kategori.equals("Normal")) {
                paket = "Paket Fitness Reguler";
            } else if (kategori.equals("Kelebihan Berat Badan") || kategori.equals("Obesitas")) {
                paket = "Paket Pembakaran Lemak";
            } else {
                paket = "Paket Fitness Reguler";
            }
        } else if (umur >= 31 && umur <= 45) {
            if (kategori.equals("Kelebihan Berat Badan") || kategori.equals("Obesitas")) {
                paket = "Paket Diet Sehat";
            } else {
                paket = "Paket Fitness Reguler";
            }
        } else {
            if (kategori.equals("Obesitas")) {
                paket = "Paket Kesehatan Khusus";
            } else {
                paket = "Paket Fitness Reguler";
            }
        }

        // 5. Output hasil
        System.out.println("\n=== Hasil Pendaftaran Member Gym ===");
        System.out.println("Nama Member  : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.printf("BMI          : %.2f%n", bmi);
        System.out.println("Kategori BMI : " + kategori);
        System.out.println("Paket Gym    : " + paket);

        input.close();
    }
}
