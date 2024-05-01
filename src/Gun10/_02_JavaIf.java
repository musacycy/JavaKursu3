package Gun10;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayının negatif mi pozitif mi olduğunu yazdırın
        // sıfırsa sıfır yazdırın
        Scanner scan =new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number =scan.nextInt();
        if (number<0)
        {
            System.out.println("Sayı negatif");
        }
        else if(number>0)
        {
            System.out.println("Sayı pozitif");
        }
        else
        {
            System.out.println("Sayı sıfır");
        }
    }
}
