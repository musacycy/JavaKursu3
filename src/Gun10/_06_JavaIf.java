package Gun10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        //Girilen 3 sayıdan en büyük olanını bulunuz

        Scanner scan =new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz :");
        int number1=scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int number2=scan.nextInt();
        System.out.print("Üçüncü sayıyı giriniz :");
        int number3=scan.nextInt();
        int max=number1;
        if(number2>max)
        {
            max=number2;
        }
        if(number3>max){
            max=number3;
        }
        System.out.println("Büyük sayı :"+max);
        /*if(number1>number2)
        {
            if(number1>number3)
            {
                System.out.println("Büyük sayı :"+number1);
            }
            else
            {
                System.out.println("Büyük sayı :"+number3);
            }
        } else if (number2>number3)
        {
            System.out.println("Büyük sayı :"+number2);

        }
        else
        {
            System.out.println("büyük sayı :"+number3);
        }
        ;

         */
        }
}
