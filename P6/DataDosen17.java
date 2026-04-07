package P6;

public class DataDosen17 {
    Dosen17 dataDosen[] = new Dosen17[10];
    int idx;

    void tambah(Dosen17 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data berhasil ditambahkan");
        }
    }

    void tampil() {
        System.out.println("No  Kode   Nama       Kelamin    Usia");
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil(i + 1);
        }
        System.out.println("Data berhasil ditampilkan");
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen17 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan ASC");
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen17 tmp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = tmp;
        }
        System.out.println("Data berhasil diurutkan DSC");
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen17 temp = dataDosen[i];
            int j = i - 1;

            while (j >= 0 && dataDosen[j].usia > temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }
}
