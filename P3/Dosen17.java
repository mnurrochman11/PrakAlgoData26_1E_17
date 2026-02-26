package P3;

public class Dosen17 {
    public String kode17;
    public String nama17;
    public boolean jenisKelamin17;
    public int usia17;

    public Dosen17(String kode17, String nama17, boolean jenisKelamin17, int usia17) {
        this.kode17 = kode17;
        this.nama17 = nama17;
        this.jenisKelamin17 = jenisKelamin17;
        this.usia17 = usia17;
    }

    public void cetakInfo17() {
        System.out.println("Kode          : " + kode17);
        System.out.println("Nama          : " + nama17);
        System.out.println("Jenis Kelamin : " + (jenisKelamin17 ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia17);
        System.out.println("-------------------------------------");
    }
}