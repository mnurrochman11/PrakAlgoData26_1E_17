public class PaketPengiriman17 {

    public String nomorResi17;
    public double berat17;
    public double ongkosDasar17;

    //untuk menyimpan data array
    public PaketPengiriman17(String nomorResi17, double berat17, double ongkosDasar17) {
        this.nomorResi17 = nomorResi17;
        this.berat17 = berat17;
        this.ongkosDasar17 = ongkosDasar17;
    }

    //menghitung ongkos(belom selesai)
    public void totalOngkos(PaketPengiriman17[] arrayN) {
        double totalOngkos17 = 0;
        for (PaketPengiriman17 ttl17 : arrayN) {
            totalOngkos17 = ttl17.ongkosDasar17;

        }

    }

    //test print(belom dimasukkin di main)
    public void printData() {
        System.out.println("nomor          : " + nomorResi17);
        System.out.println("berat          : " + berat17);
        System.out.println("ongkos : " + ongkosDasar17);
        System.out.println("-------------------------------------");
    }

}
