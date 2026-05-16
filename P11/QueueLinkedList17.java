package P11;

public class QueueLinkedList17 {
    NodeMahasiswa17 front;
    NodeMahasiswa17 rear;
    int size;

    public QueueLinkedList17() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty17() {
        return front == null;
    }

    public boolean isFull17() {
        return false;
    }

    public void clear17() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue17(Mahasiswa17 input) {
        NodeMahasiswa17 ndInput = new NodeMahasiswa17(input, null);
        if (isEmpty17()) {
            front = rear = ndInput;
        } else {
            rear.next = ndInput;
            rear = ndInput;
        }
        size++;
        System.out.println(input.nama + " berhasil masuk antrian");
    }

    public void dequeue17() {
        if (isEmpty17()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa dipanggil : ");
            front.data.tampilInformasi();

            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    public void peekFront17() {
        if (isEmpty17()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terdepan : ");
            front.data.tampilInformasi();
        }
    }

    public void peekRear17() {
        if (isEmpty17()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian paling akhir : ");
            rear.data.tampilInformasi();
        }
    }

    public void print17() {
        if (isEmpty17()) {
            System.out.println("Antrian kosong");
        } else {
            NodeMahasiswa17 temp = front;
            System.out.println("Isi Antrian : ");

            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void jumlahAntrian17() {
        System.out.println("Jumlah mahasiswa yang masih mengantre : " + size);
    }
}