package Gun13;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        //girilen bir sayının onlar basamağının değerini yazdırınız
        Scanner scan =new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number=scan.nextInt();
        int remain=(number/10)%10;

        switch (remain){
            case 0:
                System.out.println("sıfır");break;
            case 1:
                System.out.println("bir");break;
            case 2:
                System.out.println("iki");break;
            case 3:
                System.out.println("üç");break;
            case 4:
                System.out.println("dört");break;
            case 5:
                System.out.println("beş");break;
            case 6:
                System.out.println("altı");break;
            case 7:
                System.out.println("yedi");break;
            case 8:
                System.out.println("sekiz");break;
            case 9:
                System.out.println("dokuz");break;

        }
    }
}
