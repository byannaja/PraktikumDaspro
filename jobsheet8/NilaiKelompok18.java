package jobsheet8;

import java.util.Scanner;

public class NilaiKelompok18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_KELOMPOK = 6;
        final int NUM_PENILAI = 5;

        double[] rata = new double[NUM_KELOMPOK + 1];
        for (int k = 1; k <= NUM_KELOMPOK; k++) {
            System.out.println("Masukkan 5 nilai untuk Kelompok " + k + " = ");            int totalNilai = 0;
            for (int j = 1; j <= NUM_PENILAI; j++) {
                System.out.print("  Nilai penilai " + j + " = ");
                int nilai = sc.nextInt();
                if (nilai < 0) nilai = 0;
                if (nilai > 100) nilai = 100;
                totalNilai += nilai;
            }
            rata[k] = (double) totalNilai / NUM_PENILAI;
            System.out.printf("Rata-rata Kelompok %d = %.2f%n%n", k, rata[k]);
        }

        double maxRata = rata[1];
        int idxMax = 1;
        for (int k = 2; k <= NUM_KELOMPOK; k++) {
            if (rata[k] > maxRata) {
                maxRata = rata[k];
                idxMax = k;
            }
        }

        System.out.printf("Kelompok dengan rata-rata tertinggi: Kelompok %d (%.2f)%n", idxMax, maxRata);
        sc.close();
    }
}