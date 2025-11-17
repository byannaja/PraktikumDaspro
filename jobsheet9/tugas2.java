package jobsheet9;
 import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan = ");
        int jml = sc.nextInt();
        sc.nextLine();

        String[] nama = new String[jml];
        int[] harga = new int[jml];

        for (int i = 0; i < jml; i++) {
            System.out.print("Nama pesanan ke-" + (i + 1) + " = ");
            nama[i] = sc.nextLine();
            System.out.print("Harga = ");
            harga[i] = sc.nextInt();
            sc.nextLine(); 
        }

        int total = 0;
        for (int i = 0; i < jml; i++) {
            total += harga[i];
        }

        for (int i = 0; i < jml; i++) {
            System.out.println(nama[i] + " " + harga[i]);
        }

        System.out.println("Total biaya = " + total);

        sc.close();
    }
}