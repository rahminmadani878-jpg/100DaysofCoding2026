		import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double PHI = 3.14;
        
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        
        double luas = PHI * r * r;
        
        System.out.println("Luas lingkaran = " + luas);
        
        input.close();
	}
}
