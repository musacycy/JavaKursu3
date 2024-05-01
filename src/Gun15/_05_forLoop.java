package Gun15;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {
        //girilen bir sayıya kadar olan sayıların çarpımını bulunuz

        Scanner scan =new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int number =scan.nextInt();
        int multip=1;
        for (int i=1;i<=number;i++){
                multip=multip*i;
        }
        System.out.println("result :"+multip);
    }
}
