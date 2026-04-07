package P6;

import java.util.Scanner;

public class DosenDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen17 list = new DataDosen17();

        int pilih;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Exit");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jk = sc.nextLine();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    list.tambah(new Dosen17(kode, nama, jk, usia));
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    break;

                case 4:
                    list.sortingDSC();
                    break;
            }
        } while (pilih != 5);
    }
}
