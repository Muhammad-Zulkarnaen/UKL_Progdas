package UJIANUKL;

public class No3Mudah {
    public static void main(String[] args) {
        for (int i = 50; i > 0; i--) {
            if (i %4 == 0) {
                System.out.println(i+". saya angkatan 33");
            }
            else if (i %4 == 2) {
                System.out.println(i+". saya anak moklet");
            }    
            else if (i %4 == 1) {
                System.out.println(i+". saya anak wikusama");
            }
            else {
                System.out.println(i+". saya senang ");
            }
        }
    }
}