package CM2;

public class DoubleLinkedListPembeli17 {
    NodePembeli17 head;
    NodePembeli17 tail;
    int nomor = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Pembeli17 data) {
        NodePembeli17 newNode = new NodePembeli17(nomor++, data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor : " + (nomor - 1));
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        NodePembeli17 current = head;
        System.out.println("===========================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("===========================");
        System.out.println("No\tNama\t\tNo HP");

        while (current != null) {
            System.out.println(
                    current.noAntrian + "\t" +
                            current.data.namaPembeli + "\t\t" +
                            current.data.noHp);
            current = current.next;
        }
    }

    public NodePembeli17 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        NodePembeli17 hapus = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return hapus;
    }
}