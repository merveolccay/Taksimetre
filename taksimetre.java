package java101;
 import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double kmbasi = 2.20 , total , baslangicdeger = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        total = (km + kmbasi);
        total += baslangicdeger;

        total = (total< 20 ) ? 20 : total;
        System.out.println("Toplam Tutar: " + total);



    }
}
