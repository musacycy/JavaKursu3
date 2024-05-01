package Gun08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //girilen bir cümledeki ilk kelimeyi yazdırınız

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cümle giriniz :");
        String text=scan.nextLine();

        System.out.println("ilk kelime :"+text.substring(0,text.indexOf(" ")));
    }
}
