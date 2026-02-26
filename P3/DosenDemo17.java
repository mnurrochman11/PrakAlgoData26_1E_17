package P3;

import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner nur17 = new Scanner(System.in);
        String kode17, nama17, jk17;
        int usia17, jumlah17;

        System.out.print("Masukkan jumlah dosen: ");
        jumlah17 = nur17.nextInt();

        nur17.nextLine();

        Dosen17[] arrayOfDosen17 = new Dosen17[jumlah17];

        for (int i = 0; i < jumlah17; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode17 = nur17.nextLine();
            System.out.print("Nama          : ");
            nama17 = nur17.nextLine();
            System.out.print("Jenis Kelamin (pria/wanita): ");
            jk17 = nur17.nextLine();
            System.out.print("Usia          : ");
            usia17 = Integer.parseInt(nur17.nextLine());

            boolean jenisKelamin17 = jk17.equalsIgnoreCase("pria");

            arrayOfDosen17[i] = new Dosen17(kode17, nama17, jenisKelamin17, usia17);
            System.out.println("-------------------------------------");
        }

        int no17 = 1;
        for (Dosen17 dsn17 : arrayOfDosen17) {
            System.out.println("Data Dosen ke-" + no17);
            dsn17.cetakInfo17();
            no17++;
        }
    }
}
