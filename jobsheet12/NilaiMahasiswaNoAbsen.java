package jobsheet12;

import java.util.Scanner;

public class NilaiMahasiswaNoAbsen {

    static void isianArray(int[] arr, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] arr) {
        for (int nilai : arr) {
            System.out.println(nilai);
        }
    }

    static int hitTot(int[] arr) {
        int total = 0;
        for (int nilai : arr) {
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nilai = new int[N];

        isianArray(nilai, N, sc);
        tampilArray(nilai);

        int totalNilai = hitTot(nilai);
        System.out.println(totalNilai);

        sc.close();
    }
}