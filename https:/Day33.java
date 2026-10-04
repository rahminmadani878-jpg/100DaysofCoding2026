		import java.util.Scanner;

public class CekPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan password: ");
        int password = input.nextInt();

        if (password== 12345) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Password salah");
        }

        input.close();
    }
}
