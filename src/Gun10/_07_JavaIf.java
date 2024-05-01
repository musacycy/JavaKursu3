package Gun10;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        //girilen bir öğrencinin notuna göre 50 den büyük eşit ise geçti diyiniz

        Scanner scan =new Scanner(System.in);
        System.out.print("Notunuzu giriniz :");
        int number1=scan.nextInt();

        if(number1>=50)
        {
            System.out.println("geçtiniz");
        }
        else
        {
            System.out.println("Kaldınız");
        }
    }
}
