package Praktikum14;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {
    public static void main(String[] args) {

        // Sorting String
        ArrayList<String> daftarSiswa = new ArrayList<>();

        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");

        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        System.out.println();

        // Sorting Customer berdasarkan name
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "Zakia"));
        customers.add(new Customer(5, "Budi"));
        customers.add(new Customer(4, "Cica"));
        customers.add(new Customer(100, "Rosa"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println(customers);
    }
}