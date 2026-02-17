import java.util.Scanner;

public class pemilihan17 {

    public static void main(String[] args) {
        int nTugas17, nKuis17, nUTS17, nUAS17;
        double nAngka17, nSetara17;
        String nHuruf17, nKualifikasi17;
        Scanner nur17 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas : ");
        nTugas17 = nur17.nextInt();
        System.out.print("Masukkan Nilai Kuis  : ");
        nKuis17 = nur17.nextInt();
        System.out.print("Masukkan Nilai UTS   : ");
        nUTS17 = nur17.nextInt();
        System.out.print("Masukkan Nilai UAS   : ");
        nUAS17 = nur17.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        if ((nTugas17 < 0 || nTugas17 > 100) || (nKuis17 < 0 || nKuis17 > 100) || (nUTS17 < 0 || nUTS17 > 100)
                || (nUAS17 < 0 || nUAS17 > 100)) {
            System.out.println("NILAI TIDAK VALID!");
        } else {
            nAngka17 = (nTugas17 * 0.2) + (nKuis17 * 0.2) + (nUTS17 * 0.3) + (nUAS17 * 0.3);
            if (nAngka17 > 80 && nAngka17 <= 100) {
                nHuruf17 = "A";
                nSetara17 = 4;
                nKualifikasi17 = "Sangat Baik";
            } else if (nAngka17 > 73 && nAngka17 <= 80) {
                nHuruf17 = "B+";
                nSetara17 = 3.5;
                nKualifikasi17 = "Lebih dari Baik";
            } else if (nAngka17 > 65 && nAngka17 <= 73) {
                nHuruf17 = "B";
                nSetara17 = 3;
                nKualifikasi17 = "Baik";
            } else if (nAngka17 > 60 && nAngka17 <= 65) {
                nHuruf17 = "C+";
                nSetara17 = 2.5;
                nKualifikasi17 = "Lebih dari Cukup";
            } else if (nAngka17 > 50 && nAngka17 <= 60) {
                nHuruf17 = "C";
                nSetara17 = 2;
                nKualifikasi17 = "Cukup";
            } else if (nAngka17 > 39 && nAngka17 <= 50) {
                nHuruf17 = "D";
                nSetara17 = 1;
                nKualifikasi17 = "Kurang";
            } else {
                nHuruf17 = "E";
                nSetara17 = 0;
                nKualifikasi17 = "Gagal";
            }
            System.out.println("Nilai Angka : " + nAngka17);
            System.out.println("Nilai Huruf : " + nHuruf17);
            System.out.println("==============================");
            System.out.println("==============================");
            if (nHuruf17.equals("D") || nHuruf17.equals("E")) {
                System.out.println("MAAF ANDA BELUM LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
            System.out.println("==============================");
            System.out.println("==============================");
        }

    }
}