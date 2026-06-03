package P14;

public class BinaryTreeArray17 {
    Mahasiswa17[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray17() {
        this.dataMahasiswa = new Mahasiswa17[10];
    }

    void populateData(Mahasiswa17 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa17 mahasiswa) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = mahasiswa;
            idxLast = 0;
            return;
        }

        int idx = 0;

        while (idx < dataMahasiswa.length) {
            if (mahasiswa.ipk < dataMahasiswa[idx].ipk) {
                idx = 2 * idx + 1;
            } else {
                idx = 2 * idx + 2;
            }

            if (idx < dataMahasiswa.length && dataMahasiswa[idx] == null) {
                dataMahasiswa[idx] = mahasiswa;
                idxLast = Math.max(idxLast, idx);
                break;
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
