package Gun11;

import java.util.Locale;
import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        //girilen yeni bir passwordun kurallara uygunluğunu kontrol edin
        //kurallar:
        //en az 8 karakter olmalı
        //içinde pass kelimesi olmamalı
        //en fazla 12 karakter olmalı
        // bir ifadenin başına ünlem işareti konulursa o ifadenin değilini alır
        // text.contains("pass") bu ifade text içinde pass geçiyorsa true  demek
        // !text.contains("pass") bu ifade geçmiyorsa true demek
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen parolatı girin :");
        String text=scan.nextLine();
        int number=text.length();
        if(number>=8 && number <=12 && text.toLowerCase(Locale.ROOT).contains("pass")==false)
        {
            System.out.println("Girilen parola uygun");
        }
        else{
            System.out.println("girilen parola uygun değil");
        }
    }
}
