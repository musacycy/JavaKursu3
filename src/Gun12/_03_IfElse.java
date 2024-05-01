package Gun12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // ototpark ücretleri 3 saate kadar 10 tl
        // 5saate kadar 15 tl 10 saate kadar 20 tl
        // kullanıcının kaç saat aldığını alaarak hesapla
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen kaç saat  kaldığınızı giriniz :");
        int time=scan.nextInt();

        if(time<3){
            System.out.println("Ödemeniz gereken tutar 10 TL");
        } else if (time<5) {
            System.out.println("Ödemeniz gereken tutar 15 TL");

        } else if (time<10) {
            System.out.println("Ödemeniz gereken tutar 20 TL");

        }
    }
}
