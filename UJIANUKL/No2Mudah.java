package UJIANUKL;
import java.util.Scanner;
public class No2Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Masukkan batas atas");
        int batasAtas = input.nextInt();

        System.out.println("Masukkan batas bawah");
        int batasBawah = input.nextInt();

        System.out.println("---------------");

        for (int i = batasBawah; i <= batasAtas; i++){

            if (i %2 == 0) {
                System.out.println(i+" Genap");
            } else {
                System.out.println(i+" Ganjil");
            }
        
        }
    }
}
