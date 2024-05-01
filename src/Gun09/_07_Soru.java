package Gun09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //girilen bir sayının tek sayı olup olmadığını yazdırınız

        Scanner scan =new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int number =scan.nextInt();

        int remain=number%2;

        System.out.println("Sayı tek mi :"+(remain==1));



    }
}
