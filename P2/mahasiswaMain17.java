public class mahasiswaMain17 {

    public static void main(String[] args) {
        mahasiswa17 mhsi_17 = new mahasiswa17();
        mhsi_17.nama17 = "Muhammad Ali Farhan";
        mhsi_17.nim17 = "2241720171";
        mhsi_17.kelas17 = "S1 2J";
        mhsi_17.ipk17 = 3.55;

        mhsi_17.tampiklkanInformasi17();
        mhsi_17.ubahKelas17("S1 2K");
        mhsi_17.updateIpk17(3.60);
        mhsi_17.tampiklkanInformasi17();

        mahasiswa17 mhs2_17 = new mahasiswa17("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2_17.updateIpk17(3.30);
        mhs2_17.tampiklkanInformasi17();
    }
}
