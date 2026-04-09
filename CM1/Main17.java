package CM1;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        int pilih;
        Scanner sc = new Scanner(System.in);

        DataMahasiswa17 list1 = new DataMahasiswa17();
        Mahasiswa17 a1 = new Mahasiswa17("22001", "Andi", "Teknik Informatika");
        Mahasiswa17 a2 = new Mahasiswa17("22002", "Budi", "Teknik Informatika");
        Mahasiswa17 a3 = new Mahasiswa17("22003", "Citra", "Sistem Informasi Bisnis");

        list1.tambah(a1);
        list1.tambah(a2);
        list1.tambah(a3);

        DataBuku17 list2 = new DataBuku17();
        Buku17 b1 = new Buku17("B001", "Algoritma", "2020");
        Buku17 b2 = new Buku17("B002", "Basis Data", "2019");
        Buku17 b3 = new Buku17("B003", "Pemrograman", "2021");
        Buku17 b4 = new Buku17("B004", "Fisika", "2024");

        list2.tambah(b1);
        list2.tambah(b2);
        list2.tambah(b3);
        list2.tambah(b4);

        DataPeminjaman17 list3 = new DataPeminjaman17();
        Peminjaman17 c1 = new Peminjaman17("22001", "Andi", "Algoritma", 7);
        Peminjaman17 c2 = new Peminjaman17("22002", "Budi", "Basis Data", 3);
        Peminjaman17 c3 = new Peminjaman17("22003", "Citra", "Pemrograman", 10);
        Peminjaman17 c4 = new Peminjaman17("22003", "Citra", "Fisika", 6);
        Peminjaman17 c5 = new Peminjaman17("22001", "Andi", "Basis Data", 4);

        list3.tambah(c1);
        list3.tambah(c2);
        list3.tambah(c3);
        list3.tambah(c4);
        list3.tambah(c5);

        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahahasiswa");
            System.out.println("2. Tampikan Buku");
            System.out.println("3. Tampikan Peminjaman");
            System.out.println("4. Urutkan berdasaran Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    list1.tampil();
                    System.out.println();
                    break;
                case 2:
                    list2.tampil();
                    System.out.println();
                    break;
                case 3:
                    list3.tampil();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\nSetelah diurutkan (Denda terbesar)! ");
                    list3.insertionSort();
                    list3.tampil();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cariNim = sc.nextLine();
                    list3.cariNIM(cariNim);
                    break;
                case 0:
                    System.out.println("Keluar!");
                    break;
                default:
                    System.out.println("Keluar!");
                    break;
            }
        } while (pilih != 0);

    }
}
