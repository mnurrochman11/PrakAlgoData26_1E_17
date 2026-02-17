import java.util.Scanner;

public class tugas2_17 {
    static Scanner nur17 = new Scanner(System.in);

    static void inputJadwal17(int banyakJadwal17, String[][] daftarJadwal17, String[] jadwal17) {
        for (int i = 0; i < banyakJadwal17; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            for (int j = 0; j < daftarJadwal17[i].length; j++) {
                System.out.print("Input " + jadwal17[j] + " : ");
                daftarJadwal17[i][j] = nur17.nextLine();
            }
        }
    }

    static void tampilData17(String[][] daftarJadwal17, String[] jadwal17) {
        System.out.printf("%-15s", "\nJadwal ke");
        for (int i = 0; i < jadwal17.length; i++) {
            System.out.printf("%-20s", jadwal17[i]);
        }
        System.out.println();
        System.out.println("==================================================================================");
        for (int i = 0; i < daftarJadwal17.length; i++) {
            System.out.printf("%-14d", i + 1);
            for (int j = 0; j < daftarJadwal17[i].length; j++) {
                System.out.printf("%-20s", daftarJadwal17[i][j]);
            }
            System.out.println();
        }
    }

    static void tampilHari17(String[][] daftarJadwal17, String Hari17, String[] jadwal17) {
        for (int i = 0; i < jadwal17.length; i++) {
            System.out.printf("%-20s", jadwal17[i]);
        }
        System.out.println();
        System.out.println("==================================================================================");
        for (int i = 0; i < daftarJadwal17.length; i++) {
            if (daftarJadwal17[i][2].equalsIgnoreCase(Hari17)) {
                for (int j = 0; j < daftarJadwal17[i].length; j++) {
                    System.out.printf("%-20s", daftarJadwal17[i][j]);
                }
                System.out.println();
            }else{
                System.out.println("Data tidak ditemukan");
                break;
            }
        }
    }

    static void tampilMatkul17(String[][] daftarJadwal17, String Hari17, String[] jadwal17) {
        for (int i = 0; i < jadwal17.length; i++) {
            System.out.printf("%-20s", jadwal17[i]);
        }
        System.out.println();
        System.out.println("==================================================================================");
        for (int i = 0; i < daftarJadwal17.length; i++) {
            if (daftarJadwal17[i][0].equalsIgnoreCase(Hari17)) {
                for (int j = 0; j < daftarJadwal17[i].length; j++) {
                    System.out.printf("%-20s", daftarJadwal17[i][j]);
                }
                System.out.println();
            }else{
                System.out.println("Data tidak ditemukan");
                break;
            }
        }
    }

    public static void main(String[] args) {
        String[][] jadwalKuliah17;
        String[] informasiJadwal17 = { "Nama Mata Kuliah", "Ruang", "Hari", "Jam" };
        int inputJumlahJadwal17;
        String inputHari17, inputMatkul17, tampilHari17, tampilMatkul17;

        System.out.print("Masukkan jumlah jadwal : ");
        inputJumlahJadwal17 = nur17.nextInt();
        nur17.nextLine();
        jadwalKuliah17 = new String[inputJumlahJadwal17][4];
        inputJadwal17(inputJumlahJadwal17, jadwalKuliah17, informasiJadwal17);
        tampilData17(jadwalKuliah17, informasiJadwal17);
        System.out.print("\nTampilkan jadwal sesuai hari?(y/n)");
        tampilHari17 = nur17.next();
        if (tampilHari17.equalsIgnoreCase("y")) {
            System.out.print("Masukkan hari : ");
            inputHari17 = nur17.next();
            System.out.println();
            tampilHari17(jadwalKuliah17, inputHari17, informasiJadwal17);
        }

        System.out.print("\nTampilkan jadwal sesuai matkul?(y/n)");
        tampilMatkul17 = nur17.next();
        if (tampilMatkul17.equalsIgnoreCase("y")) {
            System.out.print("Masukkan matkul : ");
            inputMatkul17 = nur17.next();
            System.out.println();
            tampilMatkul17(jadwalKuliah17, inputMatkul17, informasiJadwal17);
        }

    }
}
