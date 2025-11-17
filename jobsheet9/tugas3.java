package jobsheet9;
import java.util.Scanner;
public class tugas3 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino",
            "Chocolate Ice", "Rawut"
        };

        System.out.print("Masukkan nama makanan yang dicari = ");
        String key = sc.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(key)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan \"" + key + "\" tersedia di menu.");
        } else {
            System.out.println("Makanan \"" + key + "\" tidak ada dalam menu.");
        }

        sc.close();
    }
}