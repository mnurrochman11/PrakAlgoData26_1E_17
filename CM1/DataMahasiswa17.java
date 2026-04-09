package CM1;

public class DataMahasiswa17 {
    Mahasiswa17[] listMhs = new Mahasiswa17[3];
    int idx;

    DataMahasiswa17() {
        listMhs = new Mahasiswa17[3];
    }

    void tambah(Mahasiswa17 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        System.out.println("\nDaftar Mahasiswa :");
        for (int i = 0; i < idx; i++) {
            System.out.println("NIM: " + listMhs[i].nim +
                    " | Nama: " + listMhs[i].nama +
                    " | Prodi: " + listMhs[i].prodi);
        }
    }

}
