public class Main {
	public static void main(String[] args) {
		// soal 1
public class Soal1 {
    public static void main(String[] args) {

        System.out.println("Nama\t: Rahmin\nNIM\t\D0226014: \nKelas\t: B\nMahasiswa\t: true\n");

// Soal 2
public class Soal2 {
    public static void main(String[] args) {

        double angka1 = 2.56;
        double angka2 = 3.14;

        System.out.printf("%.2f%n", angka1);
        System.out.printf("%.2f%n", angka2);

// Soal 3
public class Soal3 {
    public static void main(String[] args) {

        String nama = "Rahmin";
        int umur = 18;

        System.out.println("Sebelum");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);

        nama = "Min";
        umur = 19;

        System.out.println("Sesudah");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);

// Soal 4
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("Berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Status mahasiswa (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        System.out.println("\n=== BIODATA MAHASISWA ===");
        System.out.println("Nama            : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Tinggi Badan    : " + tinggi + " cm");
        System.out.println("Berat Badan     : " + berat + " kg");
        System.out.println("Status Mahasiswa: " + mahasiswa);

        input.close();

// Soal 5
public class Soal5 {
    public static void main(String[] args) {
        
        byte dataByte = 6;
        short dataShort = 1234;
        int dataInt = 12345;
        long dataLong = 12345678L;

        float dataFloat = 4.5f;
        double dataDouble = 5.88;

        char dataChar = 'A';
        boolean dataBoolean = true;
        String dataString = "Java";

        System.out.println(" 9 TIPE DATA ");
        System.out.println("byte    : " + dataByte);
        System.out.println("short   : " + dataShort);
        System.out.println("int     : " + dataInt);
        System.out.println("long    : " + dataLong);
        System.out.println("float   : " + dataFloat);
        System.out.println("double  : " + dataDouble);
        System.out.println("char    : " + dataChar);
        System.out.println("boolean : " + dataBoolean);
        System.out.println("String  : " + dataString);"
	}
}
