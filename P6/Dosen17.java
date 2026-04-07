package P6;

public class Dosen17 {
    String kode, nama, jenisKelamin;
    int usia;

    Dosen17(String kd, String name, String jk, int age) {
        kode = kd;
        nama = name;

        if (jk.equalsIgnoreCase("l") || jk.equalsIgnoreCase("pria")) {
            jenisKelamin = "L";
        } else {
            jenisKelamin = "P";
        }

        usia = age;
    }

    void tampil(int no) {
        System.out.printf("%-3d %-6s %-10s %-10s %-5d\n",
                no, kode, nama, jenisKelamin, usia);
    }
}
