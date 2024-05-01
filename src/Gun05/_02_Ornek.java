package Gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        //Girilen bir adı ekrana yazdırın
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz: ");

        String name = input.next();// next() kelime okumak için

        System.out.println("Hoşgeldiniz " + name);
    }
}
