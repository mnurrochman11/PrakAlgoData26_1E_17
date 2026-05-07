import java.util.Scanner;

public class KRSMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS17 antrian = new AntrianKRS17(10);
        int pilih;

        do {
            System.out.println("\n=== ANTRIAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Tampilkan Semua Antrian");
            System.out.println("3. Lihat 2 Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Proses 2 Mahasiswa");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Diproses");
            System.out.println("8. Sisa Belum Diproses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(m);
                    break;

                case 2:
                    antrian.print();
                    break;

                case 3:
                    antrian.peek2();
                    break;

                case 4:
                    antrian.lihatAkhir();
                    break;

                case 5:
                    antrian.dequeue2();
                    break;

                case 6:
                    System.out.println("Jumlah: " + antrian.getJumlah());
                    break;

                case 7:
                    System.out.println("Sudah diproses: " + antrian.getJumlahDiproses());
                    break;

                case 8:
                    System.out.println("Belum diproses: " + antrian.sisaBelumProses());
                    break;

                case 9:
                    antrian.clear();
                    break;
            }

        } while (pilih != 0);
    }
}