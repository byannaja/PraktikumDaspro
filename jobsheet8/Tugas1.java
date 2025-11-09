package jobsheet8;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan batas n = ");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {
            int jumlah = 0;
            System.out.print("n = " + i + " → jumlah kuadrat = ");

            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                System.out.print(kuadrat);
                jumlah += kuadrat;
                if (j < i) System.out.print(" + ");
            }

            System.out.println(" = " + jumlah);
        }

        sc.close();
    }
}