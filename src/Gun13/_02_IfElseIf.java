package Gun13;

import java.util.Locale;
import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        //girilen 2 tam sayıyı kullanıcıdan aldıktan sonra
        //toplama için t çıkarma için ç çarpma için p bölme için b
        //harflerini alarak isteğe uygun alan işlemi yaptırp 

        Scanner scan =new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz :");
        int number1= scan.nextInt();
        System.out.print("2.Sayıyı giriniz :");
        int number2= scan.nextInt();
        System.out.print("işlemi giriniz : Toplama(T) Çıkarma(Ç) Çarpma (P) Bölme(B) =>");
        String text=scan.next();
        if(text.toLowerCase(Locale.ROOT).equalsIgnoreCase("t")){
            int result=number1+number2;
            System.out.println("result = " + result);
        } else if (text.toLowerCase().equalsIgnoreCase("ç")) {
            int result=number1-number2;
            System.out.println("result = " + result);
        } else if (text.toLowerCase(Locale.ROOT).equalsIgnoreCase("p")) {
            int result=number1*number2;
            System.out.println("result = " + result);
        } else if (text.toLowerCase(Locale.ROOT).equalsIgnoreCase("b")) {
            int result=number1/number2;
            System.out.println("result = " + result);
        }

    }
}
