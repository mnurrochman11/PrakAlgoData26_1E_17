package P11;

import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SingleLinkedList17 sll = new SingleLinkedList17();

        Mahasiswa17 mhs1 = new Mahasiswa17("21212203", "Dirga", "4D", 3.6);
        Mahasiswa17 mhs2 = new Mahasiswa17("23212201", "Bimon", "2B", 3.8);
        Mahasiswa17 mhs3 = new Mahasiswa17("22212202", "Cintia", "3C", 3.5);
        Mahasiswa17 mhs4 = new Mahasiswa17("24212200", "Alvaro", "1A", 4.0);

        sll.print();

        sll.addFirst(mhs1);
        sll.print();

        sll.addLast(mhs4);
        sll.print();

        sll.insertAfter("Dirga", mhs3);

        sll.insertAt(2, mhs2);

        sll.print();
        // for (int i = 1; i <= 4; i++) {

        //     System.out.println("Data Mahasiswa ke-" + i);

        //     System.out.print("NIM   : ");
        //     String nim = sc.nextLine();

        //     System.out.print("Nama  : ");
        //     String nama = sc.nextLine();

        //     System.out.print("Kelas : ");
        //     String kelas = sc.nextLine();

        //     System.out.print("IPK   : ");
        //     double ipk = sc.nextDouble();
        //     sc.nextLine();

        //     Mahasiswa17 mhs = new Mahasiswa17(nim, nama, kelas, ipk);

        //     if (i == 1) {
        //         sll.addFirst(mhs);
        //     } else {
        //         sll.addLast(mhs);
        //     }

        //     sll.print();
        // }

        System.out.println("data index 1 : ");
        sll.getData17(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf17("bimon"));
        System.out.println();

        sll.removeFirst17();
        sll.removeLast17();
        sll.print();
        sll.removeAt17(0);
        sll.print();
    }
}