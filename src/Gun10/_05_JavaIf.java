package Gun10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayının birler basamağını yazı ile yazdırınız

        Scanner scan =new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int number =scan.nextInt();
        if(number%10==0)
        {
            System.out.println("birler basamağı sıfır");
        } else if (number%10==1)
        {
            System.out.println("Birler basamağı iki");
        }
          else if (number%10==2)
    {
        System.out.println("Birler basamağı iki");
    }
          else if (number%10==3)
        {
        System.out.println("Birler basamağı üç");
        }
        else if (number%10==4)
        {
            System.out.println("Birler basamağı dört");
        }
        else if (number%10==5)
        {
            System.out.println("Birler basamağı beş");
        }
        else if (number%10==6)
        {
            System.out.println("Birler basamağı altı");
        }
        else if (number%10==7)
        {
            System.out.println("Birler basamağı yedi");
        }
        else if (number%10==8)
        {
            System.out.println("Birler basamağı sekiz");
        }
        else if (number%10==9)
        {
            System.out.println("Birler basamağı dokuz");
        }

    }
}
