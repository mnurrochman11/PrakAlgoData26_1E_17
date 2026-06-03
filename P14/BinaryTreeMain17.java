package P14;

public class BinaryTreeMain17 {
    public static void main(String[] args) {
        BinaryTree17 tree = new BinaryTree17();
        BinaryTree17 bst = new BinaryTree17();

        bst.add(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa17("244160222", "Badar", "B", 3.85));
        bst.add(new Mahasiswa17("244160185", "Chandra", "C", 3.21));
        bst.add(new Mahasiswa17("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in oder traversal)");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa)");
        System.out.println("Cari mahasiswa denga IPK 3.54: ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.println("Cari mahasiswa dengan IPK 3.22: ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa17("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa17("244160205", "Ehsan", "D ", 3.37));
        bst.add(new Mahasiswa17("244160170", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa");
        System.out.println("inOrder traversal: ");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder traversal: ");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder traversal: ");
        bst.traversePostOrder(bst.root);    

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (inOrder traversal): ");
        bst.traverseInOrder(bst.root);
    }

}
