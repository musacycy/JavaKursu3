package Gun12;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        //maath max ile girilen 3 sayının büyük olanını bulunzu

        Scanner scan= new Scanner(System.in);
        System.out.print("1. Sayı giriniz :");
        int number1=scan.nextInt();
        System.out.print("1. Sayı giriniz :");
        int number2=scan.nextInt();
        System.out.print("1. Sayı giriniz :");
        int number3=scan.nextInt();
        int maxValue=Math.max(number1,number2);
        int maxValue2=Math.max(number3,maxValue);
        System.out.println("Büyük sayı :"+maxValue2);
    }
}
