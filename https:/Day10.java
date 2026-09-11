public class Main {
	public static void main(String[] args) {
        // byte = -128 sampai 127
        byte minimalByte = -128;
        byte maksimalByte = 127;
        System.out.println("byte : " + minimalByte + " s/d " + maksimalByte);

        // short = -32.768 sampai 32.767
        short minimalShort = -32768;
        short maksimalShort = 32767;
        System.out.println("short: " + minimalShort + " s/d " + maksimalShort);

        // int = -2.147.483.648 sampai 2.147.483.647 (paling sering dipakai)
        int minimalInt = -2147483648;
        int maksimalInt = 2147483647;
        System.out.println("int  : " + minimalInt + " s/d " + maksimalInt);

        // long = angka sangat besar, tambah huruf L
        long minimalLong = -9223372036854775808L;
        long maksimalLong = 9223372036854775807L;
        System.out.println("long : " + minimalLong + " s/d " + maksimalLong);
	}
}
