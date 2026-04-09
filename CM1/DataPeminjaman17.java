package CM1;

public class DataPeminjaman17 {
    Peminjaman17[] listPinjam = new Peminjaman17[5];
    int idx;

    DataPeminjaman17() {
        listPinjam = new Peminjaman17[5];
    }

    void tambah(Peminjaman17 p) {
        if (idx < listPinjam.length) {
            listPinjam[idx] = p;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        System.out.println("\nDaftar Peminjaman :");
        for (int i = 0; i < idx; i++) {
            System.out.println("NIM: " + listPinjam[i].nim +
                    " | Nama: " + listPinjam[i].nama +
                    " | Judul: " + listPinjam[i].judul +
                    " | Lama: " + listPinjam[i].lama +
                    " | Terlambat: " + listPinjam[i].terlambat +
                    " hari | Denda: " + listPinjam[i].denda);
        }
    }

    void insertionSort() {
        for (int i = 1; i < listPinjam.length; i++) {
            Peminjaman17 temp = listPinjam[i];
            int j = i - 1;
            while (j >= 0 && listPinjam[j].denda < temp.denda) {
                listPinjam[j + 1] = listPinjam[j];
                j--;
            }
            listPinjam[j + 1] = temp;
        }
    }

    void cariNIM(String key) {
        boolean ditemukan = false;
        for (int i = 0; i < idx; i++) {
            if (listPinjam[i].nim.equals(key)) {
                if (!ditemukan) {
                    System.out.println("\nData ditemukan!");
                }
                System.out.println("NIM: " + listPinjam[i].nim +
                        " | Nama: " + listPinjam[i].nama +
                        " | Judul: " + listPinjam[i].judul +
                        " | Lama: " + listPinjam[i].lama +
                        " | Terlambat: " + listPinjam[i].terlambat +
                        " hari | Denda: " + listPinjam[i].denda);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("\nData dengan NIM " + key + " tidak ditemukan.\n");
        }
        System.out.println();
    }
}
