package P12;
public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa17(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.println(
                "NIM    : " + nim +
                        "\nNama  : " + nama +
                        "\nKelas : " + kelas +
                        "\nIPK   : " + ipk);
    }
}