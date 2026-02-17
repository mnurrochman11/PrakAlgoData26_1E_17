public class fungsi17 {
    static int pendapatanCabang17(int[] stok17, int[] harga17) {
        int pendapatanCabang17 = 0;
        for (int i = 0; i < stok17.length; i++) {
            pendapatanCabang17 += stok17[i] * harga17[i];
        }
        return pendapatanCabang17;
    }

    static String statusCabang17(int penjualanCabang17) {
        if (penjualanCabang17 > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    static void tampilData(String[] Cabang17, int[][] stok17, int[] harga17) {
        System.out.println();
        System.out.println("Status Cabang : ");

        for (int i = 0; i < Cabang17.length; i++) {
            int penghasilan = pendapatanCabang17(stok17[i], harga17);
            String kategori = statusCabang17(penghasilan);
            System.out.println(Cabang17[i] + "     Rp. " + penghasilan + "      " + kategori);
        }
    }

    public static void main(String[] args) {
        String[] cabangToko17 = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };

        int[][] stokBunga17 = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };
        int[] hargaSatuan17 = { 75000, 50000, 60000, 10000 };

        System.out.printf("%-15s %-10s %-10s %-10s %-10s%n",
                " ", "Aglonema", "Keladi", "Alocasia", "Mawar");

        for (int i = 0; i < cabangToko17.length; i++) {
            System.out.printf("%-16s", cabangToko17[i]);
            for (int j = 0; j < stokBunga17[i].length; j++) {
                System.out.printf("%-11d", stokBunga17[i][j]);
            }
            System.out.println();
        }

        tampilData(cabangToko17, stokBunga17, hargaSatuan17);

    }
}
