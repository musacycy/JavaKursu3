package Gun11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int number = scan.nextInt();

        if(number%2==0)
        {
            System.out.println("Girilen sayı çift");
        }
        else {
            System.out.println("Girilen sayı tek ");
        }
    }
}
