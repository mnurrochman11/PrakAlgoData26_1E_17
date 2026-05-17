package P12;

import java.util.Scanner;

public class DoubleLinkedListMain17 {
    public static Mahasiswa17 inputMahasiswa(Scanner sc) {
        System.out.print("NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Kelas : ");
        String kelas = sc.nextLine();

        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa17(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList17 list = new DoubleLinkedList17();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data reverse");
            System.out.println("8. Tambah data pada index tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data pada index tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada index");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("pilihan menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa17 mhsAwal = inputMahasiswa(sc);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa17 mhsAkhir = inputMahasiswa(sc);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM key : ");
                    String keyNim = sc.nextLine();
                    Mahasiswa17 dataBaru = inputMahasiswa(sc);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst17();
                    break;
                case 5:
                    list.removeLast17();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 8:
                    System.out.print("Masukkan index: ");
                    int indexTambah = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa17 dataIndex = inputMahasiswa(sc);
                    list.add(indexTambah, dataIndex);
                    break;
                case 9:
                    System.out.print("Masukkan NIM key: ");
                    String keyRemove = sc.nextLine();
                    list.removeAfter(keyRemove);
                    break;
                case 10:
                    System.out.print("Masukkan index yang akan dihapus: ");
                    int indexHapus = sc.nextInt();
                    sc.nextLine();
                    list.remove(indexHapus);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan index: ");
                    int indexCari = sc.nextInt();
                    sc.nextLine();
                    list.getIndex(indexCari);
                    break;
                case 14:
                    list.getSize();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilihan != 0);
        sc.close();
    }
}