package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //girilen bir stringin sadece son harfini yazdırınız
        Scanner input = new Scanner(System.in);

        System.out.print("Kelime giriniz :");
        String kelime =input.nextLine();
        int sira =kelime.length();
        System.out.println("Son harf :"+kelime.charAt(sira-1));


    }
}
