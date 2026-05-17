# Laporan ASD Jobsheet 12

<h4>Nama : Muhammad Nur Rochman<h4>
<h4>NIM : 254107020121<h4>
<h4>Kelas : TI-1E<h4>

## 12.2 Percobaan 1: Operasi Penambahan pada Double Linked List
### 12.2.1 Langkah-Langkah Percobaan

![Images](images/12.2.1_1.png)

![Images](images/12.2.1_2.png)

![Images](images/12.2.1_3.png)

![Images](images/12.2.1_4.png)

### 12.2.2 Verifikasi Hasil Percobaan

![Images](images/12.2.2.png)

### 12.2.3 Pertanyaan
1. - Single Linked List memiliki satu pointer yaitu next yang hanya menunjuk ke node berikutnya sehingga traversal hanya dapat dilakukan dari depan ke belakang.
   - Sedangkan Double Linked List memiliki dua pointer yaitu next dan prev. Pointer next menunjuk node berikutnya, sedangkan prev menunjuk node sebelumnya sehingga traversal dapat dilakukan dua arah, yaitu dari head ke tail maupun dari tail ke head.

2. - next digunakan untuk menyimpan alamat node berikutnya sehingga traversal dapat bergerak maju ke depan.
   - prev digunakan untuk menyimpan alamat node sebelumnya sehingga traversal dapat bergerak mundur ke belakang.

3. Konstruktor pada class DoubleLinkedList digunakan untuk menginisialisasi linked list dalam kondisi kosong dengan memberi nilai null pada head dan tail. Artinya linked list belum memiliki node/data saat pertama kali dibuat.

4. Karena saat linked list kosong dan data pertama ditambahkan, node tersebut  menjadi satu-satunya node di dalam linked list. Oleh sebab itu:
   - head menunjuk node pertama
   - tail juga menunjuk node terakhir

   Karena hanya ada satu node, maka head dan tail harus menunjuk node yang sama.

5. Kode :

   ![Images](images/12.2.3_1.png)

6. Kode : 

   ![Images](images/12.2.3_2.png)

   Hasil :

   ![Images](images/12.2.3_3.png)

## 12.3 Percobaan 2: Operasi Penghapusan pada Double Linked List
### 12.3.1 Langkah-Langkah Percobaan

![Images](images/12.3.1.png)

### 12.3.2 Verifikasi Hasil Percobaan

![Images](images/12.3.2.png)

### 12.3.3 Pertanyaan Percobaan
1. - head = head.next, posisi head dipindahkan dari node pertama ke node setelahnya sehingga node pertama tidak lagi menjadi bagian awal dari linked list.
   - head.prev = null berfungsi untuk memutuskan hubungan balik dari node baru head ke node sebelumnya, agar node tersebut benar-benar menjadi node pertama tanpa referensi ke belakang.
2. Kode :
 
   ![Images](images/12.3.3_1.png)

   Hasil :

   ![Images](images/12.3.3_2.png)

## 12.5 Tugas Praktikum

![Images](images/12.5_1.png)

![Images](images/12.5_2.png)

![Images](images/tugas1.png)

![Images](images/tugas2.png)

![Images](images/tugas3.png)

![Images](images/tugas4.png)

![Images](images/tugas5.png)

![Images](images/tugas6.png)