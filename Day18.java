		import java.util.Scanner;

public class KonversiOtomatis {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang curian: ");
        int jumlahUang = input.nextInt();

        System.out.print("Masukkan jumlah orang yang ikut: ");
        int jumlahOrang = input.nextInt();

        System.out.print("Masukkan potongan biaya: ");
        float potongan = input.nextFloat();

        int total = jumlahUang * jumlahOrang;
        
        long totalLong = total;
        double totalDouble = totalLong;
        double sisaDouble = potongan;

        System.out.println("=== HASIL PERHITUNGAN ===");
        System.out.println("Jumlah uang curian : " + jumlahUang);
        System.out.println("Jumlah orang ikut  : " + jumlahOrang);
        System.out.println("Total keseluruhan  : " + total);
        System.out.println("Total (long)       : " + totalLong);
        System.out.println("Total (double)     : " + totalDouble);
        System.out.println("Potongan (float)   : " + potongan);
        System.out.println("Potongan (double)  : " + sisaDouble);

        input.close();
	}
}
