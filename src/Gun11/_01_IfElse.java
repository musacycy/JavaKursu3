package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //girirlen bir öğrencinin notuna göre 50 den büyük eşit ise geçti diyiniz
        // else tekrar if bloğu çalıştırmayı ve kontrol yapmayı engeller bilgisayarı daha az yorar
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen bir not giriniz :");
        int number=scan.nextInt();

        if(number>=50)
        {
            System.out.println(">Tebrikler geçtiniz");
        }
        else
        {
            System.out.println("Kaldınız");
        }

    }
}
