package P3;

public class DataDosen17 {

    public void dataSemuaDosen17(Dosen17[] arrayOfDosen17) {
        int no17 = 1;
        for (Dosen17 dsn17 : arrayOfDosen17) {
            System.out.println("Data Dosen ke-" + no17);
            dsn17.cetakInfo17();
            no17++;
        }
    }

    public void jumlahDosenPerJenisKelamin17(Dosen17[] arrayOfDosen17) {
        int pria17 = 0;
        int wanita17 = 0;

        for (Dosen17 dsn17 : arrayOfDosen17) {
            if (dsn17.jenisKelamin17) {
                pria17++;
            } else {
                wanita17++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria17);
        System.out.println("Jumlah Dosen Wanita : " + wanita17);
    }

    public void rerataUsiaDosenPerJenisKelamin17(Dosen17[] arrayOfDosen17) {
        int totalPria17 = 0, countPria17 = 0;
        int totalWanita17 = 0, countWanita17 = 0;

        for (Dosen17 dsn17 : arrayOfDosen17) {
            if (dsn17.jenisKelamin17) {
                totalPria17 += dsn17.usia17;
                countPria17++;
            } else {
                totalWanita17 += dsn17.usia17;
                countWanita17++;
            }
        }

        System.out.println("Rata-rata Usia Dosen Pria   : " +
                (countPria17 > 0 ? (totalPria17 / countPria17) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita : " +
                (countWanita17 > 0 ? (totalWanita17 / countWanita17) : 0));
    }

    public void infoDosenPalingTua17(Dosen17[] arrayOfDosen17) {
        Dosen17 tertua17 = arrayOfDosen17[0];

        for (Dosen17 dsn17 : arrayOfDosen17) {
            if (dsn17.usia17 > tertua17.usia17) {
                tertua17 = dsn17;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua17.cetakInfo17();
    }

    public void infoDosenPalingMuda17(Dosen17[] arrayOfDosen17) {
        Dosen17 termuda17 = arrayOfDosen17[0];

        for (Dosen17 dsn17 : arrayOfDosen17) {
            if (dsn17.usia17 < termuda17.usia17) {
                termuda17 = dsn17;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda17.cetakInfo17();
        
    }
    
}
