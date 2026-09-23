import java.util.Scanner;

public class TukarKekuatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kekuatan Api  : ");
        int api  = input.nextInt();

        System.out.print("Kekuatan Air  : ");
        int air  = input.nextInt();

        System.out.println("\nSebelum:");
        System.out.println("Api  = " + api);
        System.out.println("Air  = " + air);

        int simpan = api;
        api  = air;
        air  = simpan;

        System.out.println("\nSesudah:");
        System.out.println("Api  = " + api);
        System.out.println("Air  = " + air);

        input.close();
    }
}
