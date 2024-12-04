package UJIANUKL;
import java.util.Random;
import java.util.Scanner;
public class No3Sedang {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random acak = new Random();

        String lagi;
        double jawabanBenar = 0;
        String operatorTanda = "";
        
        do {
            int angka1 = acak.nextInt(6) + 10;
            int angka2 = acak.nextInt(5) + 1;

            int operator = acak.nextInt(6);

            switch (operator) {
                case 0:
                    operatorTanda = "*";
                    jawabanBenar = angka1 * angka2;
                    break;
                case 1:
                    operatorTanda = "/";
                    jawabanBenar = angka1 / angka2;
                    break;
                case 2:
                    operatorTanda = "%";
                    jawabanBenar = angka1 % angka2;
                    break;
                case 3:
                    operatorTanda = "+";
                    jawabanBenar = angka1 + angka2;
                    break;
                case 4:
                    operatorTanda = "-";
                    jawabanBenar = angka1 - angka2;
                    break;
                case 5:
                    operatorTanda = "^";
                    jawabanBenar = Math.pow(angka1, angka2);
                    break;
            }
            
            System.out.println("Soal: "+ angka1 + "" + operatorTanda + "" + angka2 + " = ?");

            System.out.println("Jawab: ");
            double jwb = input.nextDouble();

            if (jwb == jawabanBenar) {
                System.out.println("Jawaban Benar!");
            } else {
                System.out.println("Jawaban salah! Jawaban yang benar adalah: "+ jawabanBenar);
            }

            System.out.println("Apakah Anda ingin melanjutkan? (y/t): ");
            lagi = input.next();

        } while (lagi.equalsIgnoreCase("y"));

        input.close();
        System.out.println("Terima kasih telah bermain kuis!");

    }
}
