package CM2;
import java.util.Scanner;

public class Main17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListPembeli17 antrian = new DoubleLinkedListPembeli17();
        DoubleLinkedListPesanan17 pesanan = new DoubleLinkedListPesanan17();
        int pilih;

        do {
            System.out.println("\n============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    Pembeli17 pembeli = new Pembeli17(nama, hp);
                    antrian.tambahAntrian(pembeli);
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    NodePembeli17 dataKeluar = antrian.hapusAntrian();
                    if (dataKeluar != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan17 psn = new Pesanan17(kode, namaPesanan, harga);
                        pesanan.add(psn);
                        System.out.println(dataKeluar.data.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;
                case 4:
                    pesanan.print();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilih != 0);
        sc.close();
    }
}