import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Gaji kotor: ");
        double kotor = input.nextDouble();
        
       double potong = kotor * 10/100;
       double bersih = kotor - potong;
        
        System.out.println("potongan 10℅: " + potong);
        System.out.println("Gaji bersih: " + bersih);
    }
}
