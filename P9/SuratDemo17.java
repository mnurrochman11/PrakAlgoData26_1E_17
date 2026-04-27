package P9;

import java.util.Scanner;

public class SuratDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat17 stack = new StackSurat17(5);
        int pilih;

        do {
            System.out.println("\nMENU SURAT IZIN");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat        : ");
                    String id = sc.nextLine();

                    System.out.print("Nama Mahasiswa  : ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas           : ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().charAt(0);

                    System.out.print("Durasi (hari)   : ");
                    int durasi = Integer.parseInt(sc.nextLine());

                    Surat17 surat = new Surat17(id, nama, kelas, jenis, durasi);
                    stack.push(surat);

                    System.out.println("Surat berhasil diterima.");
                    break;

                case 2:
                    Surat17 proses = stack.pop();

                    if (proses != null) {
                        System.out.println("Surat berhasil diproses:");
                        System.out.println("ID Surat : " + proses.idSurat);
                        System.out.println("Nama     : " + proses.namaMahasiswa);
                        System.out.println("Kelas    : " + proses.kelas);
                        System.out.println("Jenis    : " + proses.jenisIzin);
                        System.out.println("Durasi   : " + proses.durasi + " hari");
                    } else {
                        System.out.println("Tidak ada surat untuk diproses.");
                    }
                    break;

                case 3:
                    Surat17 lihat = stack.peek();

                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        System.out.println("ID Surat : " + lihat.idSurat);
                        System.out.println("Nama     : " + lihat.namaMahasiswa);
                        System.out.println("Kelas    : " + lihat.kelas);
                        System.out.println("Jenis    : " + lihat.jenisIzin);
                        System.out.println("Durasi   : " + lihat.durasi + " hari");
                    } else {
                        System.out.println("Belum ada surat.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();

                    if (stack.cari(cari)) {
                        System.out.println("Surat ditemukan.");
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 4);
    }
}
