public class dosenMain17 {
    public static void main(String[] args) {
        dosen17 dsn1_17 = new dosen17();
        dsn1_17.idDosen17 = "D001";
        dsn1_17.nama17 = "Jamillah Arrohman";
        dsn1_17.statusAktif17 = true;
        dsn1_17.tahunBergabung17 = 2010;
        dsn1_17.bidangKeahlian17 = "Bahasa Inggris";
        dsn1_17.tampilInformasi17();
        System.out.println("Masa Kerja      : " + dsn1_17.hitungMasaKerja17(2026));
        System.out.println();

        dosen17 dsn2_17 = new dosen17("D002", "Rahmad Dwi", true, 2015, "Basis Data");
        dsn2_17.tampilInformasi17();
        System.out.println("Masa Kerja      : " + dsn2_17.hitungMasaKerja17(2026));
        System.out.println();

        dsn2_17.ubahKeahlian17("Desain Antarmukaa");
        dsn2_17.setStatusAktif17(false);
        dsn2_17.tampilInformasi17();
        System.out.println("Masa Kerja      : " + dsn2_17.hitungMasaKerja17(2026));
    }
}
