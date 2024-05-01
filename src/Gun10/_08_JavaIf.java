package Gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayının birler ve onlar basamağının eşit olup olmadığını yazdırınız

        Scanner scan =new Scanner(System.in);

        System.out.print("bir sayı giriniz :");
        int number =scan.nextInt();
        int birler=number%10;
        int onlar=(number/10)%10;

        if(birler==onlar)
        {
            System.out.println("birler ve onlar eşit");
        }
        else
        {
            System.out.println("birler ve onlar eşit değil");
        }
    }
}
