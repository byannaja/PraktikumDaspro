package jobsheet12;
import java.util.Scanner;
public class kubus18 {
 public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    int sisi;

        System.out.println("Masukkan sisi: ");
        sisi = input.nextInt();
        
        int volume = volumeKubus(sisi);
        int luasPermukaan = luasPermukaanKubus(sisi);
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
    static int volumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    static int luasPermukaanKubus(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }
}
