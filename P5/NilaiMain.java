package P5;

public class NilaiMain {
    public static void main(String[] args) {
        // opsional ya, kalau sesuai soal gausa dikasi gpp
        String[][] nama = {
                { "Ahmad" },
                { "Budi" },
                { "Cindy" },
                { "Dian" },
                { "Eko" },
                { "Fajar" },
                { "Gina" },
                { "Hadi" }
        };

        // ini juga opsional ditambah nim sama tahun, yang dibutuhin cuma nilai uts dan uas
        int[][] data = {
                { 220101001, 2022, 78, 82 },
                { 220101002, 2022, 85, 88 },
                { 220101003, 2021, 90, 87 },
                { 220101004, 2021, 76, 79 },
                { 220101005, 2023, 92, 95 },
                { 220101006, 2020, 88, 85 },
                { 220101007, 2023, 80, 83 },
                { 220101008, 2020, 82, 84 }
        };

        Nilai nilai = new Nilai();

        int maxUTS = nilai.niaiTertinggi(data, 0, data.length - 1);
        System.out.println("Nilai UTS tertinggi : " + maxUTS);

        int minUTS = nilai.nilaiTerendah(data, 0, data.length - 1);
        System.out.println("Nilai UTS terendah : " + minUTS);

        double rataUAS = nilai.rataUAS(data);
        System.out.println("Rata-rata nilai UAS : " + rataUAS);
    }
}
