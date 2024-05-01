package Gun12;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //Kullanıcının gireceği sayı çift ise bir stringe çift atayınız tek se tek ekrana yazdır

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giiriniz :");
        int number = scan.nextInt();

        //if(number%2==0){
          //  String text="çift";
           // System.out.println(text);
      //  }
        //else{
          //  String text="tek";
            //System.out.println(text);
        //}
        //tek satırda yazma yöntemi Ternary
        String result=(number%2==1) ? "tek" : "çift";
        System.out.println(result);
    }
}
