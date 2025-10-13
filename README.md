# 🧾 JOBSHEET 5


## 🧪 Percobaan 1 — IF dan IF-ELSE untuk Cetak KRS  

> **Pertanyaan & Jawaban**

1. **Mengapa pengecekan pada struktur IF tidak melibatkan operator relasional?**  
   Karena variabel `uktLunas` bertipe boolean (true/false), sehingga tidak perlu menggunakan operator relasional seperti `==`, `>`, atau `<`.

2. **Saat program dijalankan dan Anda mengisikan nilai false, bagaimana hasilnya?**  
   Program akan menjalankan blok `else` dan menampilkan pesan bahwa registrasi ditolak karena UKT belum lunas.

3. **Bagaimana menampilkan pesan “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”?**  
   Tambahkan struktur `else` seperti berikut:  
   ```java
   if (uktLunas) {
       System.out.println("Pembayaran UKT terverifikasi. Silakan cetak KRS.");
   } else {
       System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
   }
