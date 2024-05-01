package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //Karenin bir kenarını kullanıcıdan isteyip çevresini ve alanını bulunuz

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen karenin kenarını giriniz :");
        int side=input.nextInt();

        System.out.println("Karenin çevresi :"+(4*side));
        System.out.println("Karenin alanı :"+(side*side));


    }
}
