package P3;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner nur17 = new Scanner(System.in);
        String kode17, nama17, dummy17;
        int sks17, jumlahJam17;

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlah = Integer.parseInt(nur17.nextLine());

        MataKuliah17[] arrayOfMataKuliah17 = new MataKuliah17[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah17[i] = new MataKuliah17();
            arrayOfMataKuliah17[i].tambahData();
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah17[i].cetakInfo();
        }
    }
}
