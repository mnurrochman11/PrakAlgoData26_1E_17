public class dosen17 {
    String idDosen17, nama17;
    boolean statusAktif17;
    int tahunBergabung17;
    String bidangKeahlian17;

    void tampilInformasi17() {
        System.out.println("ID Dosen        : " + idDosen17);
        System.out.println("Nama            : " + nama17);
        System.out.println("Status Aktif    : " + statusAktif17);
        System.out.println("Tahun Bergabung : " + tahunBergabung17);
        System.out.println("Bidang Keahlian : " + bidangKeahlian17);
    }

    void setStatusAktif17(boolean status17) {
        statusAktif17 = status17;
    }

    int hitungMasaKerja17(int thnSkrg17) {
        return thnSkrg17 - tahunBergabung17;
    }

    void ubahKeahlian17(String bidang17) {
        bidangKeahlian17 = bidang17;
    }

    dosen17() {
    }

    dosen17(String idDosen17, String nama17, boolean statusAktif17, int tahunBergabung17, String bidangKeahlian17) {
        this.idDosen17 = idDosen17;
        this.nama17 = nama17;
        this.statusAktif17 = statusAktif17;
        this.tahunBergabung17 = tahunBergabung17;
        this.bidangKeahlian17 = bidangKeahlian17;
    }
}
