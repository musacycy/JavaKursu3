package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı Soyadınızı giriniz :");

        String nameSurname=input.nextLine();

        System.out.println("Hoşgeldiniz " + nameSurname);
    }
}
