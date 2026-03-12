import java.util.Scanner;

public class PaketPengirimanMain17 {
    public static void main(String[] args) {
        Scanner nur17 = new Scanner(System.in);
        int jumlahBarang17;
        String nomorResi17;
        double berat17;
        double ongkosDasar17;


        //Memasukkan jumlah barang yang ingin diisi
        System.out.print("Masukkan Jumlah Barang : ");
        jumlahBarang17 = nur17.nextInt();
        nur17.nextLine();

        //Jumlah array berdasarkan jumlah input
        PaketPengiriman17[] arrayN = new PaketPengiriman17[jumlahBarang17];

        //memasukkan resi, berat, dan ongkos secara berulang kemudian dimasukkan ke array
        for (int i = 0; i < jumlahBarang17; i++) {
            System.out.println("Data ke-" + (i+1));
            System.out.print("Masukkan Resi : ");
            nomorResi17 = nur17.nextLine();
            System.out.print("Masukkan Berat : ");
            berat17 = nur17.nextDouble();
            System.out.print("Masukkan Ongkos : ");
            ongkosDasar17 = nur17.nextDouble();
            nur17.nextLine();

            arrayN[i] = new PaketPengiriman17(nomorResi17, berat17, ongkosDasar17);
        }

        

    }
}
