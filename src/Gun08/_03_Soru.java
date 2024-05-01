package Gun08;

import java.util.Locale;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //girilien bir stringdeki a harfi sayısını bulunuz

        Scanner scan=new Scanner(System.in);

        System.out.print("Bir string giriniz :");
        String text=scan.next();
        System.out.println("Girilen text :"+text);
        int firsttext=text.length();
        int secondtext=text.toLowerCase(Locale.ROOT).replace("a","").length();
        int result= firsttext-secondtext;

        System.out.println("a ların sayısı = " + result);
    }
}
