package Gun14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        //kullanıcı 0 değeri girene kadar sayıların toplamını bulun
        Scanner scan =new Scanner(System.in);
        System.out.print("lütfen sayı giriniz :");
        int number=scan.nextInt();

        int sum=0;
        while (number!=0){
            sum=sum+number;
            System.out.print("lütfen sayı giriniz :");
            number =scan.nextInt();
        }
        System.out.println("toplam :"+sum);


        //2.yol
        sum=0;
        do{
            System.out.print("sayı giriniz :");
            number=scan.nextInt();
            sum=sum+number;
        }while(number!=0);
        System.out.println("toplam :"+sum);

    }
}
