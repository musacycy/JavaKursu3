package Gun07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        // Girilen bir stringteki nokta sayısını bulunuz

        Scanner scan =new Scanner(System.in);
        System.out.print("Bir değer giriniz :");
        String text = scan.nextLine();
        int firstText=text.length();
        System.out.println("ilk text uzunluğu :"+firstText);
        String text2=text.replace(".","");
        System.out.println(". lar çıkmış hali : "+text2);
        int secondText=text2.length();
        System.out.println("ikinci textin uzunluğu :"+secondText);
        int result=firstText-secondText;
        System.out.println(" . ların sayısı  = " + result);


    }
}
