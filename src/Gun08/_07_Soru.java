package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //girilen bir cümledeki ilk iki kelimeyi yazdırınız

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle giriniz :");

        String text = scan.nextLine();

        int indexFirst =text.indexOf(" ");
        int indexSecon =text.indexOf(" ",indexFirst+1);

        System.out.println("birinci kelime :"+text.substring(0,indexFirst));
        System.out.println("ikinci kelime :"+text.substring(indexFirst,indexSecon));

    }
}
