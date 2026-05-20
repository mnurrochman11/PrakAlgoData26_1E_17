package CM2;

public class DoubleLinkedListPesanan17 {
    NodePesanan17 head;
    NodePesanan17 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Pesanan17 data) {
        NodePesanan17 newNode = new NodePesanan17(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sorting() {
        if (head == null) {
            return;
        }

        for (NodePesanan17 i = head; i.next != null; i = i.next) {
            for (NodePesanan17 j = head; j.next != null; j = j.next) {
                if (j.data.namaPesanan.compareToIgnoreCase(j.next.data.namaPesanan) > 0) {
                    Pesanan17 temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
            return;
        }
        sorting();
        NodePesanan17 current = head;
        System.out.println("Kode\tNama Pesanan\t\tHarga");

        while (current != null) {
            System.out.println(
                    current.data.kodePesanan + "\t" +
                    current.data.namaPesanan + "\t\t" +
                    current.data.harga);
            current = current.next;
        }
    }
}