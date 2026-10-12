import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("KALKULATOR BANGUN DATAR");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();

        double luas = 0;
        String namaBangun = "";

        switch (pilihan) {
            case 1:
                namaBangun = "Lingkaran";
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                luas = Math.PI * r * r;
                break;

            case 2:
                namaBangun = "Persegi";
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                break;

            case 3:
                namaBangun = "Segitiga";
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                luas = 0.5 * alas * tinggi;
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
                input.close();
                return;
        }

        System.out.println(namaBangun);
        System.out.printf("%.2f\n", luas);

        input.close();
    }
}
