public class mataKuliahMain17 {
    public static void main(String[] args) {
        mataKuliah17 mtkl1_17 = new mataKuliah17();
        mtkl1_17.kodeMK17 = "A001";
        mtkl1_17.nama17 = "Algoritma dan Struktur Data";
        mtkl1_17.sks17 = 3;
        mtkl1_17.jumlahJam17 = 5;
        mtkl1_17.tampilInformasi17();
        System.out.println();

        mtkl1_17.ubahSKS17(2);
        mtkl1_17.tambahJam17(2);
        mtkl1_17.kurangiJam17(3);
        mtkl1_17.tampilInformasi17();
        System.out.println();

        mataKuliah17 mtkl2_17 = new mataKuliah17("A002", "Basis Data", 3, 5);
        mtkl2_17.tampilInformasi17(); 
        System.out.println();

        mtkl2_17.ubahSKS17(2);
        mtkl2_17.tambahJam17(4);
        mtkl2_17.kurangiJam17(2);
        mtkl2_17.tampilInformasi17();

    }
}
