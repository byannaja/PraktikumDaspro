package jobsheet5;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM PERPUSTAKAAN DAN WIFI KAMPUS ===");
        System.out.print("Apakah punya kartu anggota perpustakaan (true/false): ");
        boolean kartuAnggota = sc.nextBoolean();

        System.out.print("Apakah sudah bayar UKT (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (kartuAnggota && uktLunas) {
            System.out.println("Anda bisa meminjam buku dan memakai WiFi kampus.");
        } else if (kartuAnggota && !uktLunas) {
            System.out.println("Anda hanya bisa meminjam buku, tapi belum bisa pakai WiFi.");
        } else if (!kartuAnggota && uktLunas) {
            System.out.println("Anda bisa memakai WiFi kampus, tapi belum bisa meminjam buku.");
        } else {
            System.out.println("Anda belum bisa memakai fasilitas kampus.");
        }

        System.out.println("\n--- Bagian Kedua ---");
        sc.nextLine(); 

        System.out.println("=== SISTEM AKSES WIFI KAMPUS ===");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        String jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen).");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif).");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12.");
            }
        } else {
            System.out.println("Akses ditolak, hanya untuk civitas akademika.");
        }

        sc.close();
    }
}
