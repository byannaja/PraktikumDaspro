# Jobsheet 8 – Perulangan 2
**Mata Kuliah:** Dasar Pemrograman  
**Topik:** Perulangan Bersarang (Nested Loop)  
**Nama:** Muhammad Abyan Andhi Putra
**Kelas:** TI/1C  

---

## Percobaan 1 – Menampilkan Karakter Bintang Secara Horizontal

### Pertanyaan
1. Apa yang terjadi jika nilai awal `i` diubah menjadi 0?  
2. Apa yang terjadi jika kondisi perulangan diubah menjadi `i < n`?  
3. Apa yang terjadi jika kondisi diubah menjadi `i > n`?  
4. Apa yang terjadi jika operator `i++` diubah menjadi `i--`?  
5. Apa yang terjadi jika increment `i` diubah menjadi `i += 2`?

### Jawaban
1. Loop mencetak n + 1 bintang, karena perulangan dimulai dari 0.  
2. Loop mencetak n – 1 bintang, karena batas atas menjadi lebih kecil.  
3. Tidak akan mencetak apa pun karena kondisi awal langsung **false**.  
4. Loop bisa menjadi infinite atau tidak berjalan sama sekali tergantung kondisi awal.  
5. Hanya mencetak bintang dengan kelipatan 2, misalnya 3 bintang jika n=6 (i=1,3,5).

---

## Percobaan 2 – Menampilkan Persegi Bintang

### Pertanyaan
1. Apa yang terjadi jika `iOuter` diinisialisasi 0?  
2. Apa yang terjadi jika `i` diinisialisasi 0?  
3. Apa fungsi perulangan luar (`iOuter`)?  
4. Apa fungsi `System.out.println()` setelah perulangan dalam?

### Jawaban
1. Persegi akan memiliki baris lebih banyak (N+1 baris).  
2. Setiap baris akan memiliki kolom lebih banyak (N+1 bintang).  
3. Perulangan luar berfungsi untuk mengatur jumlah baris.  
4. `println()` digunakan untuk pindah ke baris baru setelah inner loop selesai.

---

## Percobaan 3 – Menampilkan Segitiga Bintang

### Pertanyaan
1. Apa yang terjadi jika variabel `j` tidak di-reset ke 1 di dalam perulangan luar?  
2. Apa fungsi variabel `i` dan `j` dalam program tersebut?

### Jawaban
1. Tanpa reset `j = 1`, inner loop tidak akan berulang dengan benar di setiap baris — hasilnya salah.  
2. `i` menentukan baris ke-berapa, sedangkan `j` menentukan jumlah bintang di baris tersebut.

---

## Percobaan 4 – Nilai Kelompok dan Rata-rata

### Pertanyaan
1. Mengapa variabel `totalNilai` diinisialisasi (total = 0) di dalam perulangan luar?  
2. Bagaimana cara mencari kelompok dengan nilai rata-rata tertinggi?

### Jawaban
1. Karena setiap kelompok harus menghitung total baru, jika di luar loop, nilainya akan menumpuk dari kelompok sebelumnya.  
2. Dengan membandingkan setiap rata-rata dan menyimpan nilai maksimum serta indeks kelompok tertinggi.

---
