```text
START
INPUT ...
# 🧾 JOBSHEET 5


## Percobaan 3 — Nested IF untuk Ujian Skripsi
> Pertanyaan & Jawaban

1.Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Program langsung menolak pendaftaran karena syarat pertama (bebas kompen) belum terpenuhi, sehingga tidak lanjut memeriksa log bimbingan.

2.Jelaskan maksud potongan kode berikut:

if (bebasKompen.equalsIgnoreCase("ya")) {
    if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
        pesan = "Selamat! Mahasiswa sudah memenuhi syarat.";
    } else {
        pesan = "Gagal! Log bimbingan belum cukup.";
    }
} else {
    pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen.";
}
Kode tersebut memeriksa dua hal:
~ Apakah mahasiswa bebas kompen.
~ Jika ya, apakah jumlah bimbingan P1 ≥ 8 dan P2 ≥ 4.
Jika dua duanya mmenuhi syaratbya maka mahasiswa dinyatakan memenuhi syarat ujian skripsi.
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir?
Cek apakah mahasiswa bebas kompen.
Jika tidak bebas → langsung gagal.
Jika bebas → periksa jumlah log bimbingan pembimbing 1 dan pembimbing 2.
Jika keduanya memenuhi syarat → tampilkan pesan “Selamat!”.
Jika salah satu kurang → tampilkan pesan gagal sesuai kondisi.
END
```