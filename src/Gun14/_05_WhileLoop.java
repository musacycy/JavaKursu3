package Gun14;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        //girilen bir sayıya kadar olan sayılardan tek olanları yazdır

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz :");
        int number=scan.nextInt();
        int count=1;
        int sum=0;
        while(count<=number){
            if(count%2==1){
               sum =sum+count;
               count++;
            }
                count++;
        }
        System.out.println("toplam :"+sum);

        while (count<=number){
            sum=sum+count;
            count=count+2;
        }
        System.out.print("toplam :"+sum);
    }
}
