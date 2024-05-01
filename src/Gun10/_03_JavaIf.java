package Gun10;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //girilen iki sayıdan büyük olanı yazdırın eşitse eşit

        Scanner scan =new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz :");
        int number1=scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int number2=scan.nextInt();

        if(number1>number2)
        {
            System.out.println("büyük sayı :"+number1);
        } else if (number1<number2)
        {
            System.out.println("büyük sayı :"+number2);
        }
        else
        {
            System.out.println("sayılar eşit");
        }
    }
}
