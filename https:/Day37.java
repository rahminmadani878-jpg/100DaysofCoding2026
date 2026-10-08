import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        
        if (bilangan > 0) {
            System.out.println(bilangan + " Positif ");
        } else if (bilangan < 0) {
            System.out.println(bilangan + " Negatif ");
        } else {
            System.out.println(" Nol ");
        }
        
        input.close();
    }
}
