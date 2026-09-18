import java.util.Scanner;

public class DiamondML {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Operator Penugasan");
        
        System.out.print("Masukkan Diamond Awal : ");
        int diamond = input.nextInt();
        System.out.println("Diamond awal          : " + diamond);
        
        diamond += 5;
        System.out.println("Setelah += 5          : " + diamond);
        
        diamond -= 3;
        System.out.println("Setelah -= 3          : " + diamond);
        
        diamond *= 2;
        System.out.println("Setelah *= 2          : " + diamond);
        
        diamond /= 2;
        System.out.println("Setelah /= 2          : " + diamond);
        
        diamond %= 3;
        System.out.println("Setelah %= 3          : " + diamond);
        
        input.close();
    }
}
