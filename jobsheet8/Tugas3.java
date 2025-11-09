package jobsheet8;
import java.util.Scanner;
public class Tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang kafe = ");
        int cabang = sc.nextInt();

        int totalPelangganSemua = 0;
        int totalItemSemua = 0;

        System.out.println();

        for (int i = 1; i <= cabang; i++) {
            System.out.println("Cabang ke-" + i);

            System.out.print("Masukkan jumlah pelanggan hari ini = ");
            int pelanggan = sc.nextInt();

            int totalItemCabang = 0; 
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("  Jumlah item yang dibeli pelanggan ke-" + j + " = ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Total item di Cabang ke-" + i + " = " + totalItemCabang);
            System.out.println();

            totalPelangganSemua += pelanggan;
            totalItemSemua += totalItemCabang;
        }

        System.out.println("==================================");
        System.out.println("Total seluruh pelanggan = " + totalPelangganSemua);
        System.out.println("Total seluruh item = " + totalItemSemua);
        System.out.println("==================================");

        sc.close();
    }
}