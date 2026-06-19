# Laporan ASD Jobsheet 16

<h4>Nama : Muhammad Nur Rochman<h4>
<h4>NIM : 254107020121<h4>
<h4>Kelas : TI-1E<h4>

## 16.2. Kegiatan Praktikum 1

### 16.2.1. Percobaan 1

![Images](images/praktikum1_kode.png)

### 16.2.2. Verifikasi Hasil Percobaan

![Images](images/praktikum1_hasil.png)

### 16.2.3. Pertanyaan Percobaan

1. Jawaban: Karena objek ArrayList tersebut dideklarasikan secara mentah (raw type) tanpa menggunakan Generic (tanda <T>). Di dalam Java, jika kita tidak menentukan tipe data penampungnya secara spesifik, maka secara otomatis ArrayList akan menganggap semua elemen yang dimasukkan sebagai objek dari class tertinggi, yaitu java.lang.Object. Karena semua tipe data (termasuk primitive lewat proses autoboxing) merupakan turunan dari Object, maka jenis data apa saja bisa masuk ke dalam satu List yang sama.
2. kode

   ![Images](images/praktikum1_no2kode.png)

   hasil

   ![Images](images/praktikum1_no2hasil.png)

3. kode

   ![Images](images/praktikum1_no3kode.png)

4. kode

   ![Images](images/praktikum1_no4kode.png)

5. hasil

   ![Images](images/praktikum1_no5hasil.png)

   Penjelasan
   - Mengubah tipe menjadi LinkedList<String> memungkinkan penggunaan method spesifik dari struktur data Stack/Queue (seperti push(), getFirst(), dan getLast()) yang tidak tersedia jika menggunakan interface List biasa.
   - Method push() menerapkan prinsip LIFO (Last In First Out), sehingga data baru ("Mei-mei") dimasukkan ke posisi paling awal (indeks 0/head). Hal ini menggeser elemen lainnya ke belakang dan menambah total elemen menjadi 6.

## 16.3. Kegiatan Praktikum 2

### 16.3.1. Tahapan Percobaan

![Images](images/praktikum2_kode.png)

### 16.3.2. Verifikasi Hasil Percobaan

![Images](images/praktikum2_hasil.png)

### 16.3.3. Pertanyaan Percobaan

1. push() adalah method asli Stack untuk memasukkan elemen ke atas tumpukan, sedangkan add() adalah method warisan dari Collection untuk menyisipkan elemen di posisi paling akhir (seperti list biasa).
2. Output perulangan di bawahnya akan kosong karena data pada fruits sudah habis dikuras oleh perintah pop() di baris sebelumnya. Jika pengisian ulang (baris 43 & 44) dihapus, objek fruits tetap kosong.
3. Berfungsi untuk menampilkan seluruh elemen di dalam koleksi secara berurutan menggunakan objek Iterator lewat perulangan hasNext() dan next().
4. Berfungsi untuk menampilkan seluruh elemen di dalam koleksi secara berurutan menggunakan objek Iterator lewat perulangan hasNext() dan next().
5. No 5 dan 6
   Kode

   ![Images](images/praktikum2_no56kode.png)

   hasil

   ![Images](images/praktikum2_no56hasil.png)

## 16.4. Kegiatan Praktikum 3

### 16.4.1. Tahapan Percobaan

![Images](images/praktikum3_kode1.png)

![Images](images/praktikum3_kode2.png)

### 16.4.2. Verifikasi Hasil Percobaan

![Images](images/praktikum3_hasil.png)

### 16.4.3. Pertanyaan Percobaan

1. Konsep: Varargs (Variable Arguments).
   Kelebihan: Memungkinkan sebuah method untuk menerima parameter atau argumen dengan jumlah yang dinamis (bisa satu atau banyak sekaligus) tanpa perlu membungkus elemen-elemen tersebut ke dalam bentuk array secara manual terlebih dahulu sebelum dimasukkan ke dalam parameter fungsi.
2. kode
   ![Images](images/praktikum3_no2kode.png)

   hasil
   ![Images](images/praktikum3_no2hasil.png)

3. kode
   ![Images](images/praktikum3_no3kode.png)

   hasil
   ![Images](images/praktikum3_no3hasil.png)

## 16.5. Tugas Praktikum

![Images](images/Tugas.png)
