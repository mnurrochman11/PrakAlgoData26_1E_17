//public package P2;

class mahasiswa17 {
    String nama17;
    String nim17;
    String kelas17;
    double ipk17;

    void tampiklkanInformasi17() {
        System.out.println("Nama: " + nama17);
        System.out.println("NIM: " + nim17);
        System.out.println("IPK: " + ipk17);
        System.out.println("Kelas: " + kelas17);
    }

    void ubahKelas17(String kelasBaru17) {
        kelas17 = kelasBaru17;
    }

    void updateIpk17(double ipkBaru17) {
        // ipk17 = ipkBaru17;
        if (ipkBaru17 >= 0.0 && ipkBaru17 <= 4.0) {
            ipk17 = ipkBaru17;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja17() {
        if (ipk17 >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk17 >= 3.0) {
            return "Kinerja baik";
        } else if (ipk17 >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}