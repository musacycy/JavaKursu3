package Gun09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //girilen 3 basamaklı sayının tersi olan sayıyı bulunuz

        Scanner scan =new Scanner(System.in);

        System.out.print("Üç basamaklı sayı giriniz : ");
        int number = scan.nextInt();

        int birler=number%10;
        int onlar=(number/10)%10;
        int yuzler=(number/100);
        int reverse = birler*100+onlar*10+yuzler;
        System.out.println("sayının tersi = " +birler+onlar+yuzler);
    }
}
