import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memasukkan nilai
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        
        // Menghitung luas
        double luas = panjang * lebar;
        
        // Menampilkan hasil
        System.out.println("Luas persegi panjang: " + luas);
        
        input.close();
    }
}
