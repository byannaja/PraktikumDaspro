# Jobsheet 11 – Array 2
**Nama: Muhammad Abyan Andhi Putra**   
**Kelas: TI 1C**  

---

# 2.1 Percobaan 1  
## Jawaban Pertanyaan

### 1. Apakah pengisian elemen array harus berurutan mulai indeks 0?
Tidak harus. Kita boleh isi elemen mana pun dulu selama indeksnya masih valid. Biasanya diisi dari awal supaya lebih rapi dan mudah dicek.

### 2. Mengapa terdapat null pada daftar nama penonton?
Karena elemen array tersebut belum diisi. Nilai default untuk array String di Java adalah `null`.

### 4. Jelaskan fungsi dari penonton.length dan penonton[0].length  
- `penonton.length` → jumlah baris pada array.  
- `penonton[0].length` → jumlah kolom pada baris pertama.  

Semua baris memiliki kolom berjumlah sama (2 kolom) sehingga penonton[0].length sampai penonton[3].length nilainya sama.

### 10. Kelemahan dan kelebihan foreach dibanding for loop  
- **Kelebihan:** penulisan lebih mudah dan singkat.  
- **Kekurangan:** tidak bisa mengakses indeks secara langsung, jadi kurang fleksibel jika ingin bekerja dengan posisi tertentu.

### 11. Indeks baris maksimal untuk array penonton  
Indeks maksimal = **3**, karena ada 4 baris (0–3).

### 12. Indeks kolom maksimal  
Indeks maksimal = **1**, karena ada 2 kolom (0–1).

### 13. Fungsi dari String.join()  
Untuk menggabungkan beberapa String menjadi satu kalimat dengan pemisah tertentu.

---

# 2.2 Percobaan 2  
## Jawaban Pertanyaan

### 1. Apakah pengisian array dari scanner harus berurutan mulai indeks 0?
Tidak harus. User bebas memilih baris dan kolom mana saja selama masih dalam batas array.

### 4. Warning jika kursi sudah terisi  
Program harus mengecek apakah elemen array pada baris & kolom tersebut sudah ada isinya. Jika sudah terisi, minta user memilih kursi lain.

### 5. Jika kursi kosong, ganti null dengan ***  
Supaya tampilan daftar penonton lebih jelas dan tidak ada tulisan null.

---

# 2.3 Percobaan 3  
## Jawaban Pertanyaan

### 2. Fungsi Arrays.toString()  
Untuk mengubah elemen array menjadi format teks secara otomatis dalam satu baris.

### 3. Nilai default elemen array int  
Default-nya adalah **0**.

### 5. Apakah panjang array bisa diubah setelah dibuat?  
Tidak bisa. Ukuran array bersifat tetap setelah diinstansiasi.

---

# 2.4 Percobaan 4 – SIAKAD  
## Jawaban Pertanyaan

### 1. Jika jumlah siswa dan mata kuliah berubah, apa yang harus dilakukan?
Program harus dibuat **dinamis**, yaitu:  
- jumlah siswa diinput oleh user  
- jumlah mata kuliah diinput oleh user  
- array dibuat berdasarkan ukuran tersebut, misalnya:  

`int[][] nilai = new int[jumlahSiswa][jumlahMatkul];`

Dengan cara ini, program bisa menyesuaikan jumlah data tanpa mengubah kode secara manual.