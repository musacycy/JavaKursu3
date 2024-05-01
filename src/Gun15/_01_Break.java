package Gun15;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //girilen bir sayının 2  aynı sayının çarpımına eşit olup olmadığını bulunuz

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz :");
        int number=scan.nextInt();
        int count=1;
        int foundNumber=0;
        while(count<=number){
            if(count*count==number){
                foundNumber=count;
                break;
            }
            count++;
        }
        if(foundNumber>0){
            System.out.println("Bulunan sayı :"+foundNumber);
        }
        else
            System.out.println("Bu sayı tam kare değil ");
    }
}
