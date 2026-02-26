package P3;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Mahasiswa17[] arrayOfMahasiswa17 = new Mahasiswa17[3];
        arrayOfMahasiswa17[0] = new Mahasiswa17();
        arrayOfMahasiswa17[0].nim17 = "244107060033";
        arrayOfMahasiswa17[0].nama17 = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa17[0].kelas17 = "SIB - 1E";
        arrayOfMahasiswa17[0].ipk17 = (float) 3.75;

        arrayOfMahasiswa17[1] = new Mahasiswa17();
        arrayOfMahasiswa17[1].nim17 = "234120172";
        arrayOfMahasiswa17[1].nama17 = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa17[1].kelas17 = "TI - 2A";
        arrayOfMahasiswa17[1].ipk17 = (float) 3.36;

        arrayOfMahasiswa17[2] = new Mahasiswa17();
        arrayOfMahasiswa17[2].nim17 = "244107023006";
        arrayOfMahasiswa17[2].nama17 = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa17[2].kelas17 = "TI - 2E";
        arrayOfMahasiswa17[2].ipk17 = (float) 3.80;

        System.out.println("Nim    : " + arrayOfMahasiswa17[0].nim17);
        System.out.println("Nim    : " + arrayOfMahasiswa17[0].nama17);
        System.out.println("Nim    : " + arrayOfMahasiswa17[0].kelas17);
        System.out.println("Nim    : " + arrayOfMahasiswa17[0].ipk17);
        System.out.println("------------------------------------");
        System.out.println("Nim    : " + arrayOfMahasiswa17[1].nim17);
        System.out.println("Nim    : " + arrayOfMahasiswa17[1].nama17);
        System.out.println("Nim    : " + arrayOfMahasiswa17[1].kelas17);
        System.out.println("Nim    : " + arrayOfMahasiswa17[1].ipk17);
        System.out.println("------------------------------------");
        System.out.println("Nim    : " + arrayOfMahasiswa17[2].nim17);
        System.out.println("Nim    : " + arrayOfMahasiswa17[2].nama17);
        System.out.println("Nim    : " + arrayOfMahasiswa17[2].kelas17);
        System.out.println("Nim    : " + arrayOfMahasiswa17[2].ipk17);
        System.out.println("------------------------------------");
    }
}
