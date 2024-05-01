package Gun09;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //kullanıcının gireceği 2 sayının birbirine eşit olup olmadığını yaızınız

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci Sayıyı giriniz :");
        int number1=scan.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        int number2= scan.nextInt();

        System.out.println("Girilen  sayılar birbirine eşit mi :"+(number1==number2));

    }
}
