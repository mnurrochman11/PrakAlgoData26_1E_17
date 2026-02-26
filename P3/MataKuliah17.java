package P3;

import java.util.Scanner;

public class MataKuliah17 {
    public String kode17, nama17;
    public int sks17, jumlahJam17;
    Scanner nur17 = new Scanner(System.in);

    public MataKuliah17() {

    }

    public MataKuliah17(String kode17, String nama17, int sks17, int jumlahJam17) {
        this.kode17 = kode17;
        this.nama17 = nama17;
        this.sks17 = sks17;
        this.jumlahJam17 = jumlahJam17;
    }

    public void tambahData() {
        System.out.print("Kode       : ");
        kode17 = nur17.nextLine();
        System.out.print("Nama       : ");
        nama17 = nur17.nextLine();
        System.out.print("SKS        : ");
        sks17 = Integer.parseInt(nur17.nextLine());
        System.out.print("Jumlah jam : ");
        jumlahJam17 = Integer.parseInt(nur17.nextLine());
        System.out.println("----------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + kode17);
        System.out.println("Nama       : " + nama17);
        System.out.println("SKS        : " + sks17);
        System.out.println("Jumlah jam : " + jumlahJam17);
        System.out.println("-------------------------");
    }

}
