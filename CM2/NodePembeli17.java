package CM2;

public class NodePembeli17 {
    int noAntrian;
    Pembeli17 data;
    NodePembeli17 prev;
    NodePembeli17 next;

    public NodePembeli17(int noAntrian, Pembeli17 data) {
        this.noAntrian = noAntrian;
        this.data = data;
        prev = null;
        next = null;
    }
}