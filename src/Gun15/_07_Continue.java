package Gun15;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        //kullanıcıdan 5 sayı isteyiniz
        //bu sayılar dan 6 ile 10 arasındakiler hariç diğerlerini toplayınız
        Scanner scan =new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=5;i++){
            System.out.print("Bir sayı giriniz  :");
            int number=scan.nextInt();
            if(number>6 && number<10)
                continue;

            sum=sum+number;

        }
        System.out.println("toplam sayı :"+sum);
    }
}
