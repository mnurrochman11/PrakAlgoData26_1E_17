package P6;
import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();
        // Mahasiswa17 m1 = new Mahasiswa17("123", "Zidan", "2A", 3.2);
        // Mahasiswa17 m2 = new Mahasiswa17("124", "Ayu", "2A", 3.5);
        // Mahasiswa17 m3 = new Mahasiswa17("125", "Sofi", "2A", 3.1);
        // Mahasiswa17 m4 = new Mahasiswa17("126", "Sita", "2A", 3.9);
        // Mahasiswa17 m5 = new Mahasiswa17("127", "Mika", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting : ");
        list.tampil();
        list.bubbleSort();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
    }
}