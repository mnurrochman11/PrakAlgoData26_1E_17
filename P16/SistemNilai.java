package P16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class MhsTugas {
    String nim;
    String nama;
    String telf;

    public MhsTugas(String nim, String nama, String telf) {
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }
}

class MkTugas {
    String kode;
    String nama;
    int sks;

    public MkTugas(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
}

class NilaiTugas {
    MhsTugas mhs;
    MkTugas mk;
    double nilai;

    public NilaiTugas(MhsTugas mhs, MkTugas mk, double nilai) {
        this.mhs = mhs;
        this.mk = mk;
        this.nilai = nilai;
    }
}

public class SistemNilai {
    private static List<MhsTugas> listMahasiswa = new ArrayList<>();
    private static List<MkTugas> listMataKuliah = new ArrayList<>();
    private static List<NilaiTugas> listNilai = new ArrayList<>();
    private static Queue<NilaiTugas> queueHapusNilai = new LinkedList<>();

    public static void main(String[] args) {
        initData();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("*****************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*****************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Nilai Terdepan (Queue)");
            System.out.println("6. Keluar");
            System.out.println("*****************************************************");
            System.out.print("Pilih     : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nilai     : ");
                    double nilaiInput = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("\nDAFTAR MAHASISWA");
                    System.out.println("*****************************************************");
                    System.out.printf("%-10s %-15s %-15s\n", "NIM", "Nama", "Telf");
                    for (MhsTugas mhs : listMahasiswa) {
                        System.out.printf("%-10s %-15s %-15s\n", mhs.nim, mhs.nama, mhs.telf);
                    }
                    System.out.print("Pilih mahasiswa by nim: ");
                    String nimPilih = sc.nextLine();
                    MhsTugas mhsTerpilih = cariMahasiswa(nimPilih);

                    System.out.println("\nDAFTAR MATA KULIAH");
                    System.out.println("*****************************************************");
                    System.out.printf("%-10s %-35s %-5s\n", "Kode", "Mata Kuliah", "SKS");
                    for (MkTugas mk : listMataKuliah) {
                        System.out.printf("%-10s %-35s %-5d\n", mk.kode, mk.nama, mk.sks);
                    }
                    System.out.print("Pilih MK by kode: ");
                    String kodePilih = sc.nextLine();
                    MkTugas mkTerpilih = cariMataKuliah(kodePilih);

                    if (mhsTerpilih != null && mkTerpilih != null) {
                        NilaiTugas nilaiBaru = new NilaiTugas(mhsTerpilih, mkTerpilih, nilaiInput);
                        listNilai.add(nilaiBaru);
                        queueHapusNilai.add(nilaiBaru);
                    } else {
                        System.out.println("NIM atau Kode MK tidak valid!");
                    }
                    break;

                case 2:
                    cetakDaftarNilai(listNilai);
                    break;

                case 3:
                    cetakDaftarNilai(listNilai);
                    System.out.print("Masukkan data mahasiswa[nim] : ");
                    String searchNim = sc.nextLine();
                    
                    int totalSks = 0;
                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.println("*****************************************************");
                    System.out.printf("%-10s %-15s %-35s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (NilaiTugas n : listNilai) {
                        if (n.mhs.nim.equals(searchNim)) {
                            System.out.printf("%-10s %-15s %-35s %-5d %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks, n.nilai);
                            totalSks += n.mk.sks;
                        }
                    }
                    System.out.println("Total SKS " + totalSks + " telah diambil.");
                    break;

                case 4:
                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.println("*****************************************************");
                    List<NilaiTugas> sortedList = new ArrayList<>(listNilai);
                    Collections.sort(sortedList, new Comparator<NilaiTugas>() {
                        @Override
                        public int compare(NilaiTugas n1, NilaiTugas n2) {
                            return Double.compare(n1.nilai, n2.nilai);
                        }
                    });
                    cetakDaftarNilai(sortedList);
                    break;

                case 5:
                    if (!queueHapusNilai.isEmpty()) {
                        NilaiTugas dihapus = queueHapusNilai.poll();
                        listNilai.remove(dihapus);
                        System.out.println("Data nilai terdepan milik " + dihapus.mhs.nama + " berhasil dihapus dari antrean.");
                    } else {
                        System.out.println("Antrean nilai kosong!");
                    }
                    break;

                case 6:
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 6);

        sc.close();
    }

    private static void initData() {
        listMahasiswa.add(new MhsTugas("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new MhsTugas("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new MhsTugas("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new MhsTugas("20004", "Sa'ad", "021xxx"));
        listMahasiswa.add(new MhsTugas("20005", "Sa'id", "021xxx"));
        listMahasiswa.add(new MhsTugas("20006", "Ubaidah", "021xxx"));

        listMataKuliah.add(new MkTugas("00001", "Internet of Things", 3));
        listMataKuliah.add(new MkTugas("00002", "Algoritma dan Struktur Data", 2));
        listMataKuliah.add(new MkTugas("00003", "Algoritma dan Pemrograman", 2));
        listMataKuliah.add(new MkTugas("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMataKuliah.add(new MkTugas("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    private static MhsTugas cariMahasiswa(String nim) {
        for (MhsTugas mhs : listMahasiswa) {
            if (mhs.nim.equals(nim)) return mhs;
        }
        return null;
    }

    private static MkTugas cariMataKuliah(String kode) {
        for (MkTugas mk : listMataKuliah) {
            if (mk.kode.equals(kode)) return mk;
        }
        return null;
    }

    private static void cetakDaftarNilai(List<NilaiTugas> list) {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("*****************************************************");
        System.out.printf("%-10s %-15s %-35s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (NilaiTugas n : list) {
            System.out.printf("%-10s %-15s %-35s %-5d %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks, n.nilai);
        }
    }
}