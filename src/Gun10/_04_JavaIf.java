package Gun10;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        //giriilen bir sayının tek mi çift mi olduğunu yazdır

        Scanner scan =new Scanner(System.in);
        System.out.print("Sayı giriniz :");

        int number=scan.nextInt();

        if(number%2==0)
        {
            System.out.println("Sayı çift");
        } else
        {
            System.out.println("Sayı tek");
        }
    }
}
