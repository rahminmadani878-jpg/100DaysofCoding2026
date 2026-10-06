import java.util.Scanner;

public class KategoriKecepatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kecepatan: ");
        int kecepatan = input.nextInt();
        
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        
        if (kecepatan > 80) {
            if (kecepatan > 100) {
                System.out.println("Kategori: Sangat Cepat");
            } else {
                System.out.println("Kategori: Cepat");
            }
        } else {
            if (kecepatan >= 40) {
                System.out.println("Kategori: Normal");
            } else {
                System.out.println("Kategori: Lambat");
            }
        }
        
        input.close();
    }
}
