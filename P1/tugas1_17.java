import java.util.Scanner;

public class tugas1_17 {
    public static void main(String[] args) {
        Scanner nur17 = new Scanner(System.in);
        char[] kodePlat17 = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] kodeKota17 = new char[10][12];
        kodeKota17[0] = new char[] { 'B', 'A', 'N', 'T', 'E', 'N' };
        kodeKota17[1] = new char[] { 'J', 'A', 'K', 'A', 'R', 'T', 'A' };
        kodeKota17[2] = new char[] { 'B', 'A', 'N', 'D', 'U', 'N', 'G' };
        kodeKota17[3] = new char[] { 'C', 'I', 'R', 'E', 'B', 'O', 'N' };
        kodeKota17[4] = new char[] { 'B', 'O', 'G', 'O', 'R' };
        kodeKota17[5] = new char[] { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' };
        kodeKota17[6] = new char[] { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' };
        kodeKota17[7] = new char[] { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' };
        kodeKota17[8] = new char[] { 'M', 'A', 'L', 'A', 'N', 'G' };
        kodeKota17[9] = new char[] { 'T', 'E', 'G', 'A', 'L' };
        char inputPlat17;
        boolean ada17 = false;

        System.out.print("Masukkan kode plat : ");
        inputPlat17 = nur17.next().toUpperCase().charAt(0);
        for (int i = 0; i < kodePlat17.length; i++) {
            if (inputPlat17 == kodePlat17[i]) {
                String namaKota17 = "";
                for (int j = 0; j < kodeKota17[i].length; j++) {
                    namaKota17 += kodeKota17[i][j];
                    ada17 = true;
                }
                System.out.println("Plat ditemukan!");
                System.out.println("Nama kota : " + namaKota17);
                break;
            }
        }
        if (!ada17) {
            System.out.println("Kode Plat Salah!");
        }
    };
}
