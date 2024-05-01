package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan aldığınız iki sayının toplamını giriniz
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen 1.sayıyı giriniz :");

        int number1=input.nextInt();
        System.out.print("Lütfen 2.sayıyı giriniz :");
        int number2=input.nextInt();
        int sum=number1+number2;
        //1.yöntem
        System.out.println("Sayıların toplamı = " + sum);

        //2.yöntem çalışmaz string alır yanyana yazar
        System.out.println("Sayıların toplamı = " +number1+number2 );

        //3.yöntem
        System.out.println("Sayıların toplamı = " +(number1+number2));

    }
}
