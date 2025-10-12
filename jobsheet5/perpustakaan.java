package jobsheet5;
import java.util.Scanner;

public class perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PERPUSTAKAAN DAN WIFI KAMPUS ===");
        System.out.print("Apakah punya kartu anggota perpustakaan (true/false): ");
        boolean kartuAnggota = sc.nextBoolean();

        System.out.print("Apakah sudah bayar UKT (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (kartuAnggota && uktLunas) {
            System.out.println("Anda bisa meminjam buku dan memakai wifi kampus.");
        } else if (kartuAnggota) {
            System.out.println("Anda hanya bisa meminjam buku, tapi belum bisa pakai wifi.");
        } else if (uktLunas) {
            System.out.println("Anda bisa pakai wifi kampus, tapi belum bisa pinjam buku.");
        } else {
            System.out.println("Anda belum bisa memakai fasilitas kampus.");
        }

        sc.close();
    }
}
