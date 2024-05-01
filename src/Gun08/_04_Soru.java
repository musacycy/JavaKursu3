package Gun08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //girilen şifre sizin istediğiniz kelimeye eşit mi

        Scanner scan =new Scanner(System.in);

        String secretPassword="bayrak";

        System.out.print("Şifreyi giriniz :");
        String text=scan.next();

        System.out.println("Girilen şifre gizli şifreyle eşleşiyor mu :"+text.equals(secretPassword));
    }
}
