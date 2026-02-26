package P3;

import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner nur17 = new Scanner(System.in);
        String dummy17;
        Mahasiswa17[] arrayOfMahasiswa17 = new Mahasiswa17[3];

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa17[i] = new Mahasiswa17();

            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa17[i].nim17 = nur17.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa17[i].nama17 = nur17.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa17[i].kelas17 = nur17.nextLine();
            System.out.print("IPK   : ");
            dummy17 = nur17.nextLine();
            arrayOfMahasiswa17[i].ipk17 = Float.parseFloat(dummy17);
            System.out.println("--------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke- " + (i + 1));
            arrayOfMahasiswa17[i].cetakInfo();
        }

    }
}
