public class AntrianKRS17 {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahDiproses;

    public AntrianKRS17(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
        jumlahDiproses = 0;
    }

    boolean IsEmpty() {
        return size == 0;
    }

    boolean IsFull() {
        return size == max;
    }

    void enqueue(Mahasiswa m) {
        if (IsFull()) {
            System.out.println("Antrian penuh");
            return;
        }
        if (IsEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = m;
        size++;
        System.out.println(m.nama + " masuk antrian");
    }

    void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
            return;
        }

        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
        }
    }

    void print() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % max;
                data[idx].tampilkanData();
            }
        }
    }

    void peek2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
        } else {
            System.out.println("2 terdepan:");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    void lihatAkhir() {
        if (!IsEmpty()) {
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    int getJumlah() {
        return size;
    }

    int getJumlahDiproses() {
        return jumlahDiproses;
    }

    int sisaBelumProses() {
        return 30 - jumlahDiproses;
    }
}