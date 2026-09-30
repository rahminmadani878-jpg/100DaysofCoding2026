		import java.util.Scanner;

public class CekTinggi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan tinggi badan
        System.out.print("Masukkan tinggi orang pertama (cm): ");
        int tinggi1 = input.nextInt();

        System.out.print("Masukkan tinggi orang kedua (cm): ");
        int tinggi2 = input.nextInt();

        // Cek apakah orang pertama lebih tinggi (>)
        boolean lebihTinggi = (tinggi1 > tinggi2);
        System.out.println("Orang pertama lebih tinggi dari orang kedua? " + lebihTinggi);

        // Cek apakah orang pertama lebih perdek (<)
        boolean lebihPendek = (tinggi1 < tinggi2);
        System.out.println("Orang pertama lebih pendek dari orang kedua? " + lebihPendek);

        input.close();
    }
}
