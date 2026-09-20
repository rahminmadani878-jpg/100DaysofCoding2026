		import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga bakso per porsi: ");
        double harga = input.nextDouble();

        int  hargaBulat = (int) harga;
        short hargaKecil = (short) hargaBulat;
        byte hargaPalingKecil = (byte) hargaKecil;

        System.out.println("\nHasil Konversi:");
        System.out.println("Asli    = " + harga);
        System.out.println("int     = " + hargaBulat);
        System.out.println("byte    = " + hargaPalingKecil);

		input.close();
	}
}
