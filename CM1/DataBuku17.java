package CM1;

public class DataBuku17 {
    Buku17[] listBuku = new Buku17[4];
    int idx;

    DataBuku17() {
        listBuku = new Buku17[4];
    }

    void tambah(Buku17 b) {
        if (idx < listBuku.length) {
            listBuku[idx] = b;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        System.out.println("\nDaftar Buku :");
        for (int i = 0; i < idx; i++) {
            System.out.println("Kode: " + listBuku[i].kode +
                    " | Judul: " + listBuku[i].judul +
                    " | Tahun: " + listBuku[i].tahun);
        }
    }
}
