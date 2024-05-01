package Gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayının pozitif negatif veya sıfır olduğunu yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Sayı giriniz :");
        int number = scan.nextInt();
        if(number<0){
            System.out.println("Sayı negatif");
        } else if (number>0) {
            System.out.println("Sayı pozitif");

        }
        else {
            System.out.println("Sayı sıfır");
        }
    }
}
