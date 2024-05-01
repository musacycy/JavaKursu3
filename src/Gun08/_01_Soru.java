package Gun08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        //ayrı ayrı girilen ad ve soyadı araya bir boşluk bırakarak birleştirin
        String text="+905422170069+905347742804";
        String[] phone=text.split("'+'");
        System.out.println(phone.toString());
        Scanner scan =new Scanner(System.in);
        System.out.print("Adınızı Giriniz :");
        String name=scan.next();
        System.out.print("Soyadınızı giriniz :");
        String surname=scan.next();

        System.out.println("Ad Soyad :"+name.concat(" ").concat(surname));
    }
}
