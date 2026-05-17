package P12;

public class DoubleLinkedList17 {
    Node17 head;
    Node17 tail;

    public DoubleLinkedList17() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa17 data) {

        Node17 newNode = new Node17(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa17 data) {
        Node17 newNode = new Node17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa17 data) {
        Node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node17 newNode17 = new Node17(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode17.prev = current;
            current.next = newNode17;
            tail = newNode17;
        } else {
            newNode17.prev = current;
            newNode17.next = current.next;
            current.next.prev = newNode17;
            current.next = newNode17;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node17 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {

        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node17 current = tail;

        System.out.println("Data secara reverse : ");

        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst17() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node17 hapus = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus");
        hapus.data.tampil();
    }

    public void removeLast17() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node17 hapus = tail;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus");
        hapus.data.tampil();
    }
}