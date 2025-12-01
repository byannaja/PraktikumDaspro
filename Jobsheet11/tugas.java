package Jobsheet11;
import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int kota = 5;
        int hari = 7;
        double[][] suhu = new double[kota][hari];
        
        String[] namaKota = {"Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha"};
        
        for (int i = 0; i < kota; i++) {
            System.out.println("Data suhu untuk kota: " + namaKota[i]);
            for (int j = 0; j < hari; j++) {
                System.out.print("Masukkan suhu hari ke-" + (j + 1) + ": ");
                double tempSuhu = sc.nextDouble();
                suhu[i][j] = tempSuhu;
            }
            System.out.println();
        }
        
        System.out.println("\n=== DATA SUHU SELAMA 7 HARI ===");
        for (int i = 0; i < kota; i++) {
            System.out.print(namaKota[i] + ": ");
            for (int j = 0; j < hari; j++) {
                System.out.print(suhu[i][j] + "°C ");
            }
            System.out.println();
        }
    }
}