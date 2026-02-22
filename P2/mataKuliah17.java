public class mataKuliah17 {
    String kodeMK17, nama17;
    int sks17, jumlahJam17;

    void tampilInformasi17() {
        System.out.println("Kode MK    : " + kodeMK17);
        System.out.println("Nama MK    : " + nama17);
        System.out.println("SKS        : " + sks17);
        System.out.println("Jumlah Jam : " + jumlahJam17);
    }

    void ubahSKS17(int sksBaru17) {
        sks17 = sksBaru17;
    }

    void tambahJam17(int jam17) {
        jumlahJam17 += jam17;
    }

    void kurangiJam17(int jam17) {
        if(jumlahJam17 >= jam17){
            jumlahJam17 -= jam17;
        }else{
            System.out.println("Jumlah jam kurang");
        }
    }

    mataKuliah17() {

    }

    mataKuliah17(String kodeMK17, String nama17, int sks17, int jumlahJam17) {
        this.kodeMK17 = kodeMK17;
        this.nama17 = nama17;
        this.sks17 = sks17;
        this.jumlahJam17 = jumlahJam17;
    }
}
