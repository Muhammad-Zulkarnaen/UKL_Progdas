package UJIANUKL;
import java.util.Scanner;
public class No2Sedang {

    public static void hitung (double phi, int r, int t) {
        System.out.println((phi * r * r * t));
    }
    public static void tampilkan () {
        System.out.println("Volume Tabung Adalah: ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double phi = 3.14;

        System.out.println("phi = 3.14");
        System.out.println("Masukkan r");
        int r = input.nextInt();

        System.out.println("Masukkan t");
        int t = input.nextInt();

        tampilkan();
        hitung(phi, r, t);
    }
}
