import java.util.Scanner;

public class KategoriUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        
        System.out.println("Umur: " + umur + " tahun");
        
        if (umur < 5) {
            System.out.println("Kategori: Balita");
        } else if (umur >= 5 && umur < 13) {
            System.out.println("Kategori: Anak-anak");
        } else if (umur >= 13 && umur < 18) {
            System.out.println("Kategori: Remaja");
        } else if (umur >= 18 && umur < 60) {
            System.out.println("Kategori: Dewasa");
        } else {
            System.out.println("Kategori: Lansia");
        }
        
        input.close();
    }
}
