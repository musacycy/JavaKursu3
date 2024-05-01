package Gun12;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız
        //kullanıcı bilirse tebrikler yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.print("kaça kadar random sayı oluşsun :");
        int number=scan.nextInt();
        int randomNumber=(int)Math.random()*number;
        System.out.print("tahmin ediniz :");
        int estimate=scan.nextInt();
        if(estimate==randomNumber){
            System.out.println("Tebrikler");
        } else {
            System.out.print("bilemediniz");
        }

        System.out.println((estimate==randomNumber) ? "tebrikler" : "bilemediniz");
    }
}
