import java.util.Scanner;

public class array17 {

    public static void main(String[] args) {
        Scanner nur17 = new Scanner(System.in);
        String[] matkul17 = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical thinking dan problem solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        }, nHuruf17 = new String[matkul17.length];
        int[] sks17 = { 2, 2, 2, 3, 2, 2, 3, 2}; 
        Double[] nAngka17 = new Double[matkul17.length], nSetara17 = new Double[matkul17.length];
        double totalSKS17 = 0, ip17;
        int totalSKSMatkul = 0;

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        for (int i = 0; i < matkul17.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + matkul17[i] + " : ");
            nAngka17[i] = nur17.nextDouble();
            if (nAngka17[i] > 80 && nAngka17[i] <= 100) {
                nHuruf17[i] = "A";
                nSetara17[i] = 4.0;
            } else if (nAngka17[i] > 73 && nAngka17[i] <= 80) {
                nHuruf17[i] = "B+";
                nSetara17[i] = 3.5;
            } else if (nAngka17[i] > 65 && nAngka17[i] <= 73) {
                nHuruf17[i] = "B";
                nSetara17[i] = 3.0;
            } else if (nAngka17[i] > 60 && nAngka17[i] <= 65) {
                nHuruf17[i] = "C+";
                nSetara17[i] = 2.5;
            } else if (nAngka17[i] > 50 && nAngka17[i] <= 60) {
                nHuruf17[i] = "C";
                nSetara17[i] = 2.0;
            } else if (nAngka17[i] > 39 && nAngka17[i] <= 50) {
                nHuruf17[i] = "D";
                nSetara17[i] = 1.0;
            } else {
                nHuruf17[i] = "E";
                nSetara17[i] = 0.0;
            }
            totalSKS17 += nSetara17[i] * sks17[i];
            totalSKSMatkul += sks17[i];
        }
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-12s %-12s %-12s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("-------------------------------------------------------------------------------");
        for (int i = 0; i < matkul17.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f%n", matkul17[i], nAngka17[i], nHuruf17[i], nSetara17[i]);
        }
        System.out.println("==============================");
        ip17 = totalSKS17 / totalSKSMatkul;
        System.out.printf("IP Semester = %.2f%n", ip17);
        System.out.println("==============================");
    }
}
