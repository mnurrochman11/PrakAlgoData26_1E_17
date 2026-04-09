package CM1;

public class Peminjaman17 {
    String nim, nama, judul;
    int lama, denda, terlambat;

    Peminjaman17() {

    }

    Peminjaman17(String nm, String name, String jd, int lm) {
        nim = nm;
        nama = name;
        judul = jd;
        lama = lm;
        hitungDenda();
    }

    void hitungDenda() {
        if (lama > 5) {
            terlambat = lama - 5;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

}
