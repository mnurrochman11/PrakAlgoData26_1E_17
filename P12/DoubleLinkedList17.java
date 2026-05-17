package P12;

public class DoubleLinkedList17 {
    Node17 head;
    Node17 tail;
    int size;

    public DoubleLinkedList17() {
        head = null;
        tail = null;
        size = 0;
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
        size++;
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
        size++;
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
        size++;
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
        size--;
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
        size--;
        System.out.println("Data berhasil dihapus");
        hapus.data.tampil();
    }

    public void add(int index, Mahasiswa17 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node17 current = head;
        int i = 0;
        while (i < index - 1) {
            current = current.next;
            i++;
        }

        Node17 newNode = new Node17(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node17 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Node setelah key tidak ditemukan");
            return;
        }

        Node17 hapus = current.next;
        if (hapus == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = hapus.next;
            hapus.next.prev = current;
        }
        size--;
        System.out.println("Data yang dihapus:");
        hapus.data.tampil();
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        if (index == 0) {
            removeFirst17();
            return;
        }

        if (index == size - 1) {
            removeLast17();
            return;
        }

        Node17 current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println("Data yang dihapus:");
        current.data.tampil();
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        System.out.println("Data pertama:");
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        System.out.println("Data terakhir:");
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }

        Node17 current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }

    public void getSize() {
        System.out.println("Jumlah data: " + size);
    }
}