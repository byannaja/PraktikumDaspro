package jobsheet9;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa = ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + " = ");
            nilai[i] = sc.nextInt();
        }

        int total = 0;
        int maks = nilai[0];
        int min = nilai[0];

        for (int i = 0; i < n; i++) {
            total += nilai[i];
            if (nilai[i] > maks) {
                maks = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        double rata = (double) total / n;

        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\nRata-rata nilai = " + rata);
        System.out.println("Nilai tertinggi = " + maks);
        System.out.println("Nilai terendah  = " + min);

        sc.close();
    }
}