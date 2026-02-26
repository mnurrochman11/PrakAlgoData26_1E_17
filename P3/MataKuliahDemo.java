package P3;

import java.util.Scanner;

public class MataKuliahDemo {
    public static void main(String[] args) {
        Scanner nur17 = new Scanner(System.in);
        MataKuliah17[] arrayOfMataKuliah17 = new MataKuliah17[3];
        String kode17, nama17, dummy17;
        int sks17, jumlahJam17;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah17[i] = new MataKuliah17();
            arrayOfMataKuliah17[i].tambahData();
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMataKuliah17[i].kode17);
            System.out.println("Nama       : " + arrayOfMataKuliah17[i].nama17);
            System.out.println("SKS        : " + arrayOfMataKuliah17[i].sks17);
            System.out.println("Jumlah jam : " + arrayOfMataKuliah17[i].jumlahJam17);
            System.out.println("-------------------------");
        }
    }
}
