package Gun11;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {
        //mantıksal(logic)ifadeler
        //&& and      ||  or
        //girilen sayı pozitif ve tek ise ekrana uygun sayı girildi yazdırın
        Scanner scan =new Scanner(System.in);

        System.out.print("Lütfen sayı giriniz :");
        int number=scan.nextInt();

        if(number>0 && number%2==1){
            System.out.println("Uygun sayı girildi");
        }
        else {
            System.out.println("Uygun sayı girilmedi ");
        }
    }
}
