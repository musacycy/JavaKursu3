package Gun08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //girilen bir stringin ilk ve son harfini yazdırın

        Scanner scan =new Scanner(System.in);

        System.out.print("bir string giriniz :");

        String text =scan.next();
        System.out.println("ilk har :"+text.charAt(0));
        System.out.println("son harfi :"+text.charAt(text.length()-1));
    }
}
