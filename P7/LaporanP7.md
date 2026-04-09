# Laporan ASD Jobsheet 7

<h4>Nama : Muhammad Nur Rochman<h4>
<h4>NIM : 254107020121<h4>
<h4>Kelas : TI-1E<h4>

## 6.2. Searching/ Pencarian Menggunakan Algoritma Sequential Search
### 6.2.1. Langkah-langkah Percobaan Sequential Search
![images](images/621_1.png)
![images](images/621_2.png)
![images](images/621_3.png)
### 6.2.2. Verifikasi Hasil Percobaan
![images](images/622.png)
### 6.2.3. Pertanyaan
1. - tampilPosisi(): Menampilkan posisi/index data yang ditemukan
   - tampilDataSearch() : Menampilkan isi data mahasiswa yang ditemukan
2. - Digunakan untuk menghentikan perulangan saat data sudah ditemukan
   - Jadi program tidak mencari lagi ke data berikutnya
3. - Menyimpan index/posisi data yang ditemukan
   - Dipakai untuk menampilkan data yang sesuai
4. - Yang ditampilkan adalah data pertama yang ditemukan
   - Karena ada break
5. - Program akan terus mencari sampai akhir array
   - Hasilnya: posisi terakhir yang sama akan disimpan
## 6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search
### 6.3.1. Langkah-langkah Percobaan Binary Search
![images](images/631_1.png)
![images](images/631_2.png)
### 6.3.2. Verifikasi Hasil Percobaan
![images](images/632.png)

### 6.3.3. Pertanyaan
1. Membagi data menjadi dua bagian : mid = (left + right) / 2;
2. Mencari di salah satu bagian :
   - return findBinarySearch(cari, left, mid - 1);
   - return findBinarySearch(cari, mid + 1, right);
3. - left : batas kiri
   - right : batas kanan
   - mid : titik tengah
4. Tidak bisa bekerja dengan benar, karena binary search butuh data terurut
5. Hasil tidak sesuai

![images](images/633_no5_1.png)

Cara memperbaiki ubah :
![images](images/633_no5_2.png)
6. Data tidak ditemukan
   - Jika left > right
   - Method akan return -1
7. Ubah di MahasiswaDemo17:
![images](images/633_no7_1.png)
![images](images/633_no7_2.png)
![images](images/633_no7_hasil.png)