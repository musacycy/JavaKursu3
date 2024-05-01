package Gun10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //baklava dilimi :if
        //girilen bir sayının 10dan büyük ise ekrana 10 dan büyük diye yazdır
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number =scan.nextInt();

        if(number>10)
        {
            System.out.println("Gİrilen sayı 10 dan büyük");
        }
        else
        {
            System.out.println("Girilen sayı 10 dan küçük");
        }
    }
}
