package Gun12;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        //girilen sayı 50 den büyük ise 1 küçük ise 0 yazdırın
        // ternary ile
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int number=scan.nextInt();

        int result=(number<50) ? 0 : 1;
        System.out.println(result);
    }
}
