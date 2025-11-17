# Jobsheet 9 – Array 1
**Mata Kuliah:** Dasar Pemrograman  
**Topik:** Array Satu Dimensi  
**Nama:** Muammad Abyan Andhi Putra  
**Kelas:** TI 1C

---

# Percobaan 1 – Deklarasi & Inisialisasi Array

## Pertanyaan
1. Apa yang terjadi jika kita menampilkan elemen array yang belum diisi nilainya?  
2. Apa fungsi indeks dalam array?  
3. Apa perbedaan antara deklarasi array dan inisialisasi array?  
4. Apa yang terjadi jika kita mencoba mengakses indeks di luar panjang array?  
5. Mengapa array menggunakan indeks mulai dari 0?

## Jawaban
1. Elemen yang belum diisi akan menampilkan nilai default, misalnya `0` untuk tipe int atau `null` untuk String.  
2. Indeks dipakai untuk menentukan posisi data di dalam array.  
3. Deklarasi hanya membuat tempat penyimpanan array, sedangkan inisialisasi mengisi nilai ke dalam array.  
4. Program akan error karena kita mengakses posisi yang tidak ada di array.  
5. Karena Java memakai sistem indeks yang dimulai dari 0, bukan dari 1.

---

# Percobaan 2 – Mengisi Data Array Menggunakan Input

## Pertanyaan
1. Mengapa diperlukan perulangan untuk mengisi array?  
2. Apa kelebihan menggunakan `array.length` dibandingkan angka tetap seperti `10`?  
3. Apa yang terjadi jika kita lupa menutup Scanner?  
4. Apakah input harus dimasukkan secara berurutan?

## Jawaban
1. Supaya pengisian semua elemen array lebih mudah dan tidak menulis kode berulang-ulang.  
2. `array.length` membuat program lebih fleksibel karena mengikuti ukuran array yang sebenarnya.  
3. Tidak langsung menimbulkan error, tetapi dianggap kurang baik karena Scanner tetap terbuka.  
4. Tidak wajib berurutan, tapi lebih rapi dan mudah dibaca kalau berurutan.

---

# Percobaan 3 – Menghitung Total & Rata-rata Array

## Pertanyaan
1. Mengapa variabel `total` harus mulai dari 0?  
2. Apa fungsi perulangan kedua dalam menghitung total nilai?  
3. Mengapa hasil rata-rata biasanya di-casting ke tipe double?  
4. Apa yang terjadi kalau semua nilai di array 0?

## Jawaban
1. Karena `total` digunakan untuk menampung hasil penjumlahan, jadi awalnya harus 0.  
2. Untuk menjumlahkan semua elemen satu per satu.  
3. Supaya hasil pembagian tidak dibulatkan seperti pada integer.  
4. Totalnya jadi 0 dan rata-ratanya juga 0.

---

# Percobaan 4 – Pencarian Nilai (Linear Search)

## Pertanyaan
1. Bagaimana cara kerja linear search?  
2. Apa fungsi variabel `found`?  
3. Apa yang terjadi kalau nilai yang dicari tidak ada di array?  
4. Kenapa pencarian perlu perulangan?  
5. Apakah nilai yang dicari bisa muncul di lebih dari satu indeks?

## Jawaban
1. Linear search mencari nilai dengan mengecek setiap elemen dari awal sampai akhir.  
2. Untuk menandai apakah nilai yang dicari sudah ditemukan atau belum.  
3. Program akan menampilkan pesan bahwa nilai tidak ditemukan.  
4. Karena elemen array banyak dan harus dicek satu per satu.  
5. Bisa saja, tapi program biasanya hanya mengambil yang pertama karena ada `break`.